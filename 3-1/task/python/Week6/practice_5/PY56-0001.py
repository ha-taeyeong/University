# n1, n2 시작과 끝 2개의 숫자를 입력받아 리스트 lt 를 만들고 (n2포함),
#
# lt 원소의 홀수만 2를 곱해서 리스트로 출력하는 프로그램을 작성하시오.
#
# 조건
# numpy 의 np.where() 함수를 사용한다.
# Python 3.x 기준
# 입력
# 스페이스로 구분한다.
# 출력
# 리스트 결과를 출력한다.
# 입출력 예
# 입출력 결과와 똑같아야 합니다. (공백, 대소문자, 형식을 정확하게 맞춰주세요)
# 입력 안내 메시지는 생략해주세요
import numpy as np # numpy 함수를 사용하기 위해 모듈 임포트

n1, n2 = map(int, input().split())  # 시작과 끝 숫자 입력받기
lt = np.arange(n1, n2 + 1)  # n1부터 n2까지 배열 생성 (n2 포함)
result = np.where(lt % 2 == 1, lt * 2, 0) # 홀수면 2배, 짝수는 0
result = result[result != 0]  # 0 제거 (짝수 제거)
print(result.tolist())  # 리스트로 변환해 출력