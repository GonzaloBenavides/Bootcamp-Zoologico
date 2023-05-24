package cl.gonzalobenavides.bootcamp.animals;

import java.util.Random;

public class Gorilla extends Mammal{
	
	final String[] objeto = {"una banana","una piel de banana","un caparazón de tortuga","un barril","una rama","un palo","un tronco","al cuidador","caca","una piedra","a otro gorilla"};
	
	
	public Gorilla() {
	}
	
	public Gorilla(int energy) {
		super(energy);
	}
	
	public void throwSomething() {
		Random rand = new Random();
		System.out.println("El Gorilla lanzó "+ objeto[rand.nextInt(0,objeto.length-1)]);
		super.setEnergyLevel(getEnergyLevel()-5);
	}
	
	public void eatBanana() {
		System.out.println("El Gorilla comió una banana: 'MmmMmm banana!'");
		super.setEnergyLevel(getEnergyLevel()+10);
	}
	
	public void climb() {
		System.out.println("El Gorilla trepó hasta la copa de un árbol!");
		super.setEnergyLevel(getEnergyLevel()-10);
	}
	
}
