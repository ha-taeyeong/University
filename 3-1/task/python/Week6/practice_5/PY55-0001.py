# 1부터 10까지 리스트를 만들고, 홀수에만 2를 곱해서 출력하는 프로그램을 작성하시오.
#
# 조건
# 결과물 사용 제한
# 결과물은 for while 반복문 x ,
# 결과물은 LC 를 사용 x, map() x fiter() x
# numpy.where() 사용
# 리스트값 짝수는 제거 한다.
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
# np.where(조건, 참일 때 값, 거짓일 때 값)
result = np.where(arr % 2 == 1, arr * 2, 0)  # 홀수는 2배, 짝수는 0
result = result[result != 0]  # 0인 요소(짝수 처리된 값) 제거
print(result.tolist())  # 리스트로 변환해 출력
