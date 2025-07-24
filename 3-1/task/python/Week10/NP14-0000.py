# 다음 프로그램의 결과를 작성하시오.
import numpy as np
a = np.array([1, 2, 3])
b = np.array([4, 5, 6])

c = np.array([[1, 2, 3],[4, 5, 6]])
d = np.array([[7, 8, 9],[10, 11, 12]])

# np.hstack([]) = 수평(horizontal, 가로)으로 붙여서 하나의 배열로 만든다.

print(np.hstack([a,b])) # a, b를 가로로 붙여서 1차원 배열을 만든다.

print(np.hstack([c,d])) # c, d를 가로로 붙여서 1차원 배열을 만든다.

# a, d를 가로로 붙여서 1차원 배열을 만든다.
# 행 개수가 다르기 때문에 오류이다.
# print(np.hstack([a,d]))

# a와 마지막 원소를 제외한 b를 가로로 붙여서 1차원 배열을 만든다.
print(np.hstack([a,b[:-1]]))

# c와 마지막 원소를 제외한 d를 가로로 붙여서 1차원 배열을 만든다.
# 행 개수가 다르기 때문에 오류이다.
# print(np.hstack([c,d[:-1]]))


# np.r_[] = 1차원이면 가로로 붙이고, 2차원 이상이면 아래 행으로 붙여서 하나의 배열로 만든다.
# a, b를 가로로 붙여서 1차원 배열을 만든다.
print(np.r_[a, b])

# a, b를 행 방향(아래)으로 붙여서 2차원 배열을 만든다.
print(np.r_[[a], [b]])

# a, c를 행 방향(아래)으로 붙여서 2차원 배열을 만든다.
print(np.r_[[a], c])

# a, c를 행 방향(아래)으로 붙여서 2차원 배열을 만든다.
print(np.r_[c, d])

# np.c_[] = 열 방향(가로)으로 붙여서 1차원 배열로 만드는 함수
# 배열 c, b 열 방향(가로)으로 붙여서 1차원 배열로 만든다.
print(np.c_[c, d])

# np.concatenate((), axis=0)
# 결과가 1차원 배열이면 가로로 붙이고, 2차원 배열이면 세로로 붙인다.
# a, b를 가로로 붙여서 1차원 배열을 만든다.
print(np.concatenate((a,b), axis=0))

# 0 ~ 5까지 0.5씩 증가하여 가로로 붙인다.
print(np.r_[0:5:0.5])

# 0 ~ 5까지 0.5씩 증가하여 세로로 붙인다.
print(np.c_[0:5:0.5])

# np.vstack() = 수직으로 붙여서 하나의 배열로 만드는 함수
# a, b를 수직으로 붙여서 1차원 배열로 만든다.
print(np.vstack([a,b]))

# c, d를 수직으로 붙여서 1차원 배열로 만든다.
print(np.vstack([c,d]))

# a, c를 수직으로 붙여서 1차원 배열로 만든다.
print(np.vstack([a,c]))

# a, b를 수직으로 붙여서 2차원 배열로 만든다.
print(np.r_[[a], [b]])

# a, c를 수직으로 붙여서 2차원 배열로 만든다.
print(np.r_[[a], c])

# c, d를 수직으로 붙여서 1차원 배열로 만든다.
print(np.r_[c, d])

# a, b를 행 기준(axis=0)으로 붙여서 1차원 배열을 만든다.
print(np.concatenate((a,b), axis=0))

# 오류, 1차원 배열은 열이 없기 때문에 열 기준(axis=1)으로 붙일 수 없다.
# print(np.concatenate((a,b), axis=1))

# a, b를 행 기준으로 붙이고 2차원 배열을 만든다.
print(np.concatenate(([a],[b]), axis=0))

# a, b를 열 기준으로 붙이고 2차원 배열을 만든다.
print(np.concatenate(([a],[b]), axis=1))

# np.column_stack() = 여러 배열을 열 방향(가로, axis=1)으로 붙여 2차원 배열을 만드는 함수
# a, b가 1차원 배열이면 각각 열 벡터로 변환하여 2차원 배열을 만든다.
print(np.column_stack([a, b]))

# c, d가 2차원 배열이면, 그대로 열 방향(가로)으로 붙여 2차원 배열을 만든다.
print(np.column_stack([c, d]))

# np.c_[] = 여러 배열을 열 방향(가로, axis=1)으로 붙여 2차원 배열을 만드는 도구
# a, b가 1차원 배열이면, 각각 열 벡터로 변환되어 2차원 배열이 된다.
print(np.c_[a, b])

# c, d가 2차원 배열이면, 그대로 열 방향(가로)으로 붙여 2차원 배열을 만든다.
print(np.c_[c, d])

# a_reshaped와 b_reshaped를 열 방향(가로, axis=1)으로 붙여서 하나의 2차원 배열로 만든다.
# a_reshaped, b_reshaped가 선언되지 않아 오류
# print(np.concatenate((a_reshaped, b_reshaped), axis=1))