# 다음 프로그램은 lt1 의 원소를 삭제하는 프로그램의 일부이다.
#
# 아래 코드는 ‘AAA’ 원소를 삭제하는 경우 ‘AAA’ 모든 원소가 삭제되지 않는 오류가 있다.
#
# 코드 내용을 수정해서 올바른 입출력을 갖는 프로그램을 작성하시오.
#
# 조건
# Jupyterlab 을 이용하시오.
# 두가지 방법 모두 작성하시오
# (방법1) for 문을 사용하지 말것
# (방법2) for 문을 사용할것
# (방법1) for 문을 사용하지 말것
lt1 = ['BBB', 'AAA', 'AAA']  # 데이터열 생성 Create


def delete_List():
    print(lt1)
    key = input('Delete Data :')  # IO 처리 (2)

    # 데이터열내에서 데이터 유무 검사
    if set(lt1) & {key} == set():  # 공집합
        print(f'[{key}] No data in list')
        return

        # 데이터열 검색 + 삭제
    # (앞에서 삭제하면 인덱스 밀림 오류가 발생할 수 있으므로 역순 사용)
    for i in range(len(lt1) - 1, -1, -1):  # len-1부터 0까지 역순 반복
        if lt1[i] == key:  # 현재 요소가 삭제 대상인 경우
            del lt1[i]  # 해당 요소 삭제

    print(lt1)


delete_List()