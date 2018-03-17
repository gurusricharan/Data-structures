import java.util.Scanner;

public class postfix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char infix[] = new char[20]; 
		char postfix[] = new char[20];
		System.out.println("Enter the infix expression");
		infix = sc.next().toCharArray();
		string st = new string();
		st.infix_postfix(infix, postfix);
		System.out.println("the infix expression is ");
		System.out.println(infix);
		System.out.println("the postfix expression is ");
		System.out.println(postfix);
	}

	
		
	

}
