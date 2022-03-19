package dsa;
import java.util.*; 
public class ChefandRemessniss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t!=0) {
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	int x=Math.max(a, b);
    	int sum=a+b;
    	System.out.println(x+" "+sum);
    	t--;
    }
	}

}
