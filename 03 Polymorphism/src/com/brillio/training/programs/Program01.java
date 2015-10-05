package com.brillio.training.programs;

import com.brillio.training.entity.Animal;
import com.brillio.training.entity.Cat;
import com.brillio.training.entity.Dog;
import com.brillio.training.entity.Tiger;

public class Program01 {

	public static void main(String[] args) {
		
		Animal a1;
		
		Cat c1 = new Cat(); //reference to an object of cat type
		Dog d1 = new Dog(); //reference to an object of Dog type
		
		a1 = c1; // c1 instanceof Animal; hence can b assigned to a1
		a1.talk(); // error; no method in Animal type
				   // complier checks if talk() exists in Animal
				   //At the runtime, a1 refers to an object of cat
				   // and the talk() from cat class is executed
		
		a1 =d1;
		a1.talk();//once again, complier checks if talk///90 is available		
					//in Animal, butat the runtime
					//the method talk() from the instance type
					//(which is Dog) is invoked
		
		//Line 17 and 23 are identical, but produce diffrent result
		
		Tiger t1 = new Tiger();
		a1 =t1;
		a1.talk();
	}
}
