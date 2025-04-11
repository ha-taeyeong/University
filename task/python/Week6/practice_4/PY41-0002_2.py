# 1부터 100까지 자연수(100개) 의 평균,표준편차,분산,최대값,최소값,중간값 6개를 모두 출력하시오
# 조건
# 입력값이 1부터 100 이외의 값인 경우에도 정상 동작하도록 계산식에 상수를 직접 사용하지 않는다.
# 오답 : (1+100)/2 (x) , avg = sum/100 (x)
# 입력값이 랜덤하게 중복해서 섞여있을 수 있다.
# 방법1 : for문을 사용하시오.
# sorted() 함수를 사용
# 방법2 : numpy 이용
# 입력
# 입력값은 공백으로 구분한다.
# 출력
# 일반 출력
# 리스트 출력
# 딕셔너리 출력
# 입출력 예
# 입출력 결과와 똑같아야 합니다. (공백, 대소문자, 형식을 정확하게 맞춰주세요)
# 입력 안내 메시지는 생략해주세요
# 방법2 numpy
import numpy as np  # numpy 라이브러리 불러오기

# NumPy Provides
#   1. 배열 객체 제공
#   2. 빠른 수학 연산
#   3. 선형대수, 푸리에변환, 난수 생성 등

data = np.arange(1, 101)  # 1 ~ 100까지 숫자를 생성하여 numpy 배열로 저장

# 통계 계산
mean = np.mean(data)  # 평균
variance = np.var(data) # 분산
std_dev = np.std(data)  # 표준편차
maximum = np.max(data)  # 최대값
minimum = np.min(data)  # 최소값
median = np.median(data)  # 중간값

# 일반 출력
print(f"합계:{np.sum(data)}") # 합계 출력
print(f"평균:{mean}") # 평균 출력
print(f"분산:{variance}") # 분산 출력
print(f"표준편차:{std_dev:.2f}")  # 표준편차 소수 둘째자리까지 출력
print(f"최대값:{maximum}")  # 최대값 출력
print(f"최소값:{minimum}")  # 최소값 출력
print(f"중간값:{median}") # 중간값 출력