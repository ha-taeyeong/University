# 두 개의 리스트가 주어졌을 때, 두 리스트에 포함된 원소의 종류와 각각의 개수가 동일한지 판단하는 프로그램을 작성하시오.
# 두 리스트가 다를 경우, 어떤 원소가 얼마나 다른지까지 함께 출력하는 기능을 구현하시오.
# 방법1
import ast # ast 모듈을 가져온다

# ast.literal_eval : 입력된 문자열을 안전하게 리스트로 변환
lt1 = ast.literal_eval(input("lt1 = ")) # lt1 입력
lt2 = ast.literal_eval(input("lt2 = ")) # lt2 입력

# lt1에서 원소 개수 세기
c1 = {} # c1 딕셔너리 선언
for num in lt1: # lt1의 각 문자를 num에 대입하여 반복
  if num in c1: # c1 딕셔너리에 num 키가 존재하면
    c1[num] += 1 # c1[num] 값을 1 증가시킨다
  else: # c1 딕셔너리에 num 키가 없으면
    c1[num] = 1 # c1[num]에 1을 저장한다 (처음 등장)

# lt2에서 원소 개수 세기
c2 = {} # c2 딕셔너리 선언
for num in lt2: # lt2의 각 문자를 num에 대입하여 반복
  if num in c2: # c2 딕셔너리에 num 키가 존재하면
    c2[num] += 1 # c2[num] 값을 1 증가시킨다
  else: # c2 딕셔너리에 num 키가 없으면
    c2[num] = 1 # c1[num]에 1을 저장한다 (처음 등장)

# 비교
if c1 == c2: # c1과 c2가 같다면 (원소 종류와 개수가 모두 같음)
  print(f"{lt1} 와 {lt2} 의 원소의 종류와 갯수가 같습니다.")
else: # c1과 c2가 다르면
  print(f"{lt1} 와 {lt2} 의 원소의 종류와 갯수가 다릅니다.")

  # lt1이 더 많은 원소 찾기
  diff1 = {} # diff1 딕셔너리 선언
  for k in c1: # c1 딕셔너리의 각 키를 k에 대입하여 반복
    if k not in c2: # c2에 k 키가 존재하지 않으면
      diff1[k] = c1[k] # c1[k]를 diff1[k]에 저장
    elif c1[k] > c2[k]: # c1[k]가 c2[k]보다 크다면
      diff1[k] = c1[k] - c2[k] # (c1[k] - c2[k]) 값을 diff2[k]에 저장

  # lt2가 더 많은 원소 찾기
  diff2 = {} # diff2 딕셔너리 선언
  for k in c2: # c2 딕셔너리의 각 키를 k에 대입하여 반복
    if k not in c1: # c1에 k 키가 존재하지 않다면
      diff2[k] = c2[k] # c2[k]를 diff2[k]에 저장
    elif c2[k] > c1[k]: # c2[k]가 c1[k]보다 크면
      diff2[k] = c2[k] - c1[k] # (c2[k] - c1[k]) 값을 diff2[k]에 저장

  if diff1: # diff1에 값이 있다면 (lt1이 더 많은 원소가 있다면)
    # diff1의 원소(k)와 개수(v)를 하나씩 꺼내 반복
    for k, v in diff1.items():
      print(f"lt1 리스트 {k}가 {v}개 더 많습니다.")

  if diff2: # diff2에 값이 있다면 (lt2이 더 많은 원소가 있다면)
    # diff2의 원소(k)와 개수(v)를 하나씩 꺼내 반복
    for k, v in diff2.items():
      print(f"lt2 리스트 {k}가 {v}개 더 많습니다.")

# 방법2
# collections 모듈 안에 있는 Counter를 가져온다
from collections import Counter
import ast # ast 모듈을 가져온다

# ast.literal_eval : 입력된 문자열을 안전하게 리스트로 변환
lt1 = ast.literal_eval(input("lt1 = ")) # lt1 입력
lt2 = ast.literal_eval(input("lt2 = ")) # lt2 입력

c1 = Counter(lt1) # c1에 lt1의 원소별 개수를 세어 저장
c2 = Counter(lt2) # c2에 lt2의 원소별 개수를 세어 저장

if c1 == c2: # c1과 c2이 같다면 (원소 종류와 개수가 모두 같음)
  print(f"{lt1} 와 {lt2} 의 원소의 종류와 갯수가 같습니다.")
else: # c1, c2이 같지 않으면
  print(f"{lt1} 와 {lt2} 의 원소의 종류와 갯수가 다릅니다.")

  diff1 = c1 - c2 # (c1 - c2)를 diff1에 저장 (lt1에만 더 많은 원소들)
  diff2 = c2 - c1 # (c2 - c1)diff2에 저장 (lt2에만 더 많은 원소들)

  if diff1: # diff1에 값이 있다면 (lt1이 더 많은 원소가 있다면)
    # diff1의 원소(k)와 개수(v)를 하나씩 꺼내 반복
    for k, v in diff1.items():
      print(f"lt1 리스트 {k}가 {v}개 더 많습니다.")

  if diff2: # diff2에 값이 있다면 (lt2가 더 많은 원소가 있다면)
    # diff2의 원소(k), 개수(v)를 하나씩 꺼내 반복
    for k, v in diff2.items():
      print(f"lt2 리스트 {k}가 {v}개 더 많습니다.")