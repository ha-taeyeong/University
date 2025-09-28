# 그림과 같이 2차원 배열을 변형하시오.
# 조건
# np1 : 2차원 배열의 리스트 값 생성 (Nested List Comprehension 사용)
# np2 : 중심부의 값을 0 로 만드시오. (슬라이싱)
import copy  # copy 라이브러리 불러오기

# 3행 4열의 2차원 리스트 생성. 각 원소는 i*4 + j + 1
np1 = [[i*4 + j + 1 for j in range(4)] for i in range(3)]

# np1을 깊은 복사하여 np2에 저장 (서로 독립적인 2차원 리스트가 됨)
np2 = copy.deepcopy(np1)

# np2의 1행(두 번째 행)에서 1, 2번째 열의 값을 0으로 변경
np2[1][1:3] = [0, 0]

# np1의 각 행(row)을 출력
for row in np1:
    print(row)
print()

# np2의 각 행(row)을 출력
for row in np2:
    print(row)
