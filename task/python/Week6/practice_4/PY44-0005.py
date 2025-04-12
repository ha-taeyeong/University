# 학생들의 시험 점수가 2차원 리스트로 주어집니다.
#
# 각 학생마다 과목 점수가 하나의 리스트에 저장되어 있습니다.
#
# 가장 높은 평균 점수를 받은 학생의 인덱스를 구하세요.
#
# 조건
# scores는 학생 수 × 과목 수 크기의 2차원 리스트입니다.
# 각 내부 리스트는 한 학생의 점수 리스트입니다.
# 평균이 가장 높은 학생의 인덱스를 출력하세요.
# 평균이 같은 경우 먼저 나온 학생을 선택합니다.
# 풀이1) 리스트이용
# 풀이2) numpy 이용
# 풀이3) pandas 이용
import numpy as np # numpy 라이브러리 불러와서 이름을 np로 수정
import pandas as pd # pandas 라이브러리 불러와서 이름을 pd로 수정

# 1. List 이용
def best_student_index(scores): # 사용자 정의 함수 (입력: 학생 점수 2차원 리스트)
  max_avg = -1 # 최대 평균 초기화 (평균이 0점일수 도 있으므로 -1로 시작)
  max_index = -1 # 최대 평균을 가진 학생의 인덱스 초기화
  for i, student in enumerate(scores): # scores 리스트를 인덱스와 함께 반복
    avg = sum(student) / len(student) # 평균 = 총합 / 과목수
    if avg > max_avg: # 현재 평균이 최대 평균 보다 크면
      max_avg = avg # 최대 평균 갱신
      max_index = i # 해당 학생의 인덱스 저장
  return max_index # 평균이 가장 높은 학생의 인덱스 반환

# 2. NumPy 이용
def best_student_index_np(scores):  # 사용자 정의 함수 (입력: 학생 점수 2차원 리스트)
    arr = np.array(scores)  # 2차원 리스트를 NumPy 배열로 변환
    # axis=0 : 열(세로) 단위 연산, axis=1 : 열(가로) 단위 연산
    avg_scores = arr.mean(axis=1)  # 각 학생(행 기준) 평균
    # np.argmax : 가장 큰 값이 있는 위치를 찾아주는 함수
    return int(np.argmax(avg_scores))  # 평균이 가장 높은 학생의 인덱스 반환

# 3. Pandas 이용
def best_student_index_pd(scores):  # 사용자 정의 함수 (입력: 학생 점수 2차원 리스트)
    # DataFrame() : 엑셀 스프레드시트와 비슷한 형태의 2차원 데이터 구조
    df = pd.DataFrame(scores) # 2차원 리스트를 표 형태 DataFrame으로 변환
    avg_scores = df.mean(axis=1)  # 각 행(학생) 평균
    # idxmax() : 가장 큰 값을 가진 인덱스를 반환하는 함수
    return int(avg_scores.idxmax())  # 평균이 가장 높은 학생의 인덱스 반환

scores = eval(input()) # 문자열 형태로 입력된 리스트를 실제 리스트로 변환
print(best_student_index(scores))       # List 방식 결과 출력
print(best_student_index_np(scores))    # NumPy 방식 결과 출력
print(best_student_index_pd(scores))    # Pandas 방식 결과 출력