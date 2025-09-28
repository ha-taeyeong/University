# 1부터 10까지 리스트를 만들고, 홀수에만 2를 곱해서 출력하는 프로그램을 작성하시오.
#
# 조건
# 결과물은 for while 반복문 x , LC 를 사용 x
# 리스트값 짝수는 그대로 유지한다.
# Python 3.x 기준
# 입력
# 없음
# 출력
# 리스트 결과를 출력한다.
# 입출력 예
# 입출력 결과와 똑같아야 합니다. (공백, 대소문자, 형식을 정확하게 맞춰주세요)
# 입력 안내 메시지는 생략해주세요
def odd_mul2(number): # 사용자 정의 함수(입력 : number)
  if number % 2 == 1: # number이 홀수이면
    return number * 2 # number 2배 반환
  else: # 그렇지 않으면 (짝수)
    return number # 원래 number 그대로 반환

# 1부터 10까지 odd_mul2 함수를 적용하고, 리스트로 반환
numbers = list(map(odd_mul2, range(1, 11)))
print(numbers) # 결과 반환