a = [1, 2, 3]
b = [2, 3, 4]
outer = []
for i in range(len(a)):
  row = []
  for j in range(len(b)):
    row.append(a[i]*b[j])
  outer.append(row)
print(outer)