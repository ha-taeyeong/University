# 리스트 [2, 7, 8, 11, 14, 17] 중 10 이상인 값만 골라서 출력하라. (filter 사용, lambda 사용)
numbers = [2, 7, 8, 11, 14, 17]
result = list(filter(lambda x: x>=10, numbers))
print(result)