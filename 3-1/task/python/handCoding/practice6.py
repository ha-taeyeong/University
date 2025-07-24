# 리스트 [5, 10, 15]의 모든 원소를 5배 해서 출력하라. (map 사용, lambda 사용)
numbers = [5, 10, 15]
result = list(map(lambda x: x*5, numbers))
print(result)