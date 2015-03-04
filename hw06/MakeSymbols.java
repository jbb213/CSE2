//Jimmy Bradshaw 
//Homework #5 
//2/24/15


  
    
    public class MakeSymbols { 
    public static void main(String[]args) {

    int limiteven=0;
    int limitodd=0; 

    int number=(int)(Math.random() * (100) + 0); 
    if ((number%2)==0) { 
        do {System.out.print("*");
            limiteven ++; 
    }
        while (limiteven < number);
    
    if ((number%2)==1) { 
        do {System.out.print("&");
        limitodd ++; 
    }
        while (limitodd < number);
        
    }
    }
    
    }}
    
