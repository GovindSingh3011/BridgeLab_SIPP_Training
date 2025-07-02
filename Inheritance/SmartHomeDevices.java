class Device{
	int deviceId;
	String status="Good";
}

class Thermostat extends Device{
	String temperatureSetting="C";
	
	void displayStatus(){
		System.out.println("Device ID.: "+deviceId);
		System.out.println("Status "+status+"\t Setting "+temperatureSetting);
	}
	
}

public class SmartHomeDevices {
	public static void main(String[] agrs) {
		Thermostat thermo =new Thermostat();
		
		thermo.displayStatus();
	}
}
