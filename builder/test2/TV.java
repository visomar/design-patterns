package designpatterns.builder.test2;

public class TV extends Device {
	private boolean hasSmartTv;

	public TV(Builder builder){
		super(builder);
		this.hasSmartTv = builder.hasSmartTv;
	}

	public boolean hasSmartTv() {
		return this.hasSmartTv;
	}

	public static class Builder extends Device.MasterBuilder<Builder>{
		private boolean hasSmartTv;

		protected Builder(){
			//Include forced attributes
		}

		@Override
		public TV build() {
			return new TV( this );
		}

		public Builder withSmartTv(boolean hasSmartTv){
			this.hasSmartTv = hasSmartTv;
			return this;
		}
	}
}
