class PracticeQ1{

		
	public static boolean isDuplicate(int[] zr){
		for(int i=0;i<6;i++){
			for(int j=i+1;j<6;j++){
				if(zr[i]==zr[j]){
					return true;
				}
			}
		}
		return false;	
	}	
		public static void main(String args[]){
		int[] ar={10,20,30,40,50,60};
 		int[] br={60,30,10,40,20,50};
 		int[] cr={60,30,50,40,20,50};
		System.out.println("ar : "+isDuplicate(ar)); //false
		System.out.println("br : "+isDuplicate(br)); //false
		System.out.println("cr : "+isDuplicate(cr)); //true

	}
}
