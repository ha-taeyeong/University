# 주의사항
# key 값은 immutable한 값은 사용할 수 있지만, mutable한 객체는 사용할 수 없다.
# immutable 예
dic1 = {1: 5, 2: 3} # int 사용
print('int 사용', dic1)

dic1 = {(1,5): 5, (3,3): 3} # tuple 사용
print('tuple 사용', dic1)

dic1 = { 3.6: 5, "abc": 3} # float 사용
print('float 사용', dic1)

dic1 = { True: 5, "abc": 3} # bool 사용
print('bool 사용', dic1)

# mutable 예
# dic1 = { {1, 3}: 5, {3, 5}: 3} # set 사용 에러
# dic1 = {[1,3]: 5, [3, 5]: 3} # list 사용 에러
# dic1 = { {"a":1}: 5, "abc": 3} # dict 사용 에러

# 값은 중복될 수 있지만, 키가 중복되면 마지막 값으로 덮어씌워짐.
dic1 = {"a" : 1, "a" : 2}
print(dic1)

# 순서가 없기 때문에 인덱스로는 접근할 수 없고, 키로 접근 할 수 있음
dic1 = {'abc' : 1, 'def' : 2}
# print(dic1[0]) # 오류
print(dic1['abc']) # 1

# dict() 함수안은 2중 컨테이너를 사용한다.
# dic1 = dict(['1',3]) # 오류 dict() 함수안은 2중 컨테이너를 사용한다.
dic1 = dict([['1', 3]])
print(dic1)

dic1[(1,3)] = 7
# dic1[[1,3]] = 7 # 오류 imutable key값 사용
print(dic1)

# 참고
# dict(zip(keys,values)) # zip으로 key value 쌍(튜플) 만들기

# 단일 수정은 키로 접근하여 값을 할당 (대용량 변경 처리에 대응)
dic1 = {'kevin': [1, 2, 3], 'tom': 20, 'reachal': 15}
print(dic1)

dic1['kevin'] = 21 # 단일 수정
print(dic1)

dic1.update({'red' : 5, 'green': 6, 'kevin': 7}) # 수정 및 추가
print(dic1)
