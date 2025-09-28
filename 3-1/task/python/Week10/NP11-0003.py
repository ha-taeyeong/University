# 다음 프로그램의 배열을 그려보자.
# 조건
# np1 처럼 네모상자를 그리고 값을 채운다.
import numpy as np # numpy 라이브러리를 np라는 이름으로 불러오기

# .T = 전치 연산 (행과 열을 바꿈)
# 0 ~ 23까지의 정수로 3행 8열을 만들고, 행과 열을 전치하여 np1에 저장
np1= np.arange(0,24).reshape(3,8).T
print(np.transpose(np1)) # np1의 행과 열을 전치하여 3행 8열로 출력