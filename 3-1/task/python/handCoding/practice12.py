# 리스트 [2,3,3,5,5,5,7]에서 각 원소의 등장 횟수를 딕셔너리 형태로 세어라.
# "Counter 없이 for문으로 직접 세기"
numbers = [2,3,3,5,5,5,7]
counter = {}
for kk in numbers:
    if kk not in counter:
        counter[kk] = 1
    else:
        counter[kk] += 1
print(counter)