# 0부터 9까지 자연수 10개를 랜덤 원소로 가지는 리스트를 3가지 방법으로 각각 만들어보자
# 방법1
import random

s = set() # 중복을 허용하지 않는 집합(set) 선언
while len(s) < 10:  # 집합 s의 원소 개수가 10개가 될 때까지 반복
    s.add(random.randint(0, 9))  # 0~9 사이의 랜덤 정수를 중복 없이 추가

nums = list(s)  # 집합(set)을 리스트로 변환
random.shuffle(nums)  # 리스트 요소들의 순서를 랜덤하게 섞기
print(nums) # 섞은 nums 리스트 출력



# 방법2
import random

nums = [] # 빈 리스트 선언

while len(nums) < 10: # nums 리스트의 원소 개수가 10개가 될 때까지 반복
  num = random.randint(0, 9) # 0~9 사이의 랜덤 정수를 생성

  is_duplicate = False # 중복 여부를 저장할 변수 (초기값: 중복 없음)
  for n in nums: # num 리스트 각 요소를 n에 대입하여 반복
    if n == num: # n과 num이 같으면
      is_duplicate = True # 중복 있음 표시
      break # 반복문 종료

  if not is_duplicate: # 중복이 아닌 경우
    nums.append(num) # nums 리스트에 num 추가

print(nums) # nums 리스트 출력


# 방법3
import random

# 0~9 중에서 10개를 중복 없이 랜덤하게 선택
nums = random.sample(range(10), 10)
print(nums) # 선택된 nums 리스트 출력