# 리스트 [-5, -3, 0, 2, 4, 6] 중 양수만 남기는 리스트를 만들어라. (filter + lambda 사용)
numbers = [-5, -3, 0, 2, 4, 6]
result = list(filter(lambda x: x>0, numbers))
print(result)