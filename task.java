import java.util.*;

class StringCalculator
{
	static int cnt = 0;
	static int Add(String numbers)
	{
		cnt += GetCalledCount(); // how many time Add() was called
		
		if(numbers.equals("")){
			return 0;
		}
		else
		{	
			String delimiter = ",";
			if(numbers.matches("//(.*)\n(.*)")){
				delimiter = Character.toString(numbers.charAt(2));
				numbers = numbers.substring(4);
			}

			String numList[] = numbers.split(delimiter + "|\n");
			
			int l = numList.length;
			int sum = 0;
			
			for(int i=0; i<l; i++){
				int val = Integer.parseInt(numList[i]);
				if(val < 0){
					throw new IllegalArgumentException("Negatives not allowed:");
				}
				if(val > 1000){
					val = 0;
				}
				sum += val;
			}
			
			return sum;
		}
	}
	
	static int GetCalledCount()
	{
		return 1;
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
		ans = Add("1\n2,3");
		System.out.println(ans);
		ans = Add("//;\n1;2");
		System.out.println(ans);
		ans = Add("1001,2");
		System.out.println(ans);
		ans = Add("1,2,-3,-4");
		System.out.println(ans);
	}
}
