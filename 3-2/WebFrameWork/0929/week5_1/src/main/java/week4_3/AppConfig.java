package week4_3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	//XML의 <bean id="scoreData" class="...ConsoleInputFactory" factory-method="input"/>
	@Bean
	public ScoreData scoreData() {
		return ConsoleInputFactory.input();
	}
	
	//XML의 <bean id="exc" class="...Ex"> + SpEL 주입 대체 
	@Bean(name="exc")
	public Ex ex(ScoreData scoreData) { // 메서드 파라미터로 다른 빈 주입
		Ex ex = new Ex();
		ex.setName(scoreData.getName());
		ex.setScores(scoreData.getScores());
		return ex;
	}
}
