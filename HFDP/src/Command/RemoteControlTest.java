package Command;

public class RemoteControlTest {
	
	public static void main(String[] args){
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(garageDoor);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		remote.setCommand(doorOpen);
		remote.buttonWasPressed();

		LightOffCommand lightOff = new LightOffCommand(light);
		GarageDoorCloseCommand doorClose = new GarageDoorCloseCommand(garageDoor);
		
		
		remote.setCommand(lightOff);
		remote.buttonWasPressed();
		
		remote.setCommand(doorClose);
		remote.buttonWasPressed();
		
	}

}
