import numpy as np
a = np.array([1, 2, 3])
b = np.array([4, 5, 6])

c = np.array([[1, 2, 3],[4, 5, 6]])
d = np.array([[7, 8, 9],[10, 11, 12]])

# 방법1
# np.concatenate((c, d), axis=1)
print("np.concatenate 행 병합")
print(np.concatenate((a, b), axis=0))
print(np.concatenate((c, d), axis=0))

print("np.concatenate 열 병합")
# print(np.concatenate((a, b), axis=1)) # 1차원 배열이므로 열로 쌓을 수 없다.
print(np.concatenate((c, d), axis=1))
# 방법2
# np.vstack # axis=0(row)
# np.hstack # axis=1(col)
print("np.vstack 행 병합")
print(np.vstack((a, b)))
print(np.vstack((c, d)))

print("np.hstack 열 병합")
print(np.vstack((a, b)))
print(np.vstack((c, d)))

# 방법3
# np.column_stack() # 열벡터를 붙이는 함수
print("np.column_stack() 열 병합")
print(np.column_stack((a, b)))
print(np.column_stack((c, d)))

#방법4
# np.r_[]
print("np.r_[] 행 병합")
print(np.r_[a, b])
print(np.r_[c, d])

# np.c_[]
print("np.c_[] 열 병합")
print(np.c_[a, b])
print(np.c_[c, d])

