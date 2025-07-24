# 다음과 같은 random 배열을 만들고, 배열의 처음과 끝에 배열에 존재하지 않는 임의의 원소를 채우는 프로그램을 작성하시오.
# 조건
# np.pad() 함수 사용
# randint() 사용x
import numpy as np # numpy 라이브러리를 np라는 이름으로 불러오기

# 0~9까지 숫자 중에서 5개를 임의로 뽑아서 np1에 저장
np1 = np.random.choice(np.arange(10), size=5, replace=True)

# np.pad로 앞뒤에 0 추가
np2 = np.pad(np1, (1, 1), mode='constant', constant_values=0)

print(np1)  # np1 출력
print(np2)  # np2 출력