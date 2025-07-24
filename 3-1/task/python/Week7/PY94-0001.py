# 다음과 같이 행과 열을 입력받고, 2차원 리스트를 만드는 함수 mk_lt() 를 만드시오.
# mk_lt 사용자 정의 함수(행, 열, 초기값)
def mk_lt(row, col, init_val=0):
    # 열 개수만큼 반복하고, 행 개수만큼 반복
    # 행(row) 수만큼 반복하면서, 각 행에 대해 열(col) 수만큼 초기값(init_val)을 채운 리스트를 생성
    return [[init_val for _ in range(col)] for _ in range(row)]

user_input = input()  # 사용자로부터 입력값을 문자열로 받음

print(eval(user_input)) # 입력받은 문자열을 실제 코드처럼 실행해서 결과 출력