# 0부터 9까지의 자연수 10개를 원소로 가지는 리스트를 만들어보자
import random

# 0~9까지 랜덤정수를 lt1 리스트 1~10까지 반복하여 저장
lt1 = [random.randint(0, 9) for kk in range(1, 10)]
print(lt1)