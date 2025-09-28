# 다음과 같은 random 배열을 만들고, 배열의 처음과 끝에 배열에 존재하지 않는 임의의 원소를 채우는 프로그램을 작성하시오.
# 조건
# np.pad() 함수 사용
# randint() 사용x
import numpy as np # numpy 라이브러리를 np라는 이름으로 불러오기

# 0~9까지 숫자 중에서 무작위로 12개(3x4)를 뽑아 배열 생성
# replace=True: 중복 허용
np1 = np.random.choice(np.arange(10), size = (3, 4), replace=True)

# np1 배열 주변을 4로 패딩
# 상하좌우 1줄씩 추가 (패딩 후 크기: 5x6)
# mode='constant': 고정값 채우기
# constant_values=4: 채울 값 지정
np2 = np.pad(np1, ((1, 1), (1, 1)), mode='constant', constant_values=4)

print(np1) # np1 출력
print(np2) # np2 출력