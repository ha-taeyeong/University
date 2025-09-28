# 두수를 입력받고 합을 구하시오.
# 123 456 --> 579
# 3.14 6.28 --> 579

str1 = input()
str1 = '123 456'
lt1 = input().split(' ')

sum(map(int, lt1))
round(sum(map(float, lt1)),5)

while True:
    print(3)
