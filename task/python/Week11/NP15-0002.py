# 그림과 같이 2차원 배열을 변형하시오.
# 조건
# np1 : 2차원 배열의 리스트 값 생성 (Nested List Comprehension 사용)
# np2 : 상하좌우 테두리에 행과 열을 추가하는 리스트를 만드시오. (numpy 사용)
import numpy as np  # numpy 라이브러리를 np라는 이름으로 불러오기

# 3행 4열의 2차원 리스트 생성. 각 원소는 i*4 + j + 1
np1 = [[i*4 + j + 1 for j in range(4)] for i in range(3)]

# np1의 테두리를 1칸씩 증가하여 np2에 대입 (가장자리 값을 복제해서 확장)
np2 = np.pad(np1, pad_width=1, mode='edge')

# np2를 출력
print(np2)
