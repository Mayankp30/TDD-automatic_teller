import java.math.BigInteger;
import java.util.*;

public class Tmz {

	public void asciiCode(String word){

		StringBuilder sb = new StringBuilder();  // using String Builder to manipulate the string
        
        for (char c : word.toCharArray())  // converting string to char array and iterating over it
            sb.append((int)c);             

        BigInteger code = new BigInteger(sb.toString()); // using Big integer Math function to convert char value to it's ascii value
        System.out.println(code);

	}


public static void main(String[] args) {

 	String str = "tmz";  // or anything else
 	Tmz tmz = new Tmz;
 	tmz.(str);
     
    }

}