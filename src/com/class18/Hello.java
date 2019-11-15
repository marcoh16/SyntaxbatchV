package com.class18;

public class Hello {

		void sayHello(String name) {
			System.out.println("Hello "+ name);
			
		}
		public static void main(String[] args) {
			
			Hello obj = new Hello();
			obj.sayHello("asel ");
			obj.sayHello("weqas");
			obj.sayHello("Diego");
			
			obj.sayHelloDifferentLanguage("USA");
			obj.sayHelloDifferentLanguage("Paraguay");
		
			obj.sayNameAndAge("Jack" , 54);
			obj.sayNameAndAge("jade", 1);
			
			obj.isSnowing(true);
			obj.isSnowing(false);
	}
		/*create method that will say hello ibn different languages
		 * 
		 */
	
		//sayin hello in different language
		void sayHelloDifferentLanguage(String country) {
			
			
			switch(country.toLowerCase()) {
				case "USA":
				System.out.println("hello ");
				break;
				case "Russia":
				System.out.println("Privet");
				break;
				case "Paraguay":
				System.out.println("hola");
				break;
				case "albania":
				System.out.println("pershendetje");
				break;
				
				default:
					System.out.println("i dont know your language");
				
				
			}
		}
	//saying name and age
	void sayNameAndAge(String name, int age) {
		
		System.out.println("My name is" + name + " adn im" + age + " years old");
		
	}
		
	//method that checks if is snowing
	//if snowing -->stay homne, ortherwise go for a walk
	
	void isSnowing(boolean isSnowing) {//method header
		
		if (isSnowing){
			System.out.println("Stay home");
			
		}else {
			System.out.println("go for a walk");
		}
		
		
	}
}
