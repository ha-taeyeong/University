# 3x4 2차원 리스트를 랜덤값으로 채우고, 다시 1차원 리스트로 변환하는 프로그램을 작성하시오
#2차원 -> 1차원 리스트변환
import random

rows,cols = 3,4 # 행(rows) 3개, 열(cols) 4개로 설정

# 0~9까지 랜덤 정수를 열(cols) 개수만큼 생성한 리스트를 행(rows) 개수만큼 생성
lt2 = [[random.randint(0, 9) for _ in range(cols)] for _ in range(rows)]
print(lt2)#2차원

# lt2의 각 행(row)을 돌면서, 각 행 안의 num(원소)을 꺼내 1차원 리스트로 변환
lt1 = [num for row in lt2 for num in row]
print(lt1)  #1차원