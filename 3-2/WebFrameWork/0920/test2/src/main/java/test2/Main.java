package test2;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

public class Main {
    public static void main(String[] args) {
        // BeanFactory 생성
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        // Bean 정의 등록
        factory.registerBeanDefinition("greetingService", new RootBeanDefinition(GreetingService.class));

        // Bean 조회 및 사용
        GreetingService service = (GreetingService) factory.getBean("greetingService");
        service.greet();
    }
}
