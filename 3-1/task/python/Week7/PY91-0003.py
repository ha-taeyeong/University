# 다음 코드는 리스트 원소의 swap 기능 코드 일부이다. 사용자정의함수를 모두 구현하시오.
def myswap4():  # myswap3 사용자 정의 함수
  # lt 0번째를 lt 1번째에 저장, lt 1번째를 lt 0번째를 저장
  lt[0], lt[1] = lt[1], lt[0]

lt= [3,4] # lt 리스트 선언

print(lt) # lt 리스트 출력
myswap4() # myswap4 함수를 호출
print(lt) # 바꾼 후의 lt 리스트 출력