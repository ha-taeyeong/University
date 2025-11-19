package com.example.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class RemoteResponseController {
    
	@RequestMapping("/getDate2")
	public void main(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		
		
		
		// null 처리 및 기본값 설정
		if (year == null || month == null || day == null) {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<h3>year, month, day 파라미터를 모두 입력해주세요.</h3>");
			out.println("</body></html>");
			return;
		}
		
		int yyyy = Integer.parseInt(year);
		int mm = Integer.parseInt(month);
		int dd = Integer.parseInt(day);
		
		// 2.작업 : 요일 계산
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.set(yyyy, mm-1, dd);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		char d = "일월화수목금".charAt(dayOfWeek-1);
		
		// 3. 출력(한글 인코딩 및 HTML 설정)
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><meta charset='UTF-8'><title>날짜 결과</title></head>");
		out.println("<body>");
		out.println("<h2>입력하신 날짜 정보</h2>");
		out.println("<p>year : " + year + "</p>");
		out.println("<p>month : " + month + "</p>");
		out.println("<p>day : " + day + "</p>");
		out.println("<hr>");
		out.println("<h3>요일 : " + d + "요일</h3>");
		out.println("</body>");
		out.println("</html>");
	}
	@RequestMapping ("/getDate3")
	public void calculateDayOfWeekPost(
	        @RequestParam(value = "year", required = false) String year,
	        @RequestParam(value = "month", required = false) String month,
	        @RequestParam(value = "day", required = false) String day,
	        HttpServletResponse response) throws IOException {
		
		// null 처리 (파라미터가 누락된 경우)
		if (year == null || month == null || day == null) {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<h3>year, month, day 파라미터를 모두 입력해주세요.</h3>");
			out.println("</body></html>");
			return;
		}
		
		int yyyy;
		int mm;
		int dd;
		
		try {
		    // 숫자 형식 변환 시 발생할 수 있는 오류(NumberFormatException)를 처리합니다.
		    yyyy = Integer.parseInt(year);
		    mm = Integer.parseInt(month);
		    dd = Integer.parseInt(day);
		} catch (NumberFormatException e) {
		    response.setContentType("text/html; charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h3>year, month, day 파라미터는 유효한 숫자 형식이어야 합니다.</h3>");
            out.println("</body></html>");
            return;
		}
		
		// 2.작업 : 요일 계산
		Calendar cal = Calendar.getInstance();
		// Calendar의 월은 0(1월)부터 시작하므로, 입력값(1~12)에서 1을 뺍니다.
		cal.clear();
		cal.set(yyyy, mm-1, dd); 
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		// 원본 코드에 빠져있던 '토'를 추가하여 수정했습니다.
		// Calendar.DAY_OF_WEEK는 일요일(1)부터 시작합니다.
		char d = "일월화수목금토".charAt(dayOfWeek-1); 
		
		// 3. 출력(응답)
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><meta charset='UTF-8'><title>날짜 결과</title></head>");
		out.println("<body>");
		out.println("<h2>입력하신 날짜 정보</h2>");
		out.println("<p>year : " + year + "</p>");
		out.println("<p>month : " + month + "</p>");
		out.println("<p>day : " + day + "</p>");
		out.println("<hr>");
		out.println("<h3>요일 : " + d + "요일</h3>");
		out.println("</body>");
		out.println("</html>");
	}
}
