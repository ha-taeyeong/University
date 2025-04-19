# 복수개의 숫자를 입력받고, 짝수를 -1로 치환한 모든 수의 합을 출력하시오.
#
# 조건
# Trinket3.x
# filter() + lambda 함수를 사용하시오
# for 반복문 x
# 입력
# 공백 기준으로 입력
# 출력
# 입출력 예 참고
# 입출력 예
# 입출력 결과와 똑같아야 합니다. (공백, 대소문자, 형식을 정확하게 맞춰주세요)
# 입력 안내 메시지는 생략해주세요
# 공백 기준 숫자 입력받고, 정수 리스트 변환
numbers = list(map(int, input().split()))

# filter(조건함수, 반복가능한객체)
# numbers 리스트에서 짝수인 경우만 필터링
evens = list(filter(lambda x: x % 2 == 0, numbers))
evens = [-1] * len(evens) # 짝수 개수만큼 -1을 반복해서 리스트를 만든다.

# number 리스트에서 홀수인 경우만 필터링
odds = list(filter(lambda x: x % 2 == 1, numbers))

print(sum(evens + odds)) # 모든 결과의 합
