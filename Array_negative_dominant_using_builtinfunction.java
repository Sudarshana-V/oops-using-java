import java.io.*;
import java.util.Arrays;
public class Array_negative_dominant_using_builtinfunction
{
	public static void main(String args[])
	{
		int arr[]={1,-2,-5,4,3,-6};
		Boolean result=false;
		System.out.println(Arrays.toString(arr));
		long count_negative,count_positive;
		arr=Arrays.stream(arr).distinct().toArray();
		count_negative=Arrays.stream(arr).filter(s -> s < 0).count();
		count_positive=Arrays.stream(arr).filter(s -> s > 0).count();
		if(count_negative > count_positive)
			result=true;
		System.out.printf(result);
	}
}