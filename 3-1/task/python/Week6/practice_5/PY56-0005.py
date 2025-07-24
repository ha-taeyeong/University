# 복수개의 숫자를 입력받고, 입력받은 모든 수의 합을 출력하시오.
#
# 조건
# Trinket3.x
# reduce() 함수를사용하시오
# 입력
# 공백 기준으로 입력
# 출력
# 입출력 예 참고
# 입출력 예
# 입출력 결과와 똑같아야 합니다. (공백, 대소문자, 형식을 정확하게 맞춰주세요)
# 입력 안내 메시지는 생략해주세요
from functools import reduce # reduce 함수를 사용하기 위해 모듈 임포트

# 입력 받은 문자를 공백 기준으로 분리하고 정수로 변환
numbers = list(map(int, input().split()))

# reduce(누적함수, 리스트) 형식
# numbers 리스트의 모든 요소를 왼쪽부터 오른쪽으로 순차적으로 더해서 result에 저장
result = reduce(lambda x, y: x + y, numbers)
print(result) # 결과 출력