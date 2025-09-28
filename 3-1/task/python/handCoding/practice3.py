# 리스트 [2, 4, 6, 8, 10]의 원소를 각각 제곱한 값을 구하라. (map + lambda 사용)
numbers = [2, 4, 6, 8, 10]
result = list(map(lambda x: x**2, numbers))
print(result)