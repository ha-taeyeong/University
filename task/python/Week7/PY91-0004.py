# 다음 프로그램은 함수 바깥쪽에서 만든 리스트의 값을 출력하는 프로그램이다.
lt1 = ['AAA','BBB','AAA','CCC'] # lt1 lt1 리스트 선언 및 초기화

def delete_List(): # delete_List 사용자 정의 함수
  global lt1 # lt1을 전역 변수로 선언하여 함수 내부에서 수정 가능하게 함
  print(lt1) # 기존 lt1 리스트 출력
  lt1 = ['DDD','BBB','FFF','CCC'] # lt1 값을 새로운 리스트로 갱신
  print(lt1) # 갱신된 lt1 출력

delete_List() # delete_List() 함수 호출