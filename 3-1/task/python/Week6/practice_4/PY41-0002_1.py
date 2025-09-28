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
sorted_data = sorted(data) # 정렬된 data 리스트 = data 리스트 정렬한다.
n = len(sorted_data) # 정정렬된 data 리스트의 길이
if n % 2 == 0: # data 리스트 길이가 짝수인 경우
    # 중간 값 = 중앙 두 값의 평균(// : 나눗셈 몫의 정수 값을 계산해주는 연산자)
    median = (sorted_data[n//2 - 1] + sorted_data[n//2]) / 2
else: # data 리스트 길이가 짝수가 아닌 경우
    median = sorted_data[n//2] # 중간 값 = 데이터 중간 값

# 일반 출력
print(f"합계:{total}") # 합계 출력
print(f"평균:{mean}") # 평균 출력
print(f"분산:{variance}") # 분산 출력
print(f"표준편차:{std_dev:.2f}") # 표준편차 출력
print(f"최대값:{maximum}") # 최대값 출력
print(f"최소값:{minimum}") # 최소값 출력
print(f"중간값:{median}") # 중간값 출력