# 리스트 [1,2,3,2,4,2,5]에서 숫자 2를 모두 삭제하는 함수를 작성하라.
# delete_list() 함수 직접 작성
def delete_list(lst, key):
    while key in lst:
        lst.remove(key)

numbers = [1,2,3,2,4,2,5]
delete_list(numbers, 2)

print(numbers)
