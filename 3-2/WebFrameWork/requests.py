import requests
from bs4 import BeautifulSoup
import time # 요청 간 지연 시간을 위한 라이브러리 추가

# 1. 크롤링 대상 URL 지정 (KISA의 전체 공지사항 목록 페이지)
url = "https://www.boho.or.kr/main/allNoticeList.do"

# --- 2. HTML 콘텐츠 가져오기 ---
try:
    # 봇 접근을 차단하지 않도록 User-Agent 추가 및 3초 지연
    response = requests.get(url, headers={'User-Agent': 'Mozilla/5.0'})
    response.raise_for_status() # HTTP 오류 발생 시 예외 처리
    html_content = response.text
    time.sleep(3) 
except requests.exceptions.RequestException as e:
    print(f"웹페이지 요청 실패: {e}")
    html_content = "" # 실패 시 빈 문자열 할당

# --- 3. HTML 파싱 및 추출 시작 ---
if html_content:
    soup = BeautifulSoup(html_content, 'html.parser')

    # !!! 수정된 핵심 추출 부분:
    # KISA 공지사항의 HTML 구조를 가정한 CSS 선택자입니다.
    # 일반적으로 게시물 목록은 'ul' 또는 'table' 내의 'a' 태그에 제목이 있습니다.
    # 실제 KISA 홈페이지를 분석해보면, 게시물 제목은 'a' 태그 내부에 있는 경우가 많습니다.
    # 만약 아래 선택자로 추출이 안 된다면, F12 개발자 도구로 정확한 선택자를 찾아야 합니다.
    # **가정된 선택자:** '.notice_list_board a.post_title' 또는 '.board_list a' 등
    post_titles = soup.select('.notice_list_board a') 
    
    # 텍스트 추출용 필터링 키워드
    filter_keywords = ["스미싱", "보이스피싱", "악성코드", "URL", "주의", "유포"] 

    extracted_patterns = []
    
    if post_titles:
        for title in post_titles:
            title_text = title.get_text(strip=True)
            
            # 사기 관련 키워드가 포함된 제목만 추출
            if any(keyword in title_text for keyword in filter_keywords):
                extracted_patterns.append(title_text)

        print("--- 추출된 사기 패턴 데이터 (게시물 제목) ---")
        for pattern in extracted_patterns:
            print(f"- {pattern}")
        print("------------------------------------------")
        
        if not extracted_patterns:
            print("필터링 키워드와 일치하는 제목을 찾지 못했습니다.")
    else:
        print("CSS 선택자('.notice_list_board a')를 사용하여 게시물 제목을 찾지 못했습니다. 선택자를 확인해주세요.")

else:
    print("HTML 콘텐츠가 없어 패턴 추출을 진행할 수 없습니다.")