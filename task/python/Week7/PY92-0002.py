# nxm 1차원 리스트를 랜덤값으로 채우고, n*m 2차원 리스트로 변환하는 프로그램을 작성하시오
import random
rows,cols = 3,4 # 행(rows) 3개, 열(cols) 4개로 설정

# 0~9까지 랜덤 정수를 rows*cols(12개)만큼 생성하여 lt1 리스트에 저장
lt1 = [random.randint(0, 9) for kk in range(rows * cols)] #1차원 랜덤값 생성
print(lt1) # lt1 출력

# lt1을 4개씩 끊어서 3행(row)짜리 2차원 리스트 lt2로 변환
lt2 = [lt1[kk*cols:(kk+1)*cols] for kk in range(rows)] # 2차원생성
print(lt2) # lt2 출력