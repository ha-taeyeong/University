# 다음과 같은 5x6 배열 np1을 만들고, 3 값을 3의 위치에 있는 주변값들의 평균값으로 치환한 배열 np2 를 만드는 프로그램을 작성하시오.
# 조건
# 연산 순서는 좌상 부터 우하로 진행한다.
# 연산에 필요한 테두리값은 가장 가까운 값을 사용하도록 한다.
# 주변값(Mask)은 자신값을 포함한 9개를 사용한다.
# np.pad() 함수 사용
# randint() 사용x
import numpy as np # numpy 라이브러리를 np라는 이름으로 불러오기

# 0~9까지 숫자 중에서 무작위로 30개(5x6)를 뽑아 배열 생성
# replace=True: 중복 허용
np1 = np.random.choice(np.arange(15), size = (5, 6), replace=True)

# 가장 가까운 값으로 상하좌우 1줄씩 패딩
pad_np1 = np.pad(np1, ((1,1),(1,1)), mode='edge')

# np1과 같은 크기의 0.0(실수형) 배열을 np2에 생성
np2 = np.zeros_like(np1, dtype=float)
for i in range(5): # i는 0~4까지 반복
  for j in range(6): # j는 0~5까지 반복
    # (i, j)를 좌상단으로 하는 3x3 영역(부분 배열)을 mask에 저장
    mask = pad_np1[i:i+3, j:j+3]
    # mask 배열들의 평균값을 np2에 저장
    np2[i, j] = np.mean(mask)

# 소수점 2자리로 출력 (과학적 표기법 억제)
np.set_printoptions(precision=2, suppress=True)
print(np1) # np1 출력

# np.array2string : 배열을 문자열로 변환
# formatter를 사용해 모든 실수를 항상 소수점 둘째자리까지(빈자리는 0으로) 문자열로 변환
print(np.array2string(np2, formatter={'float_kind': lambda x: "%.2f" % x}))