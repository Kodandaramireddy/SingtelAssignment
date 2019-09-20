package com.singtel.assignment;

public class Solution {

	public static void count() {

		int countFly = 0;
		int countWalk = 0;
		int countSing = 0;
		int countSwim = 0;
		
		Animal[] animals = new Animal[] { new Bird(), new Duck(),
				new Chicken(), new RoosterChicken(), new Parrot(), new Fish(),
				new Shark(), new Clownfish(), new Dolphin(), new ButterFly() };

		for (Animal animal : animals) {

			if (animal.getClass().getSimpleName().equalsIgnoreCase("Animal")) {
				countWalk++;
			} else if (animal.getClass().getSimpleName().equalsIgnoreCase("Bird") || 
					animal.getClass().getSimpleName().equalsIgnoreCase("Chicken") || 
					animal.getClass().getSimpleName().equalsIgnoreCase("Parrot")) {
				countFly++;
				countSing++;
			}
			if (animal.getClass().getSimpleName().equalsIgnoreCase("Fish")) {
				countSwim++;
			}
		}

		System.out.println("countWalk: " + countWalk + " countFly: " + countFly
				+ "countSwim : " + countSwim + "countSing: " + countSing);
	}

	public static void main(String[] args) {
		count();
		Bird bird = new Bird();
		Duck dck = new Duck();
		Chicken chk = new Chicken();
		Parrot parrotLngWthDog = new Parrot();
		Parrot parrotLngWthCat = new Parrot();
		Parrot parrotLngWthrooster = new Parrot();
		Shark fishShark = new Shark("Shark", "Large", "Grey");
		Clownfish clownFish = new Clownfish("Clownfish", "small", "Orange");
		ButterFly btrFly = new ButterFly();
		caterpillar ctrplr = new caterpillar();
		bird.walk();
		bird.fly();
		bird.sing();
		dck.sing();
		dck.swim();
		chk.sing();
		parrotLngWthDog.sing("Woof, woof");
		parrotLngWthCat.sing("“Meow”");
		parrotLngWthrooster.sing("“Cock-a-doodle-doo");
		fishShark.eatOtherFish();
		clownFish.makesJokes();
		Dolphin dlph = new Dolphin();
		dlph.swim();
		btrFly.fly();
		ctrplr.walk();
	}
}
