package gethub;

import java.util.Scanner;

class Array {
   int n,i,a[],size;
   public Scanner s = new Scanner(System.in);
     Array(int n) {
    	 size = n;
    	   a = new int[size];
		}
   
     void create(){
    	 System.out.println("Enter the elements");
  	   for(i=0;i<size;i++) {
  		   a[i] = s.nextInt();
  	   }
     }
   
   void display() {
	   System.out.println("The array elements are");
	   for(i=0;i<size;i++) {
		   System.out.println(a[i]);
	   }
   }

}

class Arraymain {
	public static void main(String[] arg) {
		
		Scanner s = new Scanner(System.in);
		Boolean exit=false;
		System.out.println("Enter the limit: ");
		int n = s.nextInt();
		Array ar = new Array(n);
		
		do{
			System.out.println("1.Create\n 2.Display\n 3.Exit\n");
		    System.out.println("Enter your choice");
		    int ch = s.nextInt();
		    
		    switch(ch) {
		    
		    case 1: ar.create();
		    	    break;
		    	    
		    case 2: ar.display();
		    		break;
		    		
		    case 3: exit= true;
		    		break;
		    			
		    }
		}while(!exit);
	}
	
}
