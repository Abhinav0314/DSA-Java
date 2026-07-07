import java.util.Scanner;
public class CountVowels
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter string: ");
	    String str = sc.nextLine();
	    int count = 0;
	    for(char ch : str.toLowerCase().toCharArray()){
	        switch(ch){
	            case 'a':
	            case 'e':
	            case 'i':
	            case 'o':
	            case 'u':
	                System.out.print(ch + " ");
	                count++;
	                break;
	           
	        }
	    }
	    System.out.println();
	    System.out.print(count);
	    sc.close();
	}
}
