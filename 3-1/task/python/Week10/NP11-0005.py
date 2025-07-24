# np1 과 같은 크기의 랜덤 배열을 생성해보자.
# 조건
# np.random.random() 함수 사용
# 소숫점2째 자리까지 표현
import numpy as np # numpy 라이브러리를 np라는 이름으로 불러오기

# 0 ~ 1 사이의 난수를 3행 3열로 만들어주고, 소수점 2자리까지의 값들을 np1에 저장
np1 = np.round(np.random.random((3, 3)), 2)
print(np1) # np1 출력