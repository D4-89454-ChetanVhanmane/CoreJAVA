package com.app.fruits;

public class Utility {
	void displayName(Fruit[] f) {
		System.out.println("Following are the name of the Fruits: ");

		for (Fruit fruit : f) {
			if (fruit != null) {
				System.out.println(fruit.getName());
			} else {
				break;
			}
		}
		System.out.println("-------------------------------------------");
	}

	void displayDetails(Fruit[] f) {
		System.out.println("Following are the Details of the Fruits: ");
		for (Fruit fruit : f) {
			if (fruit != null) {
				System.out.println("-------------------------------------------");

				System.out.println("Name : " + fruit.getName());
				System.out.println("Weight : " + fruit.getWeight());
				System.out.println("Colour : " + fruit.getColor());
				System.out.println("Fresh : " + fruit.isFresh());
				System.out.println("-------------------------------------------");
			} else {
				break;
			}
		}
	}

	void displayTest(Fruit[] f) {
		System.out.println("Following are the name of the Fruits: ");
		for (Fruit fruit : f) {
			if (fruit != null) {
				if(fruit instanceof Apple) {
					Apple apple = (Apple) fruit;
					System.out.println("Apple is : "+apple.taste());
					
				}else if(fruit instanceof Orange) {
					Orange orange = (Orange) fruit;
					System.out.println("Orange is : "+orange.taste());
					
				}else if(fruit instanceof Mango) {
					Mango mango = (Mango) fruit;
					System.out.println("Mango is : "+ mango.taste());
					
					
				}
			} else {
				break;
			}
		}
		System.out.println("-------------------------------------------");
	}
//	void markStail() {
//		
//	}
}
