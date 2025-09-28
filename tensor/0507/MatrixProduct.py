a = [[1, 2, 3], # [0,0] [0,1] [0,2]
     [2, 3, 4]] # [1,0] [1,1] [1,2]
b = [[2, 3],
     [3, 4],
     [4, 5]]
# [0][0]
len(a), len(a[0])
outer = []
for i in range(len(a)): # len(a):2
  row = []
  for j in range(len(b[0])): # len(b[0]):2
    sum = 0
    for k in range(len(b)): # len(b):3
      sum += a[i][k]*b[k][j]
    row.append(sum)
  outer.append(row)
print(outer)

