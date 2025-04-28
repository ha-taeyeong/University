# 0을 제외한 20까지의 짝수 값이 아래와 같이 순서대로 두 번 반복되는 리스트를 만들어보자.
result = [] # result 리스트 선언

for kk in range(2, 21, 2): # 2부터 20까지 2씩 증가
  result.append(kk) # result 리스트에 추가

temp = result[:-1] # result 리스트 마지막 요소(20) 제외한 복사본 만들기
temp.reverse()  # temp를 뒤집기

result.extend(temp) # result에 뒤집어진 temp를 이어붙이기

print(result) # 최종 result 리스트 출력