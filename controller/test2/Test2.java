package designpatterns.controller.test2;

import designpatterns.controller.test2.InputHandler.Button;

public class Test2 {

	public static void main(String[] args) {
		// In this example we're creating commands for the protagonist of a game, and linking them to different buttons.
		// Unlike the example on test1, we're not tieing the command itself with the receiver object, so we can use it in any other character
		// This example is better explained in Bob Nystrom's book, so go take a look

		//The receiver
		Actor myCharacter = new Protagonist(); // This can be any subclass of an actor from the game itself

		//The invoker
		InputHandler inputHandler = new InputHandler();

		//The concrete commands
		Command jumpCommand = new JumpCommand();
		Command crouchCommand = new CrouchCommand();
		Command shootCommand = new ShootCommand();

		//Wiring buttons with commands:
		inputHandler.setButtonX(jumpCommand);
		inputHandler.setButtonY(shootCommand);

		inputHandler.execute(Button.BUTTON_X, myCharacter);
		inputHandler.execute(Button.BUTTON_Y, myCharacter);

		//The player wanted to reassign the buttons:
		inputHandler.setButtonX(crouchCommand);
		inputHandler.setButtonY(jumpCommand);

		inputHandler.execute(Button.BUTTON_X, myCharacter);
		inputHandler.execute(Button.BUTTON_Y, myCharacter);
	}

}
