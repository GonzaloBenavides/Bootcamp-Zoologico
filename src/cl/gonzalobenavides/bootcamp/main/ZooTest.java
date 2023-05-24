package cl.gonzalobenavides.bootcamp.main;

import cl.gonzalobenavides.bootcamp.animals.Gorilla;
import cl.gonzalobenavides.bootcamp.animals.Mammal;

public class ZooTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======ZOO TEST=======");
//		
//		Mammal mamifero = new Mammal();
//		mamifero.displayEnergyLevel();

/*		Gorilla g1 = new Gorilla();
		g1.displayEnergyLevel();
		g1.throwSomething();
		g1.throwSomething();
		g1.displayEnergyLevel();

		g1.eatBanana();
		g1.displayEnergyLevel();
		System.out.println("\n");
*/
		Gorilla dK = new Gorilla(100);
		System.out.println("===========Gorilla DK===========");
		dK.displayEnergyLevel();
		dK.throwSomething();
		dK.throwSomething();
		dK.throwSomething();
		dK.displayEnergyLevel();
		dK.eatBanana();
		dK.displayEnergyLevel();
		dK.climb();
		dK.eatBanana();
		dK.displayEnergyLevel();
		
	}

}
