# 문제 PY32-0003
# 1개의 숫자를 입력받고 Hello World 를 n 번 출력하시오
#
# 조건
# Trinket3.x
# for 반복문사용
#     입력
# 음수가 입력되는 경우 에러메시지를 출력
# 출력
# 출력횟수를 문자열 앞에 출력
# 출력 문자열은 " " 로 감싸서 출력하시오
# 입출력 예
# 입출력 결과와 똑같아야 합니다. (공백, 대소문자, 형식을 정확하게 맞춰주세요)
# 입력 안내 메시지는 생략해주세요
n = input() # 입력 값 받기
if int(n) < 0: # 입력 값이 음수이면
    print("Please enter a number greater than 0") # 에러 메시지 출력
else:
    for kk in range(1, int(n)+1): # 1~n까지 반복
        print(f"\"{kk}\" Hello World") # 번호를 큰따옴표를 감싸서 Hello World 출력