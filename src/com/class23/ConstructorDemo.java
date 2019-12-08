package com.class23;

public class ConstructorDemo {

		ConstructorDemo(){
			System.out.println("im your constructor");
		}
		ConstructorDemo(String str){
			System.out.println("im your contructor with a parameter"+ str);
		}
		ConstructorDemo(int num){
			System.out.println("im your contructor with a parameter"+ num);
		}
		public static void main(String[] args) {
			
			ConstructorDemo obj = new ConstructorDemo();
			System.out.println(" Code after creating an object");
			obj.hello();
			
			ConstructorDemo obj2 = new ConstructorDemo(123);
			
		}
		public void hello() {
			
			System.out.println("hello class");
			System.out.println("hell");
		}
		
		
		
	}


