package dsa;
import java.util.*;
public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// your code goes here
				Scanner sc=new Scanner(System.in);
				int withdraw=sc.nextInt();
				double balance=sc.nextDouble();
				double charges=0.50;
				if(withdraw<=balance && (withdraw%5==0)){
				    System.out.println(balance-(withdraw+charges));
		     	}
		     	else if(withdraw%5!=0){
		     	    System.out.println(balance);
		     	}
		     	else{
		     	    System.out.println(balance);
		     	}
			}
		

	}


