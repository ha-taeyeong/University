# np1 배열에서 3의 배수이거나 5의 배수인 위치정보를 모두 찾아 아래와 같이 x,y 쌍으로 출력하시오.
# 조건
# numpy 이용
# 2가지 방법 모두 작성하시오
# 방법1) 3중 반복문
import numpy as np # numpy 라이브러리를 np라는 이름으로 불러오기

# 2개의 블록을 만들고, 블록 1개당 3행 4열에 0 ~ 23의 정수를 넣고 np1에 저장
np1 = np.arange(0, 24).reshape(2, 3, 4)

# 1. i는 np1의 블록(2)만큼, j는 np1의 행(3)만큼, K는 np1의 열(4)만큼 반복
# 2. np1의 원소가 3의 배수이건 5의 배수이면
# 3. i, j, k를 튜플로 result에 저장
result = [(i, j, k) for i in range(np1.shape[0])
                    for j in range(np1.shape[1])
                    for k in range(np1.shape[2])
          if np1[i, j, k] % 3 == 0 or np1[i, j, k] % 5 == 0]
print(result) # result 출력