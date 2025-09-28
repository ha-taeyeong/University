package edu.hallym.week3_1;

//ApplicationContext.java: IoC 컨테이너 역할 (간단한 DI 구현)
public class ApplicationContext {
	private GradeService gradeService;
	
	public ApplicationContext() {
		this.gradeService = new GradeServiceImpl(); // 의존성 주입
	}
	
	public GradeService getGradeService() {
		return gradeService;
	}
}
