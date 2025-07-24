# 도시별 온도가 2차원 리스트로 주어집니다.
#
# 각 행은 한 도시의 일주일간 기온을 나타냅니다.
#
# 평균 기온이 t도 이상인 도시의 인덱스를 모두 출력하세요.
#
# 조건
# temperatures는 도시 수 × 7 크기의 2차원 리스트입니다.
# 정수 t가 주어집니다.
# 평균이 t 이상인 도시의 인덱스를 리스트로 출력하세요.
# 도시 인덱스는 오름차순으로 정렬되어야 합니다.
# 풀이1) 리스트이용
# 풀이2) numpy 이용
# 풀이3) pandas 이용
import numpy as np
import pandas as pd

# 문제에서 고정된 기준 온도 t
t = 23

# 1. List 방식
def hot_cities_list(temperatures): # 사용자 정의 함수(입력 : 2차원 리스트)
    result = [] # 결과 리스트 초기화
    for i, city in enumerate(temperatures): # temperatures 리스트를 인덱스와 함께 반복
        avg = sum(city) / len(city) # 도시별 평균 기온 계산 (총합 / 일수)
        if avg >= t:  # 평균이 기준 온도 이상이면
            result.append(i)  # 결과 리스트에 해당 도시 인덱스를 추가
    return result # 평균이 기준 이상인 도시들의 인덱스 리스트 반환

# 2. NumPy 방식
def hot_cities_numpy(temperatures): # 사용자 정의 함수(입력 : 2차원 리스트)
    arr = np.array(temperatures)  # 2차원 리스트를 NumPy 배열로 변환
    avg = arr.mean(axis=1)  # 각 도시(행 기준)의 평균 기온 계산
    # np.where(조건) : 조건에 만족하는 인덱스들을 튜플로 반환
    return list(map(int, np.where(avg >= t)[0])) # 조건을 만족하는 인덱스 배열의 첫 번째 요소를 리스트로 변환하여 반환

# 3. Pandas 방식
def hot_cities_pandas(temperatures): # 사용자 정의 함수(입력 : 2차원 리스트)
    df = pd.DataFrame(temperatures) # 2차원 리스트를 표 형태 DataFrame으로 변환
    avg = df.mean(axis=1) # 각 행(도시별)의 평균 기온 계산
    return avg[avg >= t].index.tolist() # 평균이 기준 이상인 도시의 인덱스를 리스트로 반환

temperatures = eval(input()) # 입력 받은 문자열을 리스트로 반환

print(hot_cities_list(temperatures)) # List 방식 결과 출력
print(hot_cities_numpy(temperatures)) # NumPy 방식 결과 출력
print(hot_cities_pandas(temperatures)) # Pandas 방식 결과 출력
