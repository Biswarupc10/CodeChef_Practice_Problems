package dsa;
import java.util.*;
public class BlockGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t!=0) {
	   int n=sc.nextInt();
	   int copy=n;
	   int pal=0;
	   while(n!=0) {
		   int r=n%10;
		   pal=pal*10+r;
		   n=n/10;
	   }
	   if(pal==copy) {
		   System.out.println("wins");
	   }
	   else {
		   System.out.println("loses");
	   
	   }
	   t--;
   
   }
	}

}
