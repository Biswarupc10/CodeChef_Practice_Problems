package dsa;
import java.util.*;
import java.math.*;
public class CeilandReceipt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 int t=sc.nextInt();
 while(t!=0) {
 int p=sc.nextInt();
 int menucount=0;
 for(int i=11;i>=0;i--) {
	int currentPower=(int)Math.pow(2,i);
	while(p>=currentPower) {
		p=p-currentPower;
		menucount++;
	}
	 
 }
 System.out.println(menucount);
 t--;
  }

}
}
