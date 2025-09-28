# 2개의 문자열을 입력받고, 두 문자의 값을 바꾸는 코드를 완성하시오.
aa,bb = input().split() # aa, bb를 입력값 공백 기준으로 나누어 저장

print(aa,bb) # aa, bb를 출력

### 코드 추가 ######
aa, bb = bb, aa # aa를 bb에 저장, bb를 aa에 저장
####################
print(aa,bb) # aa, bb를 출력