package sorting;



public class BubbleSort {
	
	public int arr[]= {1,3,2,6,5,44,55,87,56};
	int temp;
	public void sort()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					
				}
				
			}
		}
		
		
	}
	
	
	public void show()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(","+arr[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
BubbleSort b=new BubbleSort();
b.show();
b.sort();
b.show();
		System.out.println("d");

	}

}

