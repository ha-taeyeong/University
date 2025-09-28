package edu.mytest;

//@Component("helloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService { 
  private String hello;             // sayHello 메소드에서 사용하는 속성 

  public HelloWorldServiceImpl() {}  // 빈 생성자

 //hello 속성을 파라미터로 가지는 생성자
  public HelloWorldServiceImpl(String hello) {	
	this.hello = hello; 
  } 
  public void sayHello() {   // hello속성을 출력하는 메소드
	System.out.println(hello); 
  } 
  public void setHello(String hello) {  //hello속성의 setter
	this.hello = hello; 
  } 
} 
