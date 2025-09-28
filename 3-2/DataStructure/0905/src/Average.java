class Average {
	public static void main(String[] args) {
		int[] score;
		score = new int[10];
		score[0]=98;
		score[1]=77;
		score[2]=83;
		score[3]=68;
		score[4]=56;
		score[5]=90;
		score[6]=85;
		score[7]=52;
		score[8]=43;
		score[9]=78;
		
		int result = 0;
		
//		1. for
//		for(int total=0; total<10; total++) {
//			result += score[total];
//		}
		
//		2. while
//		int cnt = 0;
//		while(cnt < 10) {
//			result += score[cnt];
//			cnt++;
//		}
		
//		3. do while
		int cnt = 0;
		do {
			result += score[cnt];
			cnt++;
			
		} while(cnt < 10);
		
		int Avg = result/10;
		
		System.out.println(Avg);
		
	}
}
