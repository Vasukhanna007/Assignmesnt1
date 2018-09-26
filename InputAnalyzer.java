//Fill in your name and student number
//Name: Vasu Khanna
//Student Number: 260831350

public class InputAnalyzer {
    public static void main(String args[]) {
        if(args.length < 3) {
            System.out.println("You need to enter three arguments to this program. Try typing 'run InputAnalyzer 2.5 8 9' in Dr. Java, or 'java InputAnalyzer 2.5 8 9' on the command line.");
            return;
        } 
        double a = getInputDouble(args[0]);
        double b = getInputDouble(args[1]);
        double c = getInputDouble(args[2]);
        
        //========================
        //Enter your code below

    // Whether or not a, b and c are all non-negative numbers.
    // 2. Whether or not at least one between a, b and c is an odd number.
    // 3. Whether or not a, b and c were entered in a strictly decreasing order.
    // 4. Whether or not a, b and c are all non-negative numbers or entered in a strictly decreasing order.
    //5. Whether or not a, b and c are all non-negative and none of them is odd.
    
    
 
    
    System.out.println(" numbers entered are "+a + " " + b + " " + c);
    
    boolean isNegative = (a>0 && b>0 && c>0) ;
    System.out.println(" a, b and c are all non-negative numbers : " + isNegative );
    
    boolean isOdd = (a%2==1|| b%2==1||c%2==1);
    System.out.println("at least one between a, b and c is an odd number : " + isOdd);
    
    boolean isDecreasing = ((a>=b)&& (b>=c));
    System.out.println(" a, b and c is in decreasing order  : " + isDecreasing);
    
     boolean isDecreasingNonNegative = ((a>=b)&& (b>=c))||(a>0 && b>0 && c>0);
    System.out.println(" a, b and c is in decreasing order and non negative  : " + isDecreasingNonNegative);
    
      boolean notOddNonNegative = !(a%2!=0|| b%2!=0||c%2!=0)||(a>0 && b>0 && c>0);
    System.out.println(" a, b and c is not odd and non negative  : " + notOddNonNegative);
  }

        
        
        
        //Enter your code above
        //========================
    
    
    public static double getInputDouble(String arg)
    {
        try
        {
            return Double.parseDouble(arg);
        } catch(NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage() + " This argument must be a number!");
        }
        
        //error, return 0
        return 0;
    }
}