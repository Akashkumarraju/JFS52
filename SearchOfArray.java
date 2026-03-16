class SearchOfArray 
{
	public static void main(String[] args) 
	{
		int[] arr={10,33,99,45};
		int ser=50;
		boolean found=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ser)
			{
				System.out.println("Found:"+ arr[i]);
				found=true;
				break;
			}
			
		}
		if(!found){
				System.out.println(ser +":Is Not Found");
			}
	}
}
