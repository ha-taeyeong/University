# np1 배열을 만들고, 행의합과 열의합을 순서대로 결합해서 새로운 행렬(np2) 을 출력해보자.
# 조건
# 방법1 : numpy 배열이용 (반복문x)
import numpy as np # numpy 라이브러리를 np라는 이름으로 불러오기

# 0~12의 값을 3행 4열로 만들어 np1에 저장
np1 = np.arange(12).reshape(3, 4)

row_sums = np1.sum(axis=1) # np1의 행 기준의 합
col_sums = np1.sum(axis=0) # np1의 열 기준의 합

np2 = np.vstack([np1, col_sums]) # np1의 열의 합을 np1에 수직으로 붙여서 np2에 저장

total_sum = np1.sum() # np1의 전체 합을 total_sum에 저장

# row_sums에 total_sum을 추가하고, 수직행렬로 만듬
row_sums = np.append(row_sums, total_sum).reshape(-1, 1)

# np2에 row_sums를 수평으로 붙여서 np2에 저장
np2 = np.hstack([np2, row_sums])

# 결과 출력
print(np1)
print(np2)