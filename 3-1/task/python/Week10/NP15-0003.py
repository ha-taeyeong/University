# 그림과 같이 2차원 배열을 만들고, 1차원 리스트 정보를 출력해보자.
# 조건
# np1 : 2차원 배열의 리스트 값 생성 (Nested List Comprehension 사용)
# 왼쪽 상단위치에서 시작해서 시계방향으로의 값을 갖는 리스트를 만드시오.
# 슬라이싱 이용
# 리스트의 총 합을 출력하시오.
import numpy as np # numpy 라이브러리를 np라는 이름으로 불러오기

# i(0~2) 행을 j(0~3) 열을 생성하며, 각 요소는 i*4+j+1로 계산하여 np1에 저장
np1 = [[i * 4 + j + 1 for j in range(4)] for i in range(3)]

result = [] # 시계방향 테두리 값을 저장할 리스트
sum = 0 # 테두리 값의 합계 계산용 변수

# 1. 맨 위 행(0행) 전체 추가 (왼→오)
result += np1[0]

# 2. 오른쪽 열(3열) 추가 (위→아래, 1행~2행)
for i in range(1, 3):
  result.append(np1[i][3])

# 3. 맨 아래 행(2행) 역순 추가 (오→왼, 2열~0열)
result += np1[2][2::-1]

# 4. 왼쪽 열(0열) 추가 (아래→위, 1행만 추가)
for i in range(1, 0, -1): # i=1만 반복 (0행은 이미 추가됨)
  result.append(np1[i][0])

# np1 배열 출력
for row in np1:
    print(row)

# result 출력
print(result)

# 합계 계산 및 출력
for num in result:
    sum += num
print(sum)