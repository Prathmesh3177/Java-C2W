
class Demo10{
	public static void main(String[] args){
		char ch='A';
		for(int i=1;i<=10;i++){
			if(i%2==1){
				System.out.print(ch +" ");	
			}else{
				System.out.print((char)(ch+32) +" ");
			}
			ch++;
		}
		System.out.println();
	}

}
