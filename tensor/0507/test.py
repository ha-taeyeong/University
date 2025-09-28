import torch
print(torch.tensor([1, 2, 3])) # Linked List => Tensor Type 형변환
ls = [2., 4.3, 5.3]
print(torch.tensor(ls))

ls1 = [[1, 2, 3],
      [4, 5, 6]]
t1 = torch.tensor(ls1) # 형태 유지
print("형태 유지")
print(t1)
print("행렬 사이즈")
print(t1.shape)