/* Sum of Unique Elements
/*
You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
Return the sum of all the unique elements of nums.

Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.

*/
class abc {
    public static void main(String args[]) 
	{
	int arr[]={5,5,2,2};
	/*for(int i=0;i<4;i++)
	{
	arr[i]=s.nextInt();
	}*/
	int sum=0;
	int duplicate=0;
	for(int i=0;i<4;i++)
	{
	for(int j=i+1;j<4;j++)
	{
	if(arr[i]==arr[j])
	duplicate=arr[i];
     
	}
	if(arr[i]!=duplicate)
			sum+=arr[i];
	}
	/*for(int i=0;i<4;i++)
	{
		if(arr[i]!=duplicate)
			sum+=arr[i];
	}*/
	System.out.println(sum);
	}
}
        
      
   