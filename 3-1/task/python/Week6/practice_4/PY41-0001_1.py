# 1부터 100까지 자연수(100개) 의 평균,표준편차,분산,최대값,최소값 5개를 모두 출력하시오
# 조건
# 입력값이 1부터 100 이외의 값인 경우에도 정상 동작하도록 계산식에 상수를 직접 사용하지 않는다.
# 오답 : (1+100)/2 (x) , avg = sum/100 (x)
# 방법1) for문을 사용하시오.
# 방법2) numpy 를 이용하시오
# 입출력 예
# 입출력 결과와 똑같아야 합니다. (공백, 대소문자, 형식을 정확하게 맞춰주세요)
# 입력 안내 메시지는 생략해주세요

# 방법1 for
data = list(range(1, 101)) # 1 ~ 100까지 리스트로 변환

# 평균
total = 0 # 합계 초기화
for kk in data: # 리스트 요소 만큼 반복
  total += kk # 리스트 요소 합계
mean = total / len(data) # 평균 = 합계 / 리스트 길이

# 분산
var_sum = 0 # 합계 초기화
for kk in data: # 리스트 요소 만큼 반복
  var_sum += (kk - mean) ** 2 # (리스트 요소 - 평균)제곱의 합계
variance = var_sum / len(data) # 분산 = 합계 / 리스트 길이

# 표준편차
std_dev = variance ** 0.5 # 분산의 제곱근

# 최대값, 최소값
maximum = data[0] # 최대값 = 리스트0번째로 초기화
minimum = data[0] # 최소값 = 리스트0번째로 초기화
for kk in data: # 리스트 요소 만큼 반복
  if kk > maximum: # 리스트 요소가 최대값 보다 크다면
    maximum = kk # 최대값에 리스트 요소를 저장
  if kk < minimum: # 리스트 요소가 최소값 보다 작다면
    minimum = kk # 최소값에 리스트 요소를 저장

# 중간값
mid_index = len(data) // 2 # data 리스트 길이를 2로 나눈 몫의 정수 나누셈
if len(data) % 2 == 0: # data 리스트 길이가 짝수인 경우
    median = (data[mid_index - 1] + data[mid_index]) / 2 # 중간 값 = 중앙 두 값의 평균
else: # data 리스트 길이가 짝수가 아닌 경우
    median = data[mid_index] # 중간 값 = 데이터 중간 값

# 일반 출력
print(f"합계:{total}") # 합계 출력
print(f"평균:{mean}") # 평균 출력
print(f"분산:{variance}") # 분산 출력
print(f"표준편차:{std_dev:.2f}") # 표준편차 출력
print(f"최대값:{maximum}") # 최대값 출력
print(f"최소값:{minimum}") # 최소값 출력