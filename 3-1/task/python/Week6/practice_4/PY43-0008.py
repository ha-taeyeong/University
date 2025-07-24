# menu1 은 공백을 포함하는 문자열 리스트이다.
#
# 아래 조건을 만족하는 menu2fctname() 함수를 완성하시오.
#
# 조건
# Trinket3.x
# 원소들의 첫 문자는 소문자로,
# 공백은 ‘_’ 로 치환
def menu2fctname(menu1): # 사용자 지정 함수, 문자열 리스트 menu1을 입력받음
  result = [] # 결과를 저장할 리스트 초기화
  for kk in menu1: # menu1 리스트의 각 요소에 대해 반복
    result.append(kk.replace(" ", "_")) # 요소 내 공백을 "_"로 치환 후, 결과 리스트에 추가
  return result # 결과 리스트 반환

menu1 = ['Append List','Print List','Delete List','Rename List','Exit']

fct1 = menu2fctname(menu1)

print(fct1)
# ['append_List', 'print_List', 'delete_List', 'rename_List', 'exit']