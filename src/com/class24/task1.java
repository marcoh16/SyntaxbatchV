package com.class24;

public class task1 {
public task1() {
	System.out.println("im public constructor");
}
	
task1(String str){
	System.out.println("im default constructor");
}
protected task1(int num) {
	System.out.println("im protected constructor");
}
private task1(int num, int num2) {
	System.out.println("im private constructor");
}

public static void main(String[] main) {
task1 obj = new task1();
task1 obj1 = new task1("string");
task1 obj2 = new task1(4,5);


}





}
