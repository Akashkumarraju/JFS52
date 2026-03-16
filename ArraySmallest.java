class ArraySmallest 
{
	public static void main(String[] args) 
	{
	int[] arr = {9, 2, 14, 7};
	int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Smallest Number:"+min);
	}
}
