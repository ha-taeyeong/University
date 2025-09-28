import torch
# 미분할 때 float type이여야 한다.
X = torch.tensor(1.0, requires_grad=True)
Y = torch.tensor(2.0, requires_grad=True)
Z = X * Y
Z.backward()
print("Y 미분", Y.grad)
print("X 미분", X.grad)
