# c,d 를 가지고, 다음 출력을 만드는 프로그램을 작성하시오.
# 조건
# 3가지 방법 이상 작성
import numpy as np
c = np.array([[1, 2, 3],[4, 5, 6]])
d = np.array([[7, 8, 9],[10, 11, 12]])

# R언어 [직관적 이해 예외있음]
print(np.hstack([c,d]))

# R언어 [직관적 이해 예외있음]
print(np.column_stack([c,d]))

# MATLAB
print(np.c_[c, d])

# axis=1 열기준으로 병합
print(np.concatenate((c, d), axis=1)) #axis 를 빼면 안됨 0으로 동작함