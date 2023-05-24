package cl.gonzalobenavides.bootcamp.animals;

import java.util.Random;

public class Bat extends Mammal{
	
	final String[] ciudad = {"Valparaíso", "Santiago", "Manhattan", "New York", "Concepción", "Talca", "Buenos Aires", "Lima", "Tokyo"};
	final String[] humano = {"al presidente","a un desarrollador de software","a un policía","a un hombre disfrazado de gorilla","al cuidador del zoológico","a un guerrero","a Mario Bros"};
	
	
	public Bat() {
		setEnergyLevel(300);
	}
	
	public Bat(int energy) {
		super(energy);
	}
	
	public void eatHumans() {
		Random rand = new Random();
		System.out.println("El Murciélago se comió "+ humano[rand.nextInt(0,humano.length-1)] + "!");
		System.out.println("Bueno, no importa");
		super.setEnergyLevel(getEnergyLevel()+25);
	}
	
	public void attackTown() {
		Random rand = new Random();
		System.out.println("*flap flap* *boom* *skreech* *bam* *flap flap*");
		System.out.println("El Murciélago atacó "+ ciudad[rand.nextInt(0,ciudad.length-1)] + "!");
		super.setEnergyLevel(getEnergyLevel()-100);
	}
	
	public void fly() {
		System.out.println("*flap flap* *flap flap flap*");
		System.out.println("El murciélago vuela!");
		super.setEnergyLevel(getEnergyLevel()-50);
	}
	
}
