# dict() 함수 이용
# key-value 쌍 리스트
lt1 = [[1,"a"], [2,"b"]] # 리스트
dic1 = dict(lt1) # dict() 함수를 이용 dic1 = dict([['1',3],['2',4]])
print(dic1)

# key-value 쌍 컨테이너 종류
name_and_ages = [['kevin', 21], ['Tom', 13]] # 리스트-리스트
print(dict(name_and_ages))

name_and_ages = [('kevin', 21), ('Tom', 13)] # 리스트-튜플
print(dict(name_and_ages))

name_and_ages = (('kevin', 21), ('Tom', 13)) # 튜플-튜플
print(dict(name_and_ages))

name_and_ages = (['kevin', 21], ['Tom', 13]) # 튜플-리스트
print(dict(name_and_ages))

# 대입연산자 a=3 이용
dic1 = dict(a=3) # 변수는 문자열 처리됨
print(dic1) # {'a': 3}

# dic1 = dict(1='a') # 숫자변수 성립x

# zip() 함수 이용
lt1 = [1,2,3]
lt2 = ['a','b','c']

dic1 = dict(zip(lt1,lt2)) #zip() 함수이용
print(dic1)