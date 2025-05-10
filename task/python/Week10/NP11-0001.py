# np1과 같이 0부터 9까지의 값으로 넘파이 1차원 배열을 채우고, 이 배열을 거꾸로 np2 를 만드는 프로그램을 작성하시오
import numpy as np # numpy 라이브러리를 np라는 이름으로 불러오기

np1 = np.arange(0, 10) # 0 ~ 9까지의 정수를 배열로 만들고, np1에 저장
print("np1", np1) # np1 출력

np2 = np.array(list(reversed(np1))) # np1을 뒤집고, 리스트화하여 배열로 np2에 저장
print("np2", np2) # np2 출력