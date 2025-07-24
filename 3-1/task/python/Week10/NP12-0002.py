# 임의값으로 3x6 배열을 만들고, 최대 최소값을 출력하는 프로그램을 작성하시오.
# 조건
# np.random.random() 함수 사용
# 소숫점2째 자리까지 표현
# 행별 최소, 최대값을 출력한다. (아래 표 참조)
# 반복문 사용x
# 리스트 사용 x
import numpy as np # numpy 라이브러리를 np라는 이름으로 불러오기

# 0 ~ 1 사이 난수를 소수점 2자리 값으로 np1에 저장
np1 = np.round(np.random.random((3, 6)), 2)

max = np.max(np1, axis=1) # np1 행 기준으로 최대값을 max에 저장
min = np.min(np1, axis=1) # np1 행 기준으로 최소값을 min에 저장
print(max) # max 출력
print(min) # min 출력