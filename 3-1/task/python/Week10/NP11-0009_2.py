# np1 배열에서 3의 배수이거나 5의 배수인 위치정보를 모두 찾아 아래와 같이 x,y 쌍으로 출력하시오.
# 조건
# numpy 이용
# 2가지 방법 모두 작성하시오
# 방법2 : np.where() 이용
import numpy as np # numpy 라이브러리를 np라는 이름으로 불러오기

# 2개의 블록을 만들고, 블록 1개당 3행 4열에 0 ~ 23의 정수를 넣고 np1에 저장
np1 = np.arange(0, 24).reshape(2, 3, 4)

# np1의 3의 배수이거나 5의 배수인 경우 idx배열에 저장
idx = np.where((np1 % 3 == 0) | (np1 % 5 == 0))

# idx의 블록, 행, 열을 zip으로 묶어서 반복하여 i, j, k를 정수 형변환한 후 튜플의 형태로 result에 저장
result = [(int(i), int(j), int(k)) for i, j, k in zip(idx[0], idx[1], idx[2])]
print(result) # result 출력
