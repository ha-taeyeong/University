# 주사위 1개와 동전1개를 10번 중복가능 추출한 결과를 출력하시오
# 방법1
import random

result = [] # result 리스트 선언

for _ in range(10): # 10번 반복
  # 랜덤정수 0~1을 생성 -> 0이면 'H', 1이면 'T'생성하여 coin에 저장
  coin = 'H' if random.randint(0, 1) == 0 else 'T'
  dice = random.randint(1, 6) # 1~6까지 랜덤 정수를 생성하여 dice에 저장
  result.append((coin, dice)) # (coin, dice) 튜플을 result 리스트에 추가

# 첫 번째 원소를 대괄호 [로 감싸서 출력, 콤마(,) 추가
print(f"[{result[0]},")

for i in range(1, len(result)): # 인덱스 1부터 result 끝까지 반복
  if i != len(result) - 1: # 마지막 원소가 아니라면
    # (문자, 숫자) 형태로 출력하고 콤마(,) 추가
    print(f" ('{result[i][0]}', {result[i][1]}),")
  else: # 마지막 원소라면
    # (문자, 숫자) 형태로 출력하고 콤마 없이 대괄호로 닫고 출력
    print(f" ('{result[i][0]}', {result[i][1]})]", end="")



# 방법2
import random

result = [] # result 리스트 선언

for _ in range(10): # 10번 반복
  # 'H', 'T'를 랜덤 선택하여 coin에 저장
  coin = random.choices(['H', 'T'])[0]
  # 1,2,3,4,5,6을 랜덤 선택하여 dice에 저장
  dice = random.choices([1, 2, 3, 4, 5, 6])[0]
  # (coin, dice) 튜플을 result 리스트에 추가
  result.append((coin, dice))

# 첫 번째 원소를 대괄호 [로 감싸서 출력, 콤마(,) 추가
print(f"[{result[0]},")
for i in range(1, len(result)): # 인덱스 1부터 result 끝까지 반복
  if i != len(result) - 1: # 마지막 원소가 아니라면
    # (문자, 숫자) 형태로 출력하고 콤마(,) 추가
    print(f" ('{result[i][0]}', {result[i][1]}),")
  else: # 마지막 원소라면
    # (문자, 숫자) 형태로 출력하고 콤마 없이 대괄호로 닫고 출력
    print(f" ('{result[i][0]}', {result[i][1]})]", end="")