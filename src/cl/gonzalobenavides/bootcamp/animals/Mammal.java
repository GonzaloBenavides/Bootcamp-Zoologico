package cl.gonzalobenavides.bootcamp.animals;

public class Mammal {
	private int energyLevel;

	public int displayEnergyLevel() {
		System.out.println("Su nivel de energía es: " + energyLevel);
		return energyLevel;
	}
	
	public Mammal() {
	}
	
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	
}
