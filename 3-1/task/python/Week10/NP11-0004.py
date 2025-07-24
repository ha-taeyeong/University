# 다음 그림과 같은 2차원 ndarray 데이터 배열을 만드시오.
# 조건
# numpy 이용
import numpy as np # numpy 라이브러리를 np라는 이름으로 불러오기

# .T = 전치 연산 (행과 열을 바꿈)
# 0 ~ 23까지의 정수로 배열을 만들고, 3행 8열의 전치인 8행 3열로 만들어서 ndarray에 저장
ndarray = np.arange(0, 24).reshape(3, 8).T
print(ndarray) # ndarray 출력