# 문제 PY32-0002
# n 숫자를 입력받고, Hello World 를 n 번 출력하시오
#
# 조건
# Trinket3.x
# for 반복문사용
#     입력
# 입출력 예 참고
# 출력
# 출력횟수를 문자열 앞에 출력
# 문자열포매팅을 달리하면서 3가지 방법으로 작성하세요
# 입출력 예
# 입출력 결과와 똑같아야 합니다. (공백, 대소문자, 형식을 정확하게 맞춰주세요)
# 입력 안내 메시지는 생략해주세요
n = input() # 입력 값 받기

# 1. f-string
for kk in range(1, int(n)+1): # 1부터 n까지 반복
    print(f"{kk} Hello World")  # f-string을 사용해 번호와 함께 출력
# 2. % formatting
for kk in range(1, int(n)+1): # 1부터 n까지 반복
    print("%s Hello World" % kk)  # % 포매팅을 사용해 번호와 함께 출력
# 3. str.format()
for kk in range(1, int(n)+1): # 1부터 n까지 반복
    print("{} Hello World".format(kk))  # str.format()을 사용해 번호와 함께 출력