
class Demo13{
	public static void main(String[] args){
		int row=4;
		int num;
		for(int i=1;i<=row;i++){
			num=row;
			for(int j=1;j<=row;j++){
				System.out.print(num-- +" ");		
			}
			System.out.println();
		}
	}

}
