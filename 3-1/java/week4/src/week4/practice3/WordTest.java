package week4.practice3;

import java.util.Scanner;

class WordTest{
   public static void main(String[] args){
       //객체 배열을 선언 & 생성, 배열 크기는 7- 본인 작성
	   //입력한 값으로 배열 초기화 - 본인 작성
	   Word[] dim = new Word[7];

	   Scanner in = new Scanner(System.in);
	   
       // 배열의 각 객체 초기화
	   for(var i=0; i < dim.length; i++) {
		   System.out.print((i+1) + " : 영단어와 뜻을 입력하세요 >>>>> ");
		   
		   
		   String str = in.nextLine();
		   String[] a = str.split(" "); // split : 문자열을 잘라주는 함수 => 배열로 처리됨
		   dim[i] = new Word(a[0], a[1]);
		   
//		   dim[i] = new Word(in.next(), in.next());
		   
	   }
	   //wordComp() 메소드를 사용하여 객체 배열에 저장된 영 단어와 입력된 영단어와 일치하면 그에 해당하는 뜻을 출력 - 본인 작성
	   while(true) {
		   boolean flag = true;
		   System.out.println("찾고자 하는 단어를 입력하세요. 종료(f)");
		   
		   String search = in.next();
		   
		   if(search.equalsIgnoreCase("f"))
			   break;
		   
		   for (Word temp : dim) {
			   if(temp.wordComp(search)) {
				   System.out.println(search + ":" + temp.getKor());
				   flag = false;
				   break;
			   }
		   }
		   if (flag)
			   System.out.println("해당 단어가 없습니다.");	   
	   }
	   System.out.println("프로그램 종료");
   }
   
}

