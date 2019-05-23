//Kyle Phillips
//CS205 - Data Structures and Algorithms
//Lab 4 Post Fix. 

import java.util.*;


public class EvaluatePostFix  {
	  public static void main(String[] args) {
	       
		  	String tester = "10 14 + 12 10 -/";
	        System.out.println(evaluatePostFixExpression(tester));       
	        
	  
	  
	  }
	  
	  public static int evaluatePostFixExpression(String s){
		  
		  Stack<Integer> mystack = new Stack<Integer> ();
		  
		 
		  int numb1 = 0;
		  int numb2 = 0;
		  String[] array = s.split(" ");
		  
		  
		  for(int i = 0; i < array.length; i++) {
			  
			  if(Character.isDigit(array[i].charAt(0))) {
				  
				  mystack.push(Integer.parseInt(array[i]));
				  System.out.println(mystack.peek());
				  
			  }
			  
			  else {
				
				  numb1 = mystack.pop();
				  numb2 = mystack.pop();
				  
				  switch(array[i].charAt(0)) {
				  
				  case '+':
					  
					  mystack.push(numb1 + numb2);
					 
					  break;
			
				  case '-':
					  mystack.push(numb1 - numb2);
					 
					  break;
					  
				  case '/':
					  mystack.push(numb1 / numb2);
					 
					  break;
				  
				  case '*':
					  mystack.push(numb1 * numb2);
					  
					  break;
				  }
				 
			  }
			  }
			  
		  
		  
		
			return mystack.pop();
	    

	  
			

	}
}

