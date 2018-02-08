package designpatterns.builder.test2;

public class Test2 {

	public static void main(String[] args) {

		Mobile mobile = new Mobile.Builder()
				.withType( DeviceType.MOBILE )
				.withModelName( "Samsung" )
				.withServiceCompany( "AT&T" )
				.build();

		TV tv = new TV.Builder()
				.withType( DeviceType.TV )
				.withModelName( "Sony" )
				.withSmartTv( true )
				.build();

		Radio radio = new Radio.Builder()
				.withType( DeviceType.RADIO )
				.withModelName( "Phillips" )
				.withAntennaLength( 10 )
				.build();

		System.out.printf("I've got a %s %s with %s%n",mobile.getModelName(), mobile.getType(), mobile.getServiceCompany());
		System.out.printf("Does my %s %s have SmartTV? %b%n",tv.getModelName(), tv.getType(), tv.hasSmartTv());
		System.out.printf("The antenna of my %s %s is %d cm long%n",radio.getModelName(), radio.getType(), radio.getAntennaLength());
	}

}
