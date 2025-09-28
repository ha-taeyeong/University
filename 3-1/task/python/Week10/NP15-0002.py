# 그림과 같이 2차원 배열을 변형하시오.
# 조건
# np1 : 2차원 배열의 리스트 값 생성 (Nested List Comprehension 사용)
# np2 : 상하좌우 테두리에 행과 열을 추가하는 리스트를 만드시오. (numpy 사용)
import numpy as np # numpy 라이브러리를 np라는 이름으로 불러오기

# np1: 2차원 배열의 리스트 값 생성 (Nested List Comprehension 사용)
# i(0~2) 행을 j(0~3) 열을 생성하며, 각 요소는 i*4+j+1로 계산하여 np1에 저장
np1 = [[i * 4 + j + 1 for j in range(4)] for i in range(3)]

# np1의 상하좌우 행과 열의 1줄씩 가장자리와 같은 값으로 추가하여 np2에 저장
np2 = np.pad(np1, pad_width=((1, 1), (1, 1)), mode='edge')

# 결과 출력
for k in np1:
  print(k)
print(np2)