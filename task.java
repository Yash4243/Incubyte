import java.util.*;

class StringCalculator
{
	static int Add(String numbers)
	{
		if(numbers.equals("")){
			return 0;
		}
		else
		{
		    String numList[] = numbers.split("[,\n]");
			
			int l = numList.length;
			int sum = 0;
			
			for(int i=0; i<l; i++){
				int val = Integer.parseInt(numList[i]);
				sum += val;
			}
			
			return sum;
		}
	}
	
	public static void main(String args[])
	{
		int ans;
		ans = Add("");
		System.out.println(ans);
		ans = Add("1");
		System.out.println(ans);
		ans = Add("2");
		System.out.println(ans);
		ans = Add("1,2");
		System.out.println(ans);
		ans = Add("1,2,3,5");
		System.out.println(ans);
		ans = Add("1\n2,3\n4");
		System.out.println(ans);
	}
}
