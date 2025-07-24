# map()함수를 이용해서 입력받은 원소들의 제곱을 구하는 프로그램을 작성하시오.
# 조건
# map()함수를 2번이상 사용
# 입력값이 2와 8 사이의 값만 제곱한다. (2,8 포함)
# 사용자정의함수를 map()함수에 이용한다
def square_if_valid(x): # 사용자 정의 함수 (조건에 따라 제곱)
  return x**2 if 2 <= x <= 8 else x # 2이상 8이하라면 제곱하고 그렇지 않으면 원래 숫자 그대로 반환.

data = input().split() # 입력값을 공백 기준으로 나눈 문자열 리스트
int_list = list(map(int, data)) # 입력값의 타입을 int로 변경하고, 리스트에 담는다.
result = list(map(square_if_valid, int_list)) # 입력받은 리스트를 제곱함수를 적용하고 결과 리스트에 담는다.
print(result) # 결과를 출력한다.