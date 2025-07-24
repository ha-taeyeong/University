#딕셔너리 생성 방법3 (key-value 쌍 리스트 이용)
lt1 = []
for kk in range(1, 10):
  for dan in [2, 4, 7]:
    lt1.append((f"{dan} x {kk}", dan*kk))
dic1 = dict(lt1)

# 딕셔너리 출력
for kk in range(1, 10):
  for dan in [2, 4, 7]:
    str1 = f"{dan} x {kk}"
    print(f"{dan} x {kk} = {dic1[str1]:2d}      " , end = "")
  print("")