package inheritanceTest;

public class Motorbike extends Bike{
	private String transmissonType;
	
	public Motorbike(int numWheels, String bikeType, String transmissonType) {
		super(numWheels,bikeType);
		this.transmissonType = transmissonType;
	}
	
	public String getTransmissonType() {
		return transmissonType;
	}
}
