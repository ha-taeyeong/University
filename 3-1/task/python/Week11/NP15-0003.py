# 그림과 같이 2차원 배열을 만들고, 1차원 리스트 정보를 출력해보자.
# 조건
# np1 : 2차원 배열의 리스트 값 생성 (Nested List Comprehension 사용)
# 왼쪽 상단위치에서 시작해서 시계방향으로의 값을 갖는 리스트를 만드시오.
# 슬라이싱 이용
# 리스트의 총 합을 출력하시오.
import numpy as np  # numpy 라이브러리를 np라는 이름으로 불러오기

# 3행 4열의 2차원 리스트 생성. 각 원소는 i*4 + j + 1
np1 = [[i*4+j+1 for j in range(4)] for i in range(3)]

clockwise = (
    np1[0][:] +                  # np1의 0번째 행 전체 (왼쪽에서 오른쪽)
    [np1[1][3]] + [np1[2][3]] +  # np1 1번째 행 3번째 열, np1 2번째 행 3번째 열 (오른쪽 세로)
    np1[2][2::-1] +              # np1 2번째 행의 2~0번째 열 (오른쪽에서 왼쪽으로 역순)
    [np1[1][0]]                  # np1 1번째 행 0번째 열 (왼쪽 세로)
)

# np1의 각 행(row)을 출력
for row in np1:
    print(row)
print()

print(clockwise)         # 시계방향으로 추출한 리스트 출력
print(np.sum(clockwise)) # 시계방향 리스트의 총합 출력
