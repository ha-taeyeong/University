# 행, 열의 크기를 입력받아서 2차원 배열을 리턴하는 myfct() 함수를 작성하자.
# 조건
# myfct(행크기, 열크기) 호출 예
#   np1 = myfct(3,8)
#   print(np2)
# 테두리는 1로 채운다
# 함수 호출로 만들어진 메모리 구조 예.
import numpy as np # numpy 라이브러리를 np이름으로 불러오기

def myfct(row, col): # 사용자 정의 함수 myfct(행, 열)
  # row, col를 정수형 타입 배열을 만들고, 0으로 채워 arr에 저장
  arr = np.zeros((row, col), dtype=int)
  arr[0, :] = 1  # arr의 첫 번째 행의 값을 1로 저장
  arr[-1, :] = 1 # arr의 마지막 행의 값을 1로 저장
  arr[:, 0] = 1  # arr의 첫 번째 열의 값을 1로 저장
  arr[:, -1] = 1 # arr의 마지막 열의 값을 1로 저장
  return arr     # arr 반환

np1 = myfct(3, 8) # myfct(3, 8) 결과를 np1에 저장
print(np1) # np1 출력