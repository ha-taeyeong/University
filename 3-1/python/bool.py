# 불 자료형
# True(참), False(거짓)을 나타내는 자료형
a = True
b = False

type(a) # bool
type(b) # bool

1 == 1 # True
2 > 1 # True
2 < 1 # False

# 자료형 참과 거짓
# None, 값이 없으면 False
a = [1, 2, 3, 4]
while a:
    print(a.pop()) # a.pop() : a의 리스트 요소를 하나씩 꺼내는 함수
# 4
# 3
# 2
# 1
# while 조건문:
#     수행항 문장

# if []:
#     print("참")
# else:
#     print("거짓")

if [1, 2, 3]:
    print("참") # 요소값이 있는 리스트이기에 참
else:
    print("거짓")

# 불 연산
bool('python') # True
bool('') # False