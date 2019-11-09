
public class blah {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		int[] array = { 1, 4, 3, 6, 8, 2, 5 };

		int what = array[0];

		for (int index = 0; index < array.length; index++) {

		       if (array[index] > what) {

		                  what = array[index];

		        }

		}

		System.out.println(what);
		
		
		int[] zip = new int[5];

		zip[0] = 7;
		zip[1] = 3;
		zip[2] = 4;
		zip[3] = 1;
		zip[4] = 9;

		System.out.println( zip[ 2 + 1 ] );
		
		
		
		 String c = "Hello i love java";
		  boolean var;
		  var = c.startsWith("hello");
		  System.out.println(var);
		
		  String obj = "I LIKE JAVA";
		  System.out.println(obj.charAt(3));  
		  
		  String str = "0123456789";
		  System.out.println(str.substring(4));
		  
		
	       String word ="abrakadabra";

	       String replace=word.replaceAll("[^aAeEiIoOuU]", " ");

	       System.out.println(replace);
		
	       
	       String str_Sample = "RockStar";
	       System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));
		
	}

}
