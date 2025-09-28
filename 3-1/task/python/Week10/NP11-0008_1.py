# np1 배열에서 3의 배수이거나 5의 배수인 위치정보를 모두 찾아 아래와 같이 x,y 쌍으로 출력하시오.
# 조건
# np1 배열을 만들면서 시작한다.
# 방법1 : LC 이용
import numpy as np # numpy 라이브러리를 np라는 이름으로 불러오기

# 0 ~ 17의 정수를 3행, 6열 형태의 배열로 생성 후 np1에 저장
np1 = np.arange(0, 18).reshape(3, 6)

# 1. i는 np1의 행(3)만큼 반복, j는 np1의 열(6)만큼 반복
# 2. np1의 원소가 3의 배수이거나 5의 배수이면
# 3. i와 j를 튜플로 result에 저장
result = [(i, j) for i in range(np1.shape[0]) for j in range(np1.shape[1])
          if np1[i, j] % 3 == 0 or np1[i, j] % 5 == 0]
print(result) # result 출력