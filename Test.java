package armstrongNumber;


import java.util.*;
class Fun
{
	private long temp,remainder,sum;

public String fun1(long num)
{
	temp=num;
while(num>0)
{
	remainder=num%10;
	sum+=remainder*remainder*remainder;

	num/=10;
}
 if(sum!=temp)
 	return "is not a armstrong number";
return "is a armstrong number";
}
}
public class Test
{
    public static void main(String [] args)
    {
    	long number;
    	Fun fun = new Fun();

      Scanner sc=new Scanner(System.in);
 		System.out.println("Enter a number");
 		number =sc.nextInt();
         String s = fun.fun1(number);

         System.out.println(number +" "+ s);
    }

}