# 리스트 [3, 6, 9, 12]의 모든 원소를 3배 해서 새로운 리스트를 만들어라. (map 사용)
def triple(x):
    return x*3

numbers = [3, 6, 9, 12]
result = list(map(triple, numbers))
print(result)