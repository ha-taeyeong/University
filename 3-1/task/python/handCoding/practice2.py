# 리스트 [1, 2, 3, 4, 5, 6] 중 짝수만 걸러서 새로운 리스트를 만들어라. (filter 사용)
def is_even(x):
    return x % 2 == 0

numbers = list(range(1, 7))
result = list(filter(is_even, numbers))
print(result)