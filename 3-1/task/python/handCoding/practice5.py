# 사용자가 공백으로 여러 숫자를 입력하면, 짝수만 2배로 만들어서 출력하는 프로그램을 작성하라. (input + map + lambda)
numbers = list(map(int, input().split()))

result = list(map(lambda x: x*2, filter(lambda x: x%2==0, numbers)))
print(result)