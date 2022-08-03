package com.programming.Java.OOPS.Polymorphism;

class Animal {
	  public void animalSound() {
	    System.out.println("Teh animal makes a sound");
	  }
	}

	class Pig extends Animal {
	  public void animalSound() {
	    System.out.println("The pig says: wee wee");
	  }
	}

	class Dog extends Animal {
	  public void animalSound() {
	    System.out.println("Teh dog says: bow wow");
	  }
	}

	class Polymorphism_1 {
	  public static void main(String[] args) {
	    Animal myAnimal = new Animal();  // Create a Animal object
	    Animal myPig = new Pig();  // Create a Pig object
	    Animal myDog = new Dog();  // Create a Dog object
	    myAnimal.animalSound();
	    myPig.animalSound();
	    myDog.animalSound();
	  }
	}

