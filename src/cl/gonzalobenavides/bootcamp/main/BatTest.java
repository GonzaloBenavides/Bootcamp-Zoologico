package cl.gonzalobenavides.bootcamp.main;

import cl.gonzalobenavides.bootcamp.animals.Bat;
import cl.gonzalobenavides.bootcamp.animals.Gorilla;
import cl.gonzalobenavides.bootcamp.animals.Mammal;

public class BatTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======BAT TEST=======");

		Bat bat = new Bat();
		System.out.println("===========Murciélago gigante Bat===========");
		bat.displayEnergyLevel();
		bat.attackTown();
		bat.attackTown();
		bat.attackTown();
		bat.displayEnergyLevel();
		bat.eatHumans();
		bat.eatHumans();
		bat.displayEnergyLevel();
		bat.fly();
		bat.fly();
		bat.displayEnergyLevel();
		
	}

}
