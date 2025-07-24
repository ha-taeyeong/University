# 1부터 10까지 리스트를 만들고, 홀수에만 2를 곱해서 출력하는 프로그램을 작성하시오.
#
# 조건
# 결과물 사용 제한
# 결과물은 for while 반복문 x ,
# 결과물은 LC 를 사용 x, map() x fiter() x
# numpy mask map 사용
# 리스트값 짝수는 그대로 유지한다.
# Python 3.x 기준
# 입력
# 없음
# 출력
# 리스트 결과를 출력한다.
# 입출력 예
# 입출력 결과와 똑같아야 합니다. (공백, 대소문자, 형식을 정확하게 맞춰주세요)
# 입력 안내 메시지는 생략해주세요
import numpy as np # numpy 함수를 사용하기 위해 모듈 임포트

arr = np.arange(1, 11)  # 1부터 10까지 배열 생성
# mask : 조건 결과로 만들어진 True/False 배열
mask = arr % 2 == 1 # 홀수인 위치만 True
arr[mask] = arr[mask] * 2 # 홀수 위치만 2배
print(arr.tolist()) # 리스트로 변환하여 출력