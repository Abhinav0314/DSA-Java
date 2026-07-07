import java.util.Scanner;
public class CountSpaces
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter string: ");
	    String str = sc.nextLine();
	    int count = 0;
	    for(char ch : str.toCharArray()){
	        if(ch == ' '){
	            count++;
	        }
	    }
	    System.out.print(count);
	    sc.close();
	}
}
