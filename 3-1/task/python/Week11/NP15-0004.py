# np1 배열을 만들고, 행의합과 열의합을 순서대로 결합해서 새로운 행렬(np2) 을 출력해보자.
# 조건
# 방법1 : numpy 배열이용 (반복문x)
import numpy as np  # numpy 라이브러리를 np라는 이름으로 불러오기

np1 = np.arange(12).reshape(3, 4)  # 0~11까지 수를 3행 4열 배열로 생성 후 np1에 저장

# 1. 행(row)별 합계 계산 및 추가
row_sums = np1.sum(axis=1).reshape(-1, 1)  # 각 행의 합을 계산하고 열 벡터로 변환
np3 = np.hstack((np1, row_sums))           # np1 오른쪽에 행 합계 열 추가 (가로로 연결)

# 2. 열(column)별 합계 계산 및 추가
col_sums = np3.sum(axis=0)                 # 각 열의 합 계산 (마지막 행에 추가될 값)
np3 = np.vstack((np3, col_sums))           # np3 아래쪽에 열 합계 행 추가 (세로로 연결)

# 결과 출력
print(np1) # 원본 배열
print()
print(np3) # 행/열 합계 추가된 배열 출력
