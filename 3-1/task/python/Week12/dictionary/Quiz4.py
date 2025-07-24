# 두개의 딕셔너리를 결합해서 새로운 딕셔너리를 구성해보자.
# 조건
# 방법2가지 이상 작성해보자.
da = {'1': 11, '3': 33}
db = {'2': 22, '4': 44}

# print({**da, **db}) # unpacking은 가능하나 raw 데이터를 바로 출력은 불가하고 {}에 담아서 처리해야한다
# print({**da}) # {}에 담아서 출력가능
# print(*da) # key 값만 unpacking
# lt1 = [1,2,3]
# print(*lt1)

# {da, db} #key 값으로 딕셔너리 설정 불가
# {*da, *db} #key 값만 분해해서 set rntjdehla
print({**da, **db}) # concatennate 방법1
# {**da, 'dc':db} #2차원 딕셔너리구성

# da+db #연산자 오버로딩x 불가
print(dict(da, **db)) # key값이 숫자인경우는 불가 방법2 #list(lt1,*lt2)
# da.update(db) # 방법3 da값이 업데이트됨 (대용량 변경 처리에 대응)

