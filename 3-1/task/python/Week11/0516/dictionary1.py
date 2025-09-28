# 딕셔너리 생성
dic1 = {1:'A',2:'B',3:'C'}
print(dic1)

keys = [1,2,3]
values = list("ABC")
print(keys,values)
print(dict(zip(keys,values))) # zip으로 key value 쌍(튜플) 만들기

dic1[4] = 'D' # 추가
print(dic1)

dic1['4'] = 'E'
print(dic1)

# dic1[[1,2]] = 'E' # 오류
# dic1[[5,6,7]] = list("EFG") # 복수개 추가 x

# dic1 = dict(['1',3]) # 오류 dict() 함수안은 2중 컨테이너를 사용한다.
dic1 = dict([['1',3]]) # dic1 = dict([['1',3],['2',4]]) -> key-value 쌍 컨테이너 종류
print(dic1)
print(dic1.items())
print(dic1.keys())
print(dic1.values())