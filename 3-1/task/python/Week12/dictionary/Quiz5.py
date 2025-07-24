# 문제
# 다음과 같은 2차원 리스트를 결합하고자 한다.
lt1 = [[1, 10], [2, 22], [3, 19]]
lt2 = [[4, 2], [5, 9], [6, 3]]

# 결과1
print("결과1")
print("방법1 ", lt1 + lt2) # 방법1
print("방법2 ",[*lt1, *lt2]) #방법2
# lt1.extend(lt2) #이건 리스트가 내용이 바뀜
print("방법3 ", list.__add__(lt1,lt2)) # 리스트 결합 <- 매직메서드 # 방법3 딕셔너리는 안됨

# 결과2
print("\n결과2")
print(list(map(list.__add__,lt1,lt2))) #연산자오버로딩, map 함수에 두개의 목록전달

# 결과3
print("\n결과3")
print(list(zip(lt1,lt2)))