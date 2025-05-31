# 2차원 리스트
lt1 = [[1,2,3,1],
       [4,5,6,4],
       [7,8,9,7]]

lt2 = []
for row in lt1:
  lt2.append([row[1], row[3]]) # 반복문
print("lt2", lt2)

lt3 = [ [row[1], row[3]] for row in lt1 ] # LC
print("lt3", lt3)

lt4 = [ row[1::2] for row in lt1 ] # 슬라이스연산자
print("lt4", lt4)

# 복수개의 데이터를 처리하기 위한 방법
# list => 문자열, 튜플, 리스트, 셋, 딕션너리
# numpy => array
# pandas => 데이터프레임, 시리즈

import numpy as np
np1 = np.array(lt1)
print(lt1)
print(np1)

print("2차원 리스트 원소접근방법")
print(lt1[0][3]) # 2차원 리스트 원소접근방법(슬라이스 연산자 사용 X)
print("슬라이스연산자")
print(np1[ : , 1::2 ]) # 슬라이스연산자
print("인덱스(위치)정보")
print(np1[ : , [1,3]]) # 인덱스(위치)정보
print("마스크정보")
print(np1[ : , [False,True,False,True]]) # 마스크정보
# np1[ ,1:2 ] #행과 열의 정보를 비워두면 안됩니다. (cf R언어)

import pandas as pd
# 데이터프레임 = value(값) + columns(열이름) + index(행이름)
# 시리즈 = value(값) + index(이름)

df1 = pd.DataFrame(lt1)
print("df1")
print(df1)
print("df1.columns")
print(list(df1.columns))
print("df1.index")
print(list(df1.index))
print("df1.values")
print(list(df1.values))