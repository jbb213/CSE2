//Jimmy Bradshaw 
//Homework #6 
//2/24/15


    import java.util.Scanner; //Import Scanner 
    
    public class RunFactorial {  //Class 
    public static void main(String[]args) {  //Main Method 
        
    Scanner input= new Scanner(System.in); //Construct Scanner 
    
    int number, cutoff, fact = 1; //Declaring and Initializing Input Number, Cutoff for Factorial, and Factorial Operation repsectively 
    
    System.out.print("Please Enter an Integer Between 9 and 16 Inclusively: " ); 
    
     //Conditioned On If The User Typed An Integer  
     while (!input.hasNextInt()) {
        System.out.println("Invalid input; Please Enter an Integer Between 9 and 16 Inclusively" );
        input.next(); 
    }
    
    int number= input.nextInt(); 
    
    //Conditioned On If The User Typed A Number Between 16 and 9 Inclusively  
    while (number > 16 || number < 9){
        System.out.print("Invalid input; please enter a non-negative number " ); 
        number= input.nextInt(); 
    }
    
    //For While Loop To Calculate the Factorial 
    for ( cutoff = 1 ; cutoff <= number ; cutoff++ )
            {fact = fact*cutoff;}
 
         System.out.println("Factorial of "+number+" is = "+fact);

   
    }}
    