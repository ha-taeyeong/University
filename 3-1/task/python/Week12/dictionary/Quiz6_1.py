# 다음과 같이 구구단 2,4,7단을 출력하도록 하시오
# 조건
# 구구단 연산을 key 로 하고, 값을 value 로 하는 딕셔너리를 만들어서 작업하시오.
# key : "2 x 1" , "2 x 2" …
# value : 2 , 4 …

# 딕셔너리 생성 방법1 ([]이용 key-value 추가)
dic1 = {}
for kk in range(1, 10):
  for dan in [2, 4, 7]:
    dic1[f"{dan} x {kk}"] = dan*kk

# 딕셔너리 출력
for kk in range(1, 10):
  for dan in [2, 4, 7]:
    str1 = f"{dan} x {kk}"
    print(f"{dan} x {kk} = {dic1[str1]:2d}      " , end = "")
  print("")