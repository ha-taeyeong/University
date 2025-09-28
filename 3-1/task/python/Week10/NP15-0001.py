# 그림과 같이 2차원 배열을 변형하시오.
# 조건
# np1 : 2차원 배열의 리스트 값 생성 (Nested List Comprehension 사용)
# np2 : 중심부의 값을 0 로 만드시오. (슬라이싱)
import copy # copy 라이브러리 불러오기

# np1: 2차원 배열의 리스트 값 생성 (Nested List Comprehension 사용)
# i(0~2)가 행을, j(0~3)가 열을 생성하며, 각 요소는 i*4 + j +1로 계산
np1 = [[i * 4 + j + 1 for j in range(4)] for i in range(3)]

# np2: np1의 깊은 복사 후 중심부(2행 2-3열) 값을 0으로 변경
np2 = copy.deepcopy(np1)
np2[1][1:3] = [0, 0] # 2행(인덱스 1)의 2-3열(인덱스 1:3)을 0으로 할당

# 결과 출력
for k in np1:
  print(k)
print()
for k in np2:
  print(k)