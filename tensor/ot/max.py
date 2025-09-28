import random # random 함수 불러오기

def find_max(arr): # 사용자 정의 함수
  max_val = arr[0] # 최대값은 배열 첫번째로 세팅
  for num in arr[1:]: # 배열 두번째 요소부터 반복
    if num > max_val: # 배열 요소가 최대값 보다 크면
      max_val = num # 최대값 갱신
  return max_val # 최대값 반환


array = [random.randint(1, 10) for _ in range(10)] # 1~10랜덤 숫자 배열크기 10까지
print(array)

find_max(array)