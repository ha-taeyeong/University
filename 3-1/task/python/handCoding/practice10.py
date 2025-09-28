# 리스트 [1,2,3,4,5] 중 짝수만 뽑아서 새로운 리스트를 만들어라.
# List Comprehension 사용
numbers = list(range(1,6))
result = [kk for kk in numbers if kk % 2 == 0]
print(result)
