//Jimmy Bradshaw 
//Homework #6 
//2/24/15


    import java.util.Scanner; //Import Scanner 
    
    public class GetIntegers {  //Class 
    public static void main(String[]args) {  //Main Method 
        
    Scanner input= new Scanner(System.in); //Construct Scanner 
    
    //Asking User For First Non-Negative Integer 
    System.out.print("Please enter your first non-negative integer: " ); 
    
    //Conditioned On If the User Typed An Integer 
    while (!input.hasNextInt()) {
        System.out.println("Invalid input; please enter a non-negative number" );
        input.next(); 
    }
    
    int numberone= input.nextInt(); 
    
    //Conditioned On If The User Typed A Non-Negative Number 
    while (numberone < 0){
        System.out.print("Invalid input; please enter a non-negative number" ); 
        numberone= input.nextInt(); 
    }
    
    //Asking User For Second Non-Negative Integer 
    System.out.print("Please enter your second non-negative integer: " ); 
    
    //Conditioned On If the User Typed An Integer 
    while (!input.hasNextInt()) {
        System.out.println("Invalid input; please enter a non-negative number" );
        input.next(); 
    }
    
    int numbertwo= input.nextInt(); 
    
    //Conditioned On If The User Typed A Non-Negative Number 
    while (numbertwo < 0){
        System.out.print("Invalid input; please enter a non-negative number" ); 
        numbertwo= input.nextInt(); 
    }
    
    //Asking User For Third Non-Negative Integer 
    System.out.print("Please enter your third non-negative integer: " ); 
    
    //Conditioned On If the User Typed An Integer 
    while (!input.hasNextInt()) {
        System.out.println("Invalid input; please enter a non-negative number" );
        input.next(); 
    }
    
    int numberthree= input.nextInt(); 
    
     //Conditioned On If The User Typed A Non-Negative Number 
    while (numberthree < 0){
        System.out.print("Invalid input; please enter a non-negative number" ); 
        numberthree= input.nextInt(); 
    }
    
     //Asking User For Fourth Non-Negative Integer
    System.out.print("Please enter your fourth non-negative integer: " ); 
    
    //Conditioned On If the User Typed An Integer 
    while (!input.hasNextInt()) {
        System.out.println("Invalid input; please enter a non-negative number" );
        input.next(); 
    }
    
    int numberfour= input.nextInt(); 
    
    //Conditioned On If The User Typed A Non-Negative Number 
    while (numberfour < 0){
        System.out.print("Invalid input; please enter a non-negative number" ); 
        numberfour= input.nextInt(); 
    }
    
    ////Asking User For Fifth Non-Negative Integer
    System.out.print("Please enter your fifth non-negative integer: " ); 
    
    //Conditioned On If the User Typed An Integer 
    while (!input.hasNextInt()) {
        System.out.println("Invalid input; please enter a non-negative number" );
        input.next(); 
    }
    
    int numberfive= input.nextInt(); 
    
   //Conditioned On If The User Typed A Non-Negative Number 
    while (numberfive < 0){
        System.out.print("Invalid input; please enter a non-negative number" ); 
        numberfive= input.nextInt(); 
    }

    int sum= (numberone + numbertwo + numberthree + numberfour + numberfive);  
    
    System.out.print("The sum of your integers is " + sum);     

    }}