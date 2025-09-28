# a, b를 가지고, 다음 출력을 만드는 프로그램을 작성하시오.
# 조건
# 3가지 방법 이상 작성
import numpy as np
a = np.array([1, 2, 3])
b = np.array([4, 5, 6])
# a.reshape(-1, 1) : 1D -> 2D
# b.reshape(-1, 1) : 1D -> 2D
# axis=1 열 기준으로 합침
print(np.concatenate((a.reshape(-1,1), b.reshape(-1,1)), axis=1))
print(np.column_stack([a,b])) # 1D -> 2D 자동변환
print(np.c_[a,b]) # MATLAB

