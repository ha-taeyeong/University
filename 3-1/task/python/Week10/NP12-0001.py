# 다음과 3차원 배열 np1 을 만들고, axis 에 따른 합을 구하는 프로그램의 결과를 그리시오.
import numpy as np # numpy 라이브러리를 np라는 이름으로 불러오기
np1 = np.arange(0, 24).reshape(2, 3, 4)
np2 = np1.sum(axis=0) # 블록 기준의 합
np3 = np1.sum(axis=1) # 행 기준의 합
np4 = np1.sum(axis=2) # 열 기준의 합
print(np1) # np1 출력