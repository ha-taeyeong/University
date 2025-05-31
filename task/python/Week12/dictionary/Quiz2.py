# 성적이 70,80,90 점인 학생정보를 선택해서 출력하시오.
dic1 = {'A':100,'B':80,'C':99,'D':70}
print(dic1)
# 반복문 이용
dic2 = {}
for kk, vv in dic1.items():
  if vv in (90, 80, 70): # 딕셔너리에서 in 연산자를 사용하는 경우 Key 값만 검사합니다.
    print(kk, vv)
    dic2[kk] = vv

print(dic2)

# DC를 이용
dic2 = { kk: vv for kk, vv in dic1.items() if vv in (90, 80, 70)}
print(dic2)

