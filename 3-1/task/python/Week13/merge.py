import numpy as np
a = np.array([1, 2, 3])
b = np.array([1, 2, 3])
# a.shape # (3,)
# a.reshape(-1,1) # 2D행렬
# a.reshape(-1,1).shape #(3, 1)
# a.T # 1차원에서는 변경불가

print(np.hstack((a,b))) # array([1, 2, 3, 1, 2, 3])
print(np.vstack((a,b))) # 2D
print(np.vstack((a,b)).T)