package designpatterns.builder.test2;

public class Device {
	private DeviceType type;
	private String modelName;

	public Device(MasterBuilder builder){
		type = builder.type;
		modelName = builder.modelName;
	}

	public DeviceType getType() {
		return type;
	}

	public String getModelName() {
		return modelName;
	}

	public static class MasterBuilder<T extends MasterBuilder<T>>{
		private DeviceType type;
		private String modelName;

		protected MasterBuilder(){
			//Include forced attributes
		}

		public Device build(){
			return new Device( this );
		}

		public T withType(DeviceType type) {
			this.type = type;
			return (T) this;
		}
		public T withModelName(String modelName) {
			this.modelName = modelName;
			return (T) this;
		}
	}
}
