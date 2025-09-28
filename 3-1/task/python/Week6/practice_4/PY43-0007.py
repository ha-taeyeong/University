# 문자열의 일부를 수정할 수 있는 str.replace() 와 같은 기능을 하는 myReplace 함수를 만들어 보자.
#
# 조건
# Trinket3.x
# str.replace() 함수를 사용하지 마시오
# myReplace 사용자 정의 함수
def myReplace(text, x, y):  # 입력파라미터 3개를 받는다 (원본 문자열, 바꿀 문자열, 새 문자열)
    result = ""  # 결과 문자열 변수 초기화
    i = 0  # 시작 인덱스를 0으로 초기화

    while i < len(text):  # i가 text 문자열 길이보다 작을 경우 반복한다

        if text[i:i + len(x)] == x:  # 현재 인덱스부터 x의 길이만큼 자른 부분이 x와 같다면
            result += y  # 결과 문자열에 y를 추가한다
            i += len(x)  # x의 길이만큼 인덱스를 건너뛴다
        else:  # 그렇지 않다면
            result += text[i]  # 현재 문자 그대로 결과에 추가
            i += 1  # 인덱스를 1 증가

    return result  # 결과 문자열 반환


str1 = "Hello Python World Hello Python World"
str2 = myReplace(str1, "llo", "xx")
print(str2)
# Hexx Python World Hexx Python World

str1 = "Hello Python World Hello Python World"
str2 = myReplace(str1, "Py", "1234")
print(str2)
# Hello 1234thon World Hello 1234thon World