
package javaexample78createanexception;


public class JavaExample78CreateAnException {

    
    public static void main(String[] args) {
        
        System.out.println("An exception....");
        System.out.println();
        
        // create a random double
        double d = Math.random();
        
        // Create a string and convert it to corresponding int
        String s = null;
        int i = 0;
        
        if(d < 0.5)
        {
            s = new String("250");
            System.out.println("The string is: "+s);
            i = Integer.parseInt(s);
            System.out.println("The number is: "+i);
        }
        else
        {
            s = new String("25r");
            System.out.println("The string is: "+s);
            
            i = Integer.parseInt(s); // An exception will be created here!
            
            System.out.println("The number is: "+i); // not excuted
        }
    }
    
}
