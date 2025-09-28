# 다음은 문자열을 입력받고, 슬라이스 연산자를 이용한 출력 결과를 보여 주는 코드의 일부이다.
#
# 코드에 맞는 출력 결과를 작성하시오.
#
# 오류이거나 출력이 없는 경우 x 표시하시오.

str1 = '123456789'

result1 = str1[::2]
result2 = str1[7:-4:-1]
result3 = str1[7:4:-1]

print(f"str1[::2] = {result1}")
print(f"str1[7:-4:-1] = {result2}")
print(f"str1[7:4:-1] = {result3}")