# 성적이 90 점 이상인 학생정보를 선택해서 출력하시오
dic1 = {'A':100,'B':80,'C':99,'D':70}
print(dic1)

# 반복문이용
dic2 = {}
for kk, vv in dic1.items():
  if vv>=90:
    print(kk, vv)
    dic2[kk] = vv
print(dic2)

# DC를 이용
print({ kk : vv for kk, vv in dic1.items() if vv>=90 })