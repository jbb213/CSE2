//Jimmy Bradshaw 
//Homework #5 
//2/24/15


    import java.util.Scanner; //Import Scanner 
    
    public class ToHex { 
    public static void main(String[]args) {
        
    Scanner input= new Scanner(System.in); //Construct Scanner 
    
    System.out.println("Please enter the first number representing an RGB value: "); 

    int firstRGB= input.nextInt(); //First RGB Number 
    
    int firstRGBRemainder= firstRGB%16; //First Digit of Output of RGB Number
    int firstRGBQuotiet= firstRGB/16; //Second Digit of Output of RGB Number 
    
    //Converting from decimal to hexadecimal 
    
    int value1 = firstRGBQuotiet; 
    String hexadecimal= ""; 
    
    while (value1 != 0){
        int hexValue=value1%16; 
        char hexChar; 
    
    if(value1 <=9 && value1 >= 0) {
        hexChar=(char)(hexValue + '0'); 
    }
    else{
        hexChar= (char)(hexValue-10+'A'); 
    }
    
    hexadecimal=hexChar+hexadecimal; 
    value1=value1/16; 
    }
    
    int value2 = firstRGBRemainder; 
    String hexadecimal1= ""; 
    
    while (value2 != 0){
        int hexValue1=value2%16; 
        char hexChar1; 
    
    if(value2 <=9 && value2 >= 0) {
        hexChar1=(char)(hexValue1 + '0'); 
    }
    else{
        hexChar1= (char)(hexValue1-10+'A'); 
    }
    
    hexadecimal1=hexChar1+hexadecimal1; 
    value2=value2/16; 
    }
    
    
    System.out.println("Please enter the second number representing an RGB value: "); 

    int secondRGB= input.nextInt(); //Second RGB Number 
    int secondRGBRemainder= secondRGB%16; //Second RGB Number Third Output 
    int secondRGBQuotiet= secondRGB/16; //Second RGB Number Fourth Output 
    
    //Converting from decimal to Hexadecimal 
    int value3 = secondRGBQuotiet; 
    String hexadecimal2= ""; 
    
    while (value3 != 0){
        int hexValue2=value3%16; 
        char hexChar2; 
    
    if(value3 <=9 && value3 >= 0) {
        hexChar2=(char)(hexValue2 + '0'); 
    }
    else{
        hexChar2= (char)(hexValue2-10+'A'); 
    }
    
    hexadecimal2=hexChar2+hexadecimal2; 
    value3=value3/16; 
    }
    
    int value4 = secondRGBRemainder; 
    String hexadecimal3= ""; 
    
    while (value4 != 0){
        int hexValue3=value4%16; 
        char hexChar3; 
    
    if(value4 <=9 && value4 >= 0) {
        hexChar3=(char)(hexValue3 + '0'); 
    }
    else{
        hexChar3= (char)(hexValue3-10+'A'); 
    }
    
    hexadecimal3=hexChar3+hexadecimal3; 
    value4=value4/16; 
    }
        
        
    System.out.println("Please enter the third number representing an RGB value: "); 

    int thirdRGB= input.nextInt(); //Third RGB Number 
    int thirdRGBRemainder= thirdRGB%16; //Third RGB Number Fifth Output 
    int thirdRGBQuotiet= thirdRGB/16; //Third RGB Number Sixth Output
    
    //Converting from a decimal to a hexadecimal 
    
    int value5 = thirdRGBQuotiet; 
    String hexadecimal4= ""; 
    
    while (value5 != 0){
        int hexValue4=value5%16; 
        char hexChar4; 
    
    if(value5 <=9 && value5 >= 0) {
        hexChar4=(char)(hexValue4 + '0'); 
    }
    else{
        hexChar4= (char)(hexValue4-10+'A'); 
    }
    
    hexadecimal4=hexChar4+hexadecimal4; 
    value5=value5/16; 
    }
    
    int value6 = thirdRGBRemainder; 
    String hexadecimal5= ""; 
    
    while (value6 != 0){
        int hexValue5=value6%16; 
        char hexChar5; 
    
    if(value6 <=9 && value6 >= 0) {
        hexChar5=(char)(hexValue5 + '0'); 
    }
    else{
        hexChar5= (char)(hexValue5-10+'A'); 
    }
    
    hexadecimal5=hexChar5+hexadecimal5; 
    value6=value6/16; 
    }
    
    //If Statement if the range is not met by user 
    
    if (firstRGB <0 || firstRGB >255){
        System.out.print("Please enter a number between 0 and 255"); 
    }
    
    else if (secondRGB <0 || secondRGB >255){
        System.out.print("Please enter a number between 0 and 255"); 
    }
    
    else if (thirdRGB <0 || thirdRGB >255){
        System.out.print("Please enter a number between 0 and 255"); 
    }
    
    else{
    System.out.print("The decimal numbers R:" +firstRGB +','+ " G:" +secondRGB +','+
        " B:" +thirdRGB +',' + " is represented in hexadecimal as: " + hexadecimal + hexadecimal1 + hexadecimal2 +
        hexadecimal3 + hexadecimal4 + hexadecimal5); 
      
    }
    
        
    

        
        
    }}   
        
        
        
        
        
        
        
        
    
   