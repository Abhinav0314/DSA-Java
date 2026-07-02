import java.util.Scanner;
public class CountCharacterTypes
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter string: ");
	    String str = sc.nextLine();
	    int uppercase = 0;
	    int lowercase = 0;
	    int numcount = 0;
	    int specialcount = 0;
	    for(char ch : str.toCharArray()){
	        if(Character.isUpperCase(ch)){
	            uppercase++;
	        }
	        else if(Character.isLowerCase(ch)){
	            lowercase++;
	        }
	        else if(Character.isDigit(ch)){
	            numcount++;
	        }
	        else{
	            specialcount++;
	        }
	    }
	    System.out.println(uppercase + " " + lowercase + " " + numcount + " " + specialcount);
	    sc.close();
	}
}
