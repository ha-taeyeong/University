# 다음과 같이 리스트, 행, 열을 정보를 입력받고, 리스트의 모양을 바꿀수 있는 함수를 만드시오.
# lt_reshape 사용자 정의 함수 선언(리스트, 행 수, 열 수, 펼침 여부)
def lt_reshape(lst, row=None, col=None, flatten=False):
  if flatten: # flatten이 True라면 (리스트를 펼친다)
    result = [] # result 리스트 선언
    # lst 안의 각 서브리스트를 sublist로 가져와서
    for sublist in lst:
      # sublist 안의 요소들을 result 리스트에 이어붙인다
      result.extend(sublist)
    return result # 1차원으로 펼친 result를 반환

  else: # flatten이 False라면 (리스트 모양을 (row, col)로 바꾼다)
    # 만약 lst[0]이 리스트라면 (2차원 리스트라면)
    if isinstance(lst[0], list):
      flattened = []  # flattened 리스트 선언
      # lst 안의 각 서브리스트를 sublist로 가져와서
      for sublist in lst:
        # sublist 안의 요소들을 flattened에 이어붙인다
        flattened.extend(sublist)
      # lst를 펼친 리스트로 교체
      lst = flattened

    result = [] # result 리스트 선언
    for r in range(row):  # 행(row) 수만큼 반복
      # r번째 행에 해당하는 열(col)만큼 슬라이싱하여 추가
      result.append(lst[r*col:(r+1)*col])
    return result # 2차원으로 재구성한 result 반환

rows, cols = 3,4
lt1 = list(range(rows*cols)) # 0부터 11까지 숫자를 담은 리스트 생성

print(lt1)    # [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
# 3행 4열로 변환
lt2 = lt_reshape(lt1,3,4) # [[0, 1, 2, 3], [4, 5, 6, 7], [8, 9, 10, 11]]
print(lt2)
print()

# 2행 6열로 변환
lt2 = lt_reshape(lt1,2,6) # [[0, 1, 2, 3, 4, 5], [6, 7, 8, 9, 10, 11]]
print(lt2)
print()

# 4행 3열로 다시 변환
lt3 = lt_reshape(lt2,4,3)
print(lt3) #[[0, 1, 2], [3, 4, 5], [6, 7, 8], [9, 10, 11]]

# 다시 1차원 리스트로 펼침
lt4 = lt_reshape(lt3,flatten=True)
print(lt4) # [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]