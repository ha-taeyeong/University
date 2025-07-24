# 실수 2개를 입력받고, 소수점 자리와 정수 자리를 구분하시오
#
# 조건
# Trinket3.x
# 정수부 실수부 분리 (LC 사용하시오)
# 입력
# 입력값은 공백으로 구분한다.
# 출력
# 입출력 예 참고
# 입출력 예
# 입출력 결과와 똑같아야 합니다. (공백, 대소문자, 형식을 정확하게 맞춰주세요)
# 입력 안내 메시지는 생략해주세요
text = input().split() # 입력받은 문자열을 공백 기준 분리
floats = list(map(float, text)) # 문자열을 실수로 변환

# # 각 실수를 문자열로 변환 → '.' 기준 분리 → 정수로 변환 → 튜플로 묶어 리스트 생성
split_numbers = [tuple(str(kk).split(".")) for kk in floats]

print(split_numbers)  # 최종 결과 출력