import java.lang.reflect.Method;

class day_21_generics {
    //Write your code here
    public static <E> void printArray (E[] inputArray) {
        for (E element: inputArray) {
            System.out.println(element);
        }
    }
	
    public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray( intArray  );
        printArray( stringArray );
        
        if(Solution.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }
}