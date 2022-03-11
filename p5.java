import java.util.*;

class p5
{
		public static void main(String[] args) {
				

				int[] arr = new int[5];
				int sum=0;

				Scanner obj = new Scanner(System.in);

				for (int i=0;i<5 ;i++ )
				 {
						System.out.print("enter array elements : ");
						arr[i]=obj.nextInt();

						sum=sum+arr[i];
				}


			double avr=sum/5;

			System.out.println( " the sum is : "+ sum);
			System.out.println( " the avr is : "+ avr);
			
				for (int i=0;i<5 ;i++ )
				 {
						if (avr < arr[i]) 
						{
								System.out.println(" the element which is big  : " + arr[i]);
							}	
				}



		}





}