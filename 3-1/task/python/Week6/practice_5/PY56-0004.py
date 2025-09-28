# 복수개의 숫자를 입력받고, 입력받은 모든 수의 부호를 거꾸로 하시오.
#
# 조건
# Trinket3.x
# lambda 함수 사용
# 입력
# input() 함수를 이용해서 복수개의 숫자를 입력받는다. (숫자사이에 , 입력)
# 출력
# 입출력 예 (쉼표 구분)
# 입출력 예
# 입출력 결과와 똑같아야 합니다. (공백, 대소문자, 형식을 정확하게 맞춰주세요)
# 입력 안내 메시지는 생략해주세요
# 입력 받은 문자를 ,로 분리하여 정수로 변환
numbers = list(map(int, input().split(',')))

# numbers 요소에 전부 -를 적용하여 리스트를 만든다.
results = list(map(lambda x: -x, numbers))

# results 리스트를 문자열로 변경하여 한 줄에 ,로 구분해 출력
print(", ".join(map(str, results)))