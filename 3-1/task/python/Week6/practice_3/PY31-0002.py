# 문제 PY31-0002
# 1개의 문자열을 입력받고, Hello World 를 n 번 출력하시오
#
# 조건
# Trinket3.x
# enumerate() 사용하세요
# 문자열포매팅을 달리하면서 3가지 방법으로 작성하세요
# 입력
# 입출력 예 참고
# 출력
# 남은 출력횟수를 문자열 앞에 출력
# 입출력 예
# 입출력 결과와 똑같아야 합니다. (공백, 대소문자, 형식을 정확하게 맞춰주세요)
# 입력 안내 메시지는 생략해주세요
n = input()
lt = list(range(int(n), 0, -1)) # 입력 값부터 0까지 역순으로 리스트에 값을 넣기

# 1. f-string
for index, value in enumerate(lt): # enumberate():인덱스,값을 동시에 구할 수 있는 반복문
    print(f"{value} Hello World") # f-string을 사용해 번호와 함께 출력

# 2. % formatting
for index, value in enumerate(lt): # enumberate():인덱스,값을 동시에 구할 수 있는 반복문
    print("%d Hello World" % value) # % 포매팅을 사용해 번호와 함께 출력

# 3. str.format()
for index, value in enumerate(lt): # enumberate():인덱스,값을 동시에 구할 수 있는 반복문
    print("{} Hello World".format(value)) # str.format()을 사용해 번호와 함께 출력