package designpatterns.builder.test2;

public class Mobile extends Device {
	private String serviceCompany;

	public Mobile(Builder builder){
		super(builder);
		this.serviceCompany = builder.serviceCompany;
	}

	public String getServiceCompany() {
		return serviceCompany;
	}

	public static class Builder extends Device.MasterBuilder<Builder>{
		private String serviceCompany;

		protected Builder(){
			//Include forced attributes
		}

		@Override
		public Mobile build() {
			return new Mobile( this );
		}

		public Builder withServiceCompany(String serviceCompany){
			this.serviceCompany = serviceCompany;
			return this;
		}
	}
}
