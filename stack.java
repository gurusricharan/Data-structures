package gethub;

import java.util.Scanner;
public class stack {
	
	int top,s[],size;
	stack(int n){
		top = -1;
		size = n;
		s = new int[size];
	}
	
	void push(int item) {
		if(top==size-1) {
			System.out.println("Stack is full");
			return;
		}
		else {
			s[++top] = item;
		    System.out.println("the item "+item+" is pushed");
		}
	}//push function
			
	void pop() {
		if(top==-1) {
			System.out.println("Stack is empty");
			return;
		}
		else {
			System.out.println("The element "+s[top--]+" is popped");
		}
	}//pop function
	
	void display(){
		System.out.println("The stack is");
		for(int i=top;i>=0;i--) {
			System.out.println(s[i]);
		}
	}//display function
}

class stackdemo{
	public static void main(String[] args) {
		Boolean exit = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		stack str = new stack(size);
		do {
			System.out.println("Stack Operation");
			System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit\n");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch(ch) {
			case 1: System.out.println("Enter the item");
					int item = sc.nextInt();
					str.push(item);
					break;
					
			case 2: str.pop();
					break;
					
			case 3: str.display();
					break;
					
			case 4: exit = true;
					break;
				
			default: System.out.println("Invalid choice");
					 break;
			}
		}while(exit==false);
		
	}//Menu function
}


