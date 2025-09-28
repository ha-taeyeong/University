# Dictionary
# {Key1:Value1, Key2:Value2, Key3:Value3, ...}

# Key, Value
dic = {'name': 'pey', 'phone':'0119993323', 'birth':'1118'}
a = {1: 'hi'}

# Value = List 가능
a = {'a': [1,2,3]}
a


# 딕셔너리 쌍 추가하기
a = {1: 'a'}
a[2] = 'b'
a['name'] = 'pey'
a[3] = [1,2,3]
a # {1: 'a', 2: 'b', 'name': 'pey', 3: [1, 2, 3]}


# 딕셔너리 쌍 삭제하기
del a[1]
a # {2: 'b', 'name': 'pey', 3: [1, 2, 3]}


# 딕셔너리에서 Key 사용해 Value 얻기
grade = {'pey': 10, 'julliet': 99}
grade['pey'] # 10
grade['julliet'] # 99

a = {1: 'a', 2:'b'}
a[1] # a
a[2] # b

a = {'a':1, 'b':2}
a['a'] # 1
a['b'] # 2

dic = {'name': 'pey', 'phone':'0119993323', 'birth':'1118'}
dic['name']  # pey
dic['phone'] # 0119993323
dic['birth'] # 1118


# 딕셔너리 주의사항
a = {1:'a', 1:'b'}
a # 1:'a' 쌍이 무시됨

a = {[1,2] : 'hi'}
a # List를 키로 사용할 수 없다.

# 딕셔너리 관련 함수
# Key 리스트 만들기 (keys)
a = {'name': 'pey', 'phone':'0119993323', 'birth':'1118'}
a.keys() # dict_keys(['name', 'phone', 'birth'])
# 파이썬 2.7버전까지는 a.keys() 함수를 호출할 때 반환 값으로 dict_keys가 아닌 리스트를 돌려준다.
# 리스트를 돌려주기 위해서는 메모리 낭비가 밣생하는데 파이썬 3.0 이후 버전에서는 이러한 메모리 낭비를 줄이기 위해 dict_keys 객체를 돌려준다.
for k in a.keys():
    print(k)
# name
# phone
# birth
list(a.keys()) # ['name', 'phone', 'birth']

# Value 리스트 만들기 (values)
a.values() # dict_values(['pey', '0119993323', '1118'])

# Key, Value 쌍 얻기(items)
a.items() # dict_items([('name', 'pey'), ('phone', '0119993323'), ('birth', '1118')])

# Key로 Value 얻기(get)
a = {'name': 'pey', 'phone':'0119993323', 'birth':'1118'}
a.get('name') # 'pey'
a.get('phone') # '0119993323'
print(a.get('nokey')) # None
print(a['nokey']) # Key 오류 발생
a.get('foo', 'bar') # bar

# 해당 Key가 딕셔너리 안에 있는지 조사하기 (in)
a = {'name': 'pey', 'phone':'0119993323', 'birth':'1118'}
'name' in a  # True
'email' in a # False

# 딕셔너리 만들어보기
dict = {'name': '홍길동', 'birth': 1128, 'age': 30}
dict #{'name': '홍길동', 'birth': 1128, 'age': 30}