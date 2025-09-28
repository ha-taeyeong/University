# np1 배열과 같이 체스보드 판을 그리는 프로그램을 작성하시오.
# 방법4 : hstack 을 이용
import numpy as np # numpy 라이브러리를 np라는 이름으로 불러오기

rows, cols = 3, 8 # 행은 3, 열은 8

# 정수형 3행, 1열 배열을 1로 채우고 side 저장
side = np.ones((rows, 1), dtype=int)

# 정수형 3행 6열 배열을 0으로 채우고 middle 저장
middle = np.zeros((rows, cols-2), dtype=int)

# side, middle, side 배열을 수평으로 붙여서 np1에 저장
np1 = np.hstack([side, middle, side])
np1[0, :] = 1 # np1의 1행은 전부 1로 저장
np1[-1, :] = 1 # np1의 마지막행은 전부 1로 저장
print(np1) # np1 출력