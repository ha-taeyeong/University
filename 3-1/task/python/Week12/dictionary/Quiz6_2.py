# 딕셔너리 생성 방법2 (zip 함수이용)
lt1 = []
lt2 = []
for kk in range(1, 10):
  for dan in [2, 4, 7]:
    lt1.append(f"{dan} x {kk}")
    lt2.append(dan*kk)
dic1 = dict(zip(lt1,lt2))

# 딕셔너리 출력
for kk in range(1, 10):
  for dan in [2, 4, 7]:
    str1 = f"{dan} x {kk}"
    print(f"{dan} x {kk} = {dic1[str1]:2d}      " , end = "")
  print("")