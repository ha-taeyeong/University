#다음 코드는 a, b 숫자를 바꾸는 swap 기능 코드의 일부이다. 사용자정의함수를 모두 구현하시오.
# 함수명 myswap1(), myswap2() myswap3()
# myswap1()
def myswap1(a, b): # myswap1 사용자 정의 함수, 매개변수 a, b를 받는다
  return b, a # a와 b의 값을 바꾸어 반환

a, b = 3, 4 # a에는 3을, b에는 4를 저장
print(a,b) # 바꾸기 전의 a, b를 출력
a,b = myswap1(a,b) # myswap1 함수를 호출하여 a, b 값을 교환
print(a,b) # 바꾼 후의 a, b를 출력

# myswap2()
def myswap2(a, b):  # myswap2 사용자 정의 함수, 매개변수 a, b를 받는다
  a, b = b, a # a를 b에 저장, b를 a에 저장
  print(a, b) # 바뀐 a, b를 출력

a, b = 3, 4 # a에는 3을, b에는 4를 저장
print(a,b) # 바꾸기 전의 a, b를 출력
myswap2(a,b) # myswap2 함수를 호출하여 a, b 값을 교환
print(a,b) # 바꾼 후의 a, b를 출력

# myswap3()
def myswap3():  # myswap3 사용자 정의 함수
  global a, b  # 전역변수 a, b 선언
  a, b = b, a  # a에 b를 저장, b에 a를 저장


a, b = 3, 4  # a에 3을 저장, b에 4를 저장
print(a, b)  # a, b를 출력
myswap3()  # myswap3 함수를 호출
print(a, b)  # 바꾼 후의 a, b를 출력