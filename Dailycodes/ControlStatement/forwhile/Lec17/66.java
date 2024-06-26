/*

  1 3 5 
  7 9 11
 13 15 17    */






class Demo66{
	public static void main(String args []){
		int num=1;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				System.out.print(num +"  ");
				num= num+2;
			}
			System.out.println();
		}
	}
}
