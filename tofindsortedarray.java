package arrays;

public class tofindsortedarray {

	public static void main(String[] args) {
		int arr1[]= {1,5,3,2,9};
		int arr[]= {1,2,3,4,5};
		int large=arr[0];
		int i;
		for(i=1;i<arr.length;i++)
		{
			if(large>arr[i])
				break;
			large=arr[i];
		}
		if(i<arr.length)
		{
			System.out.print("false");
			
		}
		else
			System.out.print("true");
			
		
		// TODO Auto-generated method stub

	}

}
