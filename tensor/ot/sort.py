import random

def selection_sort(arr): # 선택 정렬
    n = len(arr) # n = 배열 길이
    for i in range(n): # 0부터 n-1만큼 반복
        min_idx = i  # 현재 위치를 최소값으로 가정
        for j in range(i + 1, n): # i 이후의 요소들과 비교
            if arr[j] < arr[min_idx]:  # 더 작은 값 찾기
                min_idx = j # 최소값 갱신
        # 튜플로 한덩어리로 판단하기 때문에, 다중 할당이 가능함
        arr[i], arr[min_idx] = arr[min_idx], arr[i] # 최소값과 현재 위치 값을 교환
    return arr

array = [random.randint(1, 10) for _ in range(10)] # 1~10까지 랜덤 숫자 배열크기 10
print(array)
print(selection_sort(array))
