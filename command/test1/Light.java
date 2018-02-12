package designpatterns.command.test1;

//The Receiver
public class Light {

	private boolean isOn;

	public Light(){
		this.isOn = false;
	}

	public void on(){
		this.isOn = true;
	}

	public void off(){
		this.isOn = false;
	}

	@Override
	public String toString() {
		String res;
		if(isOn){
			res = "The light is on";
		}
		else{
			res = "The light is off";
		}
		return res;
	}
}
