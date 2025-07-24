# np1 배열에서 3의 배수이거나 5의 배수인 위치정보를 모두 찾아 아래와 같이 x,y 쌍으로 출력하시오.
# 조건
# np1 배열을 만들면서 시작한다.
# 방법2 : np.where() 이용
# 방법2 : np.where() 이용
import numpy as np # numpy 라이브러리를 np라는 이름으로 불러오기

# 0 ~ 17의 정수를 3행, 6열 형태의 배열로 생성 후 np1에 저장
np1 = np.arange(0, 18).reshape(3, 6)

# np1의 3의 배수이거나 5의 배수인 경우 idx배열에 저장
idx = np.where((np1 % 3 == 0) | (np1 % 5 == 0))

# idx의 행과 열을 zip으로 묶어서 반복하여 i, j를 정수 형변환한 후 튜플의 형태로 result에 저장
result = [(int(i), int(j)) for i, j in zip(idx[0], idx[1])]
print(result) # result 출력
