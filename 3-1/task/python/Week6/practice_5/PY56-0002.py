# 성적을 리스트로 입력받고, 80점이 넘으면 합격(True), 그렇지 못하면 불합격(False) 결과를 담는 리스트를 만드는 프로그램을 작성하시오.
#
# 조건
# Trinket3.x
# LC 과 lambda 함수 사용하시오.
# 입력
# 공백 기준으로 성적 입력
# 출력
# 리스트 형태로 출력하시오.
# 입출력 예
# 입출력 결과와 똑같아야 합니다. (공백, 대소문자, 형식을 정확하게 맞춰주세요)
# 입력 안내 메시지는 생략해주세요
# 공백 기준 성적 입력받고, 정수 리스트 변환
scores = list(map(int, input().split()))

# lambda : 함수 이름 없이 짧게 정의하는 함수
# 80 초과면 True, 아니면 False
result = list(map(lambda x: x > 80, scores))

print(result)  # 결과 리스트 출력