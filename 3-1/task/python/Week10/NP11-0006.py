# 다음 프로그램의 배열을 그려보자.
# 조건
# 네모상자를 그리고 값을 채운다.
# 왼쪽부터 1,2,3 면을 의미함
import numpy as np # numpy 라이브러리를 np라는 이름으로 불러오기

# 0 ~ 23의 정수를 3개의 블록, 블록 1개당 4행 2열로 만들고 aaa에 저장
aaa = np.arange(0,24).reshape(3,4,2)
print(aaa) # aaa 출력