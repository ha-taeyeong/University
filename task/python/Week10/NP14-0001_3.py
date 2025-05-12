# np1 배열과 같이 체스보드 판을 그리는 프로그램을 작성하시오.
# 방법3 : vstack 을 이용
import numpy as np # numpy 라이브러리를 np라는 이름으로 불러오기
rows, cols = 3, 8 # 행은 3, 열은 8
# 정수형 1행, 8열 배열을 1로 채우고 top_bottom 저장
top_bottom = np.ones((1, cols), dtype=int)

# 정수형 1행, 8열 배열을 0으로 채우고 middle 저장
middle = np.zeros((1, cols), dtype=int)
middle[0, 0] = 1 # 1행 1열은 1로 저장
middle[0, -1] = 1 # 1행 마지막열은 1로 저장

# top_bottom, middle, top_bottom을 수직으로 붙여서 np1에 저장
np1 = np.vstack([top_bottom, middle, top_bottom])

print(np1) # np1 출력