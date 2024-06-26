 class Demo9{
	public static void main(String [] args){

		for (int i=1;i<=4;i++){
			int num=1;
			for (int j=4;j>=i;j--){
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}

}
