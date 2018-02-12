package designpatterns.command.test2;

public class InputHandler {

	public enum Button {
		BUTTON_X,
		BUTTON_Y
	}

	private Command buttonX;
	private Command buttonY;

	public void setButtonX(Command commandForButtonX) {
		this.buttonX = commandForButtonX;
	}

	public void setButtonY(Command commandForButtonY) {
		this.buttonY = commandForButtonY;
	}

	public void execute(Button button, Actor actor){
		switch (button) {
			case BUTTON_X:
				buttonX.execute(actor);
				break;
			case BUTTON_Y:
				buttonY.execute(actor);
				break;
			default:
				//invalid button
				break;
		}
	}
}
