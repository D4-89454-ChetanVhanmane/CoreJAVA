package com.app.fruits;

import java.util.Scanner;

//Q1) Apply inheritance n polymorphism
//a) Arrange Fruit, Apple, Orange, Mango in inheritance hierarchy
//b) Properties (instance variables) : color: String, weight : double , name: String, isFresh:
//boolean
//c) Add suitable constructors.
//d) Override toString correctly to return state of all fruits (including: name ,color , weight )
//e) Add a taste() method : public String taste() which will be an abstract method
//Apple: should return "sweet and sour”
//Mango: should return "sweet"
//Orange: should return "sour"
//f) Add all of above classes under the package "com.app.fruits"
//g) Create a Class FruitBasket , with main method inside it. Use it for testing
//h) Prompt user for the basket size n create suitable data structure and give options
//0. Exit
//1. Add Mango
//boundary checking
//basket [counter++]=new
//Mango(nm, weight, color); break;
//2. Add Orange
//3. Add Apple
//NOTE: You will be adding a fresh fruit in the basket, in all of above options.
//4. Display names of all fruits in the basket. eg : for-each --- null checking --getName()
//5. Display name, color, weight, taste of all fresh fruits, in the basket. eg : for-each , null checking --toString , taste, isFresh: getter
//6. Display tastes of all stale (not fresh) fruits in the basket.
//7. Mark a fruit as stale i/p : index
//Eg: setter : isFresh : false
//O/P: error message (in case of invalid index) or mark it stale.
//8. Mark all sour fruits stale (optional) eg : for-each , taste --equals(String
public class FruitBasket {
	static Scanner sc = new Scanner(System.in);

	public static int menu() {
		System.out.println("0. Exit");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display names of all fruits in the basket.");
		System.out.println("5. Display name, color, weight, taste of all fresh fruits, in the basket.");
		System.out.println("6. Display tastes of all stale (not fresh) fruits in the basket.");
		System.out.println("7. Mark a fruit as stale i/p : index");
		System.out.println("8. Mark all sour fruits stale (optional)");
		System.out.println();
		System.out.println("Enter your chooise : ");
		return sc.nextInt();
	}

	public static void main(String args[]) {
		int n = 0, chooise = 0, i = 0;
		System.out.println("Enter How many number of Fruits you want to Buy...");
		n = sc.nextInt();
		Fruit[] fr = new Fruit[n];
		Fruit f = null;

		Utility utility = new Utility();

			while ((chooise = menu()) != 0) {
				switch (chooise) {
				case 1:
					f = new Mango("Yellow", 250, "DavGad Hapus", true);
					boolean a=cheakAvaibility(i,n);
					if(a) {
						fr[i] = f;
						i++;
					}else {
						System.out.println("Bag pack is full");
						continue;
					}
					break;

				case 2:
					f = new Orange("Orange", 250, "Nagpurs Orange", true);
					 a=cheakAvaibility(i,n);
					if(a) {
						fr[i] = f;
						i++;
					}else {
						System.out.println("Bag pack is full");
						continue;
					}
					break;

				case 3:
					f = new Apple("Red", 250, "J&K's Apple", true);
					a=cheakAvaibility(i,n);
					if(a) {
						fr[i] = f;
						i++;
					}else {
						System.out.println("Bag pack is full");
						continue;
					}
					break;
				case 4:
					utility.displayName(fr);
					break;
				case 5:
					utility.displayDetails(fr);
					break;
				case 6:
					utility.displayTest(fr);
					break;
				case 7:
					break;
				case 8:
					break;

				default:
					System.out.println("Invalid option choosen by you !!!!");
					break;
				}
			}

	}
	public static boolean cheakAvaibility(int i,int n) {
		if(i>=n) {
			return false;
//			System.out.println("Basket is full");
		}
		return true;
	}

}
