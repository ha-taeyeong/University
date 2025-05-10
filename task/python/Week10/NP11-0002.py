# numpy 를 이용해서 np1 uniform 배열을 만들고, np2 와 같이 짝수만 추출하는 프로그램을 작성하시오.
import numpy as np # numpy 라이브러리를 np라는 이름으로 불러오기

# 0 ~ 10까지 10개의 랜덤 정수타입으로 np1에 저장
np1 = np.random.uniform(0, 10, 10).astype('int')
print("np1", np1) # np1 출력

np2 = np1[np.where(np1%2==0)] # np1의 배열에서 짝수만 골라서 np2에 저장
print("np2", np2) # np2 출력