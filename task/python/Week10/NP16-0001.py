# 다음 그림과 같이 3차원 np1 배열을 만들고, 각 평면에 2와 4를 더한 새로운 3차원 배열을 만드는 프로그램을 작성하시오.
# 조건
# 브로드케스팅 이용
import numpy as np # numpy 라이브러리를 np라는 이름으로 불러오기

# 0~23까지의 수를 2블록 3행 4열 3차원 배열로 생성
# ▶ reshape(2,3,4): (블록, 행, 열)
np1 = np.arange(24).reshape(2, 3, 4)
print(np1)

# 블록별 더할 값 [2, 4]를 3차원 형태(2,1,1)로 변환
# ▶ -1: 차원 자동 계산 (2개 블록)
# ▶ 1x1: 브로드캐스팅을 위해 행/열 차원 확장
add_values = np.array([2, 4]).reshape(-1, 1, 1)

# 브로드캐스팅으로 각 블록에 다른 값 더하기
# ▶ 첫 번째 블록: 모든 요소 +2
# ▶ 두 번째 블록: 모든 요소 +4
np2 = np1 + add_values

print(np2)