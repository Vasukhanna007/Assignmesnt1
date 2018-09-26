//Fill in your name and student number
//Name: Vasu
//Student Number: 260831350

public class CoinMachine {
    
    public static void main(String args[]) {
        if(args.length < 2) {
            System.out.println("You need to enter two arguments to this program. Try typing 'run CoinMachine 400 215' in Dr. Java, or 'java VendingMachine 400 215' on the command line.");
            return;
        } 
        int x = getInputInteger(args[0]);
        int y = getInputInteger(args[1]);
        
        //========================
        //Enter your code below
        int z = x-y ;// change
       
      System.out.println(" Required  Change " + z );
      System.out.println(" Change "  );
      
      { // use twoonies
 
        { 
          int twoonies = z/200;
          z=z-200*(twoonies);
          System.out.println(" twoonies   " + twoonies );
        }
         
      }
      
      { // use loonies
        int loonies = z/100;
          z=z-100*(loonies);
        System.out.println(" loonies   " + loonies );
      }
      
      { 
       // use quarters
      int quarter = z/25;
      z=z-25*(quarter);
         System.out.println(" quarters  " + quarter);
      }
     
      { 
       // use dime
      int dime = z/10;
      z=z-10*(dime);
        System.out.println(" dimes  " + dime ); 
      }
      
      { 
       // use nickel
      int nickel = z/5;
      z=z-5*(nickel);
       System.out.println("nickels  " + nickel );
      
        
        
        
        
        //Enter your code above
        //========================
    }
    }
    
    public static int getInputInteger(String arg) {
        try
        {
            return Integer.parseInt(arg);
        } catch(NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage() + " This argument must be an integer!");
        }
        
        //error, return 0
        return 0;
    }
}