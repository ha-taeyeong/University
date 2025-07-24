# 다음 그림과 같은 3차원 ndarray 데이터 배열을 만드시오.
# 조건
# numpy 이용
# 왼쪽부터 1,2,3 면을 의미함
import numpy as np # numpy 라이브러리를 np라는 이름으로 불러오기

# 0 ~ 23의 정수를 3개의 블록, 블록 1개당 4행 2열로 만들고 ndarray에 저장
ndarray = np.arange(0, 24).reshape(3, 4, 2)
print(ndarray) # ndarray 출력