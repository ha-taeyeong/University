# np1 배열과 같이 체스보드 판을 그리는 프로그램을 작성하시오.
# 방법2 : 리스트를 이용 (LC 2차원 행렬을 만드는 방법)
rows, cols = 3, 8 # 행은 3, 열은 8
np1 = [
    # 한 행(row)을 만듭니다. 각 열(column)마다
    # 행 인덱스가 0이거나 마지막이거나 열 인덱스가 0 이거나 마지막이면 1, 그렇지 않으면 0 값을 결정한다.
    [1 if r== 0 or r == rows-1 or c == 0 or c == cols-1 else 0 for c in range(cols)]
    # 위 행을 전체 행(rows)만큼 반복해서 2차원 리스트를 만듭니다.
    for r in range(rows)
]

# np1 리스트의 각 행(row)을 출력합니다.
for row in np1:
  print(row) # 한 행씩 출력