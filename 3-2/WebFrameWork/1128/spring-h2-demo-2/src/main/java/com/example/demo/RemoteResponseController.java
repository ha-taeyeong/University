package com.example.demo;

import java.util.Calendar;
import org.springframework.stereotype.Controller; // 변경됨
import org.springframework.ui.Model; // 추가됨
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

// 1. 뷰(HTML)를 반환하기 위해 @RestController 대신 @Controller 사용
@Controller
public class RemoteResponseController {
	
	@RequestMapping("/getDateModel")
	public String calculateDayOfWeekModel(@ModelAttribute MyDate myDate, Model model) {
	    
	    if (myDate.getYear() == 0 || myDate.getMonth() == 0 || myDate.getDay() == 0) {
	        return "error"; 
	    }
	    
	    // 2. 요일 계산 로직
	    Calendar cal = Calendar.getInstance();
	    cal.clear(); // 현재 시간 정보 제거
	    cal.set(myDate.getYear(), myDate.getMonth() - 1, myDate.getDay()); 
	    
	    int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	    char d = "일월화수목금토".charAt(dayOfWeek - 1);
	    
	    // 3. Model에 데이터 저장 (View에서 ${...}로 접근 가능)
	    model.addAttribute("myDate", myDate);
	    model.addAttribute("d", d);
	    
	    // 4. 뷰 이름 반환 (src/main/resources/templates/edate.html)
	    return "edate"; 
	}
}
