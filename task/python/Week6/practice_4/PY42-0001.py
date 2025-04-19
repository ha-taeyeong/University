# 아래 코드는 데이터열 조작 CRUD 예제 중 일부이다.
# 삭제할 문자열을 검색하고, 문자열을 삭제하는 delete_List() 함수를 완성하시오.
# 조건
# 검색하고자 하는 데이터열을 집합으로 바꾸고 delete_List() 함수를 완성하시오.
# 지우려고 할 때 데이터가 없는 경우 에러 발생→ 데이터가 없다는 메시지 출력
# 복수개의 데이터 삭제 불가 → 중복된 데이터가 있다면 함께 삭제 되어야 함
# 방법 택1
# 방법1 : 데이터가 없는 조건식을 교집합으로 판단
lt1 = []  # 데이터열 생성 Create


def append_List():
    key = input('Append Data :')
    lt1.append(key)
    print(lt1)


def print_List():
    print(lt1)
    pass


def delete_List():
    print(lt1)
    key = input('Delete Data :')  # 삭제할 문자열 입력
    if set([key]) & set(lt1):  # 검색하고자 하는 데이터열을 집합으로 바꾸고 교집합인 경우
        while key in lt1:  # lt1리스트 요소 동안 반복
            lt1.remove(key)  # lt1리스트 요소 삭제
    else:  # 삭제하고자 하는 데이터가 없다면
        print("데이터가 없습니다.")  # 데이터가 없습니다. 출력

    print(lt1)


while True:
    print('1. Append List')  # 데이터열 조작(추가) Update
    print('2. Print List')  # 데이터열 읽기 Read
    print('3. Delete List')  # 데이터열 조작(검색+추가) Update
    print('4. Exit')  # 데이터열 삭제 Delete

    key = input('Select Number [1~4] :')  # IO 처리 (1)
    if key == '1':
        append_List()
    elif key == '2':
        print_List()
    elif key == '3':
        delete_List()
    else:
        break

print('\nThanks.')