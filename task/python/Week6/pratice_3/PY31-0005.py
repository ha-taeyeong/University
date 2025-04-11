# 문제 PY31-0005
# input() 함수를 이용해서 숫자를 무한 입력받고, 총합을 출력하고자 한다.
#
# 조건
# = 을 입력받으면 총 합을 구한다.
# 입출력 예
# 입출력 결과와 똑같아야 합니다. (공백, 대소문자, 형식을 정확하게 맞춰주세요)
# 입력 안내 메시지는 생략해주세요
total = 0 # 합계 초기화

while True: # 무한 루프
    text = input() # 입력값 받기
    if text.isdigit() and int(text) > 0: # 입력값이 양의 정수이면
        total += int(text) # 합계에 더하기
        print(f"+{text}") # 입력값 앞에 + 붙여서 출력
    elif str(text) == "=": # 입력값이 "=" 이면
        print(f"sum : {total}") # 누적 합계 출력
        break # 반복문 종료