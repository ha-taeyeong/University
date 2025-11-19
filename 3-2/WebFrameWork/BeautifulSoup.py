# BeautifulSoup.py 파일에 다음 내용을 연결하여 실행합니다.

from bs4 import BeautifulSoup
# requests.py에서 가져온 html_content 변수를 사용한다고 가정
# 실제 환경에서는 두 파일을 합치거나 모듈로 import 해야 합니다.

soup = BeautifulSoup(html_content, 'html.parser')

# 예시: 게시물 제목 목록 추출 - (웹사이트의 실제 구조에 맞게 CSS 선택자/태그를 변경해야 함)
# KISA 공지사항의 일반적인 제목 태그를 가정하여 예시를 작성합니다.
# 실제 웹사이트의 F12 개발자 도구를 사용하여 정확한 선택자(.post-list .title)를 찾아야 합니다.
post_titles = soup.select('.post-list .title') 

extracted_patterns = []
# 미션 1에 관련된 키워드: '스미싱', '보이스피싱', '악성코드' 외에도 'URL', '유포' 등을 추가할 수 있습니다.
filter_keywords = ["스미싱", "보이스피싱", "악성코드", "고수익", "URL", "주의"] 

for title in post_titles:
    # 텍스트 추출 후, 사기 관련 키워드 필터링
    title_text = title.get_text(strip=True)
    if any(keyword in title_text for keyword in filter_keywords):
        extracted_patterns.append(title_text)

print(extracted_patterns)