for dan in range(1, 10): # 1~9까지 dan에 넣어서 반복(외부 반복문)
    for i in range(1, 10): # 1~9까지 i에 넣어서 반복(내부 반복문)
        print(f"{dan} x {i} = {dan*i}", end="\t") # dan x i = dan*i하고, 끝에 tab 사용
    print()  # 단마다 줄 바꿈
