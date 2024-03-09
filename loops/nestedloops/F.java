class F{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i*2;j++){
				System.out.println(i+" "+j);
				if(i%4==0)break;
			}
			if(i%4==0)break;
		}
		System.out.println("Main ends");
	}
}