# 문제
# 다음 프로그램중 오류가 나는 부분을 모두 찾고 원인을 작성하시오
# dic1 = dict('a'=3) # 오류 dict() 함수안은 2중 컨테이너를 사용한다.
dic1 = dict(a=3) # 정상, key(a)는 문자열 처리
dic1 = dict(a=3, b=4) # 정상, key(a,b)는 문자열 처리
# dic1 = dict([a, 3]) # 오류 dict() 함수안은 2중 컨테이너를 사용한다.
# dic1 = dict(['1', 3]) # 오류 dict() 함수안은 2중 컨테이너를 사용한다.
dic1 = dict([['1', 3]]) # 정상
dic1 = dict([[1,3]]) # 정상 key가 문자열->정수로 변경
print(dic1)

# 문제
# 다음 프로그램중 오류가 나는 부분을 모두 찾고 원인을 작성하시오
di = {1: 11, 2: 22} # int 사용
print(di)

sf = { 1.1 : 111, 2.2: 222 } # float 사용
print(sf)

ds = {'일':1, '이':2} # 문자열 사용
print(ds)

dt = {(1, 2): (11, 22), (11, 22): (111, 222)} # tuple 사용
print(dt)

# dl = {[1, 2]: [11, 22], [11, 22]: [111, 222]} # list 사용 에러
# dst = {{1,2}:3,{4,5}:6} # set 사용 에러
# dk = {{1: 11, 2: 22}:3, {1: 11, 2: 22}:6} # set 사용 에러

dv = {1:3, '4':{4:5}} # int, 문자열 사용
print(dv)

# 문제
# 다음 프로그램의 결과를 작성하시오.
dic1 = {1:'A', 2:'B', 3:'C'}
dic1[0] = 'D'
print(dic1)

# 문제
# 다음 프로그램의 결과를 작성하시오.
dic1 = {1: 11, 3: 33}

# dic1에 key가 1이 있으면 True 없으면 False
# dic1에 key가 11이 있으면 True 없으면 False
print(1 in dic1, 11 in dic1)

# 문제
# 성적이 90 점 이상인 학생정보를 선택해서 출력하시오
# dic1 = {'A':100, 'B':80, 'C':99, 'D':70}
# 조건
# 새로운 딕셔너리로 구성한다
# (방법1) 반복문을 이용하시오.
# (방법2) DC 를 이용하시오
# 입출력 예
# {'A': 100, 'C': 99}
# (방법1) 반복문을 이용하시오.
dic1 = {'A':100, 'B':80, 'C':99, 'D':70}
result = {}
for key, value in dic1.items():
  if value >= 90:
    result[key] = value
print(result)
# (방법2) DC 를 이용하시오
dic1 = {'A':100, 'B':80, 'C':99, 'D':70}
result = { key: value for key, value in dic1.items() if value >= 90}
print(result)

# 문제
# 성적이 70,80,90 점인 학생정보를 선택해서 출력하시오.
# dic1 = {'A':100,'B':80,'C':99,'D':70}
# 조건
# 새로운 딕셔너리로 구성한다
# (방법1) 반복문을 이용하시오.
# (방법2) DC 를 이용하시오
# 입출력 예
# {'B': 80, 'D': 70}
# (방법1) 반복문을 이용하시오.
dic1 = {'A':100,'B':80,'C':99,'D':70}
result = {}
for key, value in dic1.items():
  if value == 90 or value == 80 or value == 70:
    result[key] = value
print(result)
# (방법2) DC 를 이용하시오.
dic1 = {'A':100,'B':80,'C':99,'D':70}
result = {key: value for key, value in dic1.items() if value == 90 or value == 80 or value == 70}
print(result)

# 문제
# 학생점수에 추가점수를 적용하고자 한다.
# dic1 = {'A':100,'B':80,'C':99,'D':70}
# 조건
# 새로운 딕셔너리를 구성하시오.
# 90 점 이상인 학생은 +5점 가산점
# 90점 미만인 학생은 -5점 감점
# DC 를 이용하시오
# 입출력 예
# {'A': 105, 'B': 75, 'C': 104, 'D': 65}
dic1 = {'A':100,'B':80,'C':99,'D':70}
result = {key: (value + 5 if value >= 90 else value - 5) for key, value in dic1.items()}
print(result)

# 문제
# 두개의 딕셔너리를 결합해서 새로운 딕셔너리를 구성해보자.
# 조건
# 방법2가지 이상 작성해보자.
# da = {'1': 11, '3': 33}
# db = {2: 22, 4: 44}
# 입출력 예
#   {'1': 11, '3': 33, 2: 22, 4: 44}
# 방법1
da = {'1': 11, '3': 33}
db = {2: 22, 4: 44}
da.update(db)
print(da)
# 방법2
da = {'1': 11, '3': 33}
db = {2: 22, 4: 44}
merged = {**da, **db} # ** : dictionary unpacking
print(merged)


# 문제
# 다음과 같은 2차원 리스트를 결합하고자 한다.
# lt1 = [[1, 10], [2, 22], [3, 19]]
# lt2 = [[4, 2], [5, 9], [6, 3]]
# 결과에 맞는 코드를 각각 작성해보자.
# 출력 예
#   [[1, 10], [2, 22], [3, 19], [4, 2], [5, 9], [6, 3]]  #결과1
#   [[1, 10, 4, 2], [2, 22, 5, 9], [3, 19, 6, 3]]  #결과2
#   [([1, 10], [4, 2]), ([2, 22], [5, 9]), ([3, 19], [6, 3])] #결과3

lt1 = [[1, 10], [2, 22], [3, 19]]
lt2 = [[4, 2], [5, 9], [6, 3]]
# result1: lt1과 lt2를 단순히 이어붙인 결과 (2차원 리스트)
result1 = lt1 + lt2
print(result1)
# result2: lt1과 lt2의 같은 인덱스의 리스트를 합쳐서 새로운 리스트 생성
result2 = [a + b for a, b in zip(lt1, lt2)]
print(result2)
# result3: lt1과 lt2의 같은 인덱스의 리스트를 튜플로 묶어서 리스트로 반환
result3 = list(zip(lt1, lt2))
print(result3)


# 문제 (Reivew)
# 다음과 같이 구구단 2,4,7단을 출력하도록 하시오
# 조건
# 구구단 연산을 key 로 하고, 값을 value 로 하는 딕셔너리를 만들어서 작업하시오.
# key : "2 x 1" , "2 x 2" …
# value : 2 , 4 …
# 방법1) 2중 for 문을 사용하시오.
# 방법2) zip() 함수를 사용하시오.
# 출력 예
# 2 x 1 =  2     4 x 1 =  4     7 x 1 =  7
# 2 x 2 =  4     4 x 2 =  8     7 x 2 = 14
# 2 x 3 =  6     4 x 3 = 12     7 x 3 = 21
# 2 x 4 =  8     4 x 4 = 16     7 x 4 = 28
# 2 x 5 = 10     4 x 5 = 20     7 x 5 = 35
# 2 x 6 = 12     4 x 6 = 24     7 x 6 = 42
# 2 x 7 = 14     4 x 7 = 28     7 x 7 = 49
# 2 x 8 = 16     4 x 8 = 32     7 x 8 = 56
# 2 x 9 = 18     4 x 9 = 36     7 x 9 = 63

# 구구단에서 출력할 단(2, 4, 7단) 리스트
multiples = [2, 4, 7]
# 곱셈 결과를 저장할 딕셔너리
result = {}
# 각 단과 곱하는 수(1~9)에 대해 딕셔너리에 저장
for dan in multiples:                 # 2, 4, 7단 반복
    for i in range(1, 10):            # 1~9까지 반복
        key = f"{dan} X {i}"          # key: "2 X 1", "2 X 2", ...
        value = dan * i               # value: 실제 곱셈 결과
        result[key] = value           # 딕셔너리에 저장
# 구구단을 예시처럼 한 줄에 2, 4, 7단을 나란히 출력
for i in range(1, 10):                # 1~9까지 반복 (곱하는 수)
    line = ""                         # 한 줄에 출력할 문자열 초기화
    for dan in multiples:             # 2, 4, 7단 반복
        key = f"{dan} X {i}"          # 해당 단과 곱하는 수로 key 생성
        # 각 연산과 결과를 포맷팅하여 line에 추가
        line += f"{key} = {result[key]:2d}          "
    print(line)                       # 한 줄 출력
