import java.util.*;
class Demo1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		
		for(int i =0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int count1 =0;
		int count2=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				count1++;
			}else{
				count2++;
			}
		}
		
		if(count1%2==0&&count2%2==1){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}
