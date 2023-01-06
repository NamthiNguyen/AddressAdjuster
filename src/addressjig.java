
import java.io.IOException;
import java.util.*;
import java.util.Scanner;
public class addressjig{
    public static void main(String[] args)throws IOException {

        askforaddress();
        
      //  int n = 10; // need to make this take in a input amount
        
     //   for (int i = 0; i <= n; i++){
            // gotta fina a way to change the address so make it update per user input 
            // idea one store input into an array and cycle through the array 
            // char at maybe will work
//System.out.println("333"+randomalphabet()+" "+"south"+randomalphabet()+" "+"payson"+randomalphabet()+" "+"street"+randomalphabet());
       // }
        // maybe add a way to store data into a sheet to easy export 
    }

public static char randomalphabet() {

    Random r = new Random();
    // find a way to make this method smart enought to not add letter corresponding with the direction inside the address

    String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    char letter = abc.charAt(r.nextInt(abc.length()));
    return(letter);
    
}
public static void askforaddress()throws IOException{

    // maybe use this method to make asking more universal 
    String myaddy="";
    String zip = "";
    Scanner address = new Scanner(System.in);
    System.out.println(" what is your address with out the zipcode");

       if(address.hasNextLine()){
         myaddy = address.nextLine();
        Scanner zipScanner = new Scanner(System.in);
        System.out.println("what is your zipcode");

       if(zipScanner.hasNextLine()){
          zip = zipScanner.nextLine();
      }
      address.close();
      zipScanner.close(); 
      
    }

    System.out.println("-----------------");

    // this read abd split the address by whitespace and store them into the array 
    String[] myaddysplit = myaddy.split(" ");
    String[] zipcode = zip.split(" ");
    
    // for checking the store data in the array
       for (int addy = 0; addy < myaddysplit.length; addy++){
        System.out.println(myaddysplit[addy]);
        
       } 

       for (int z = 0; z < zipcode.length; z++){
        System.out.println(zipcode[z]);
       }
       
      


}

}

//BufferedReader  bi = new BufferedReader(
            //new InputStreamReader(System.in));

          /*   int num[] = new int[20]; 
            String[] strNums;
            System.out.println("What is your address without the zip code?");
            strNums  = bi.readLine().split(" ");

            for (int i = 0; i < strNums.length; i++) {
                num[i] = Integer.parseInt(strNums [i]);
               
            }
            System.out.println("address is stored numbers ");
                
            for (int i = 0; i < strNums.length; i++) {
                System.out.println(num[i]);
            }*/
        
        // need scanner for user input 
        