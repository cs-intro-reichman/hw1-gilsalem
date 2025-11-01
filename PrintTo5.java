// Prints the numbers 0 to 5.
// (Same program as shown in lecture 1-1).



public class PrintTo5 {
	public static void main(String[] args)
     {
        
		int lim=Integer.parseInt((args[0]));
        int num1=((int) (Math.random()*lim));
        int num2=((int) (Math.random()*lim));
        int num3=((int) (Math.random()*lim));
        System.out.println(num1+","+num2+","+num3);
        int max=Math.max(num2, num3);
        max=Math.max(max,num2);
        int min=Math.min(num1,num2);
        min=Math.min(min,num3);
        int mid=(num1+num2+num3)-(max-min);
        System.out.println(max+","+mid+","+min);
            



    }
 }