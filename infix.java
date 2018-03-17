package replace;

public class infix {

	 void infix_postfix(char infix[],char postfix[]) {
		int top=-1;
		char s[] = new char[30];
		s[++top] = '#';
		int j=0;
		for(int i=0;i<infix.length;i++) {
			 char symbol = infix[i];
			while(F(s[top])>G(symbol)) {
				postfix[j] = s[top--];
				j++;
			}
			if(F(s[top])!=G(symbol)) 
				s[++top] = symbol;
			else
				top--;
		}
		while(s[top]!='#') {
			postfix[j++] = s[top--];
		}
		postfix[j]='\0';
		
	}
	
	int F(char symbol) {
		switch(symbol) {
		case '+':
		case '-':
			return 2;
		case '*':
		case '/':
			return 4;
		case '^':
		case '$': return 5;
		case '(': return 0;
		case '#': return -1;
		default : return 8;
		}
	}
	

	int G(char symbol) {
		switch(symbol) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 3;
		case '^':
		case '$': return 6;
		case '(': return 9;
		case ')': return 0; 
		default : return 7;
		}
	}
		
}
