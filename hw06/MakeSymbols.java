//Jimmy Bradshaw 
//Homework #6 
//2/24/15

    public class MakeSymbols {  //Name A Class
    public static void main(String[]args) {  //Main Method 

    int limiteven=0; //Increasing Function For Even Numbers 
    int limitodd=0; //Increasing Function For Odd Numbers 

    int number=(int)(Math.random() * (100) + 0); //Generating A Random Number 
   
   //Seeing if the number generated is even and proceding to do a do while loop  
    if ((number%2)==0) { 
        do {System.out.print("*");
            limiteven ++; 
    }
        while (limiteven < number);
   
   //Seeing if the number generated is odd and proceding to do a do while loop 
    if ((number%2)==1) { 
        do {System.out.print("&");
        limitodd ++; 
    }
        while (limitodd < number);
        
    }
    }
    
    }}
    
