package string;
import java.util.Scanner;

public class Words
{
	private String input;
	public int method1_word(String input) {
		 this.input = input;
		 if (input == null || input.isEmpty()) {
	            return 0;
	          }
		return 0;
		 
	}
    public static void main(String[] args)
    {
        System.out.println("Enter words:");
        
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
       
		Words obj = new Words();
		obj.method1_word(input);
        
        System.out.println("Reversed string is:");
    }
}