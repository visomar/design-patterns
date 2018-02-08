package designpatterns.builder.test2;

public class Radio extends Device {
	private int antennaLength;

	public Radio(Builder builder){
		super(builder);
		this.antennaLength = builder.antennaLength;
	}

	public int getAntennaLength() {
		return antennaLength;
	}

	public static class Builder extends Device.MasterBuilder<Builder>{
		private int antennaLength;

		protected Builder(){
			//Include forced attributes
		}

		@Override
		public Radio build() {
			return new Radio( this );
		}

		public Builder withAntennaLength(int antennaLength){
			this.antennaLength = antennaLength;
			return this;
		}
	}
}
