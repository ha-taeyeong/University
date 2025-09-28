import numpy as np
import matplotlib.pyplot as plt

np.random.seed(4)
total_samples = 100

X = np.vstack([(300 - 50) * np.random.rand(total_samples - 10, 1) + 50, (450 - 250) * np.random.rand(10, 1) + 250])

perm = np.random.permutation(total_samples)
X = X[perm]

Y = 2.0 * X + 10 + np.sqrt(5000) * np.random.randn(total_samples, 1)

print(X.shape)
print(Y.shape)

plt.rcParams['font.size'] = 13
plt.rcParams["figure.figsize"] = (12,8)
plt.scatter(X, Y, marker = 'x')
#plt.scatter(X_test, Y_test, marker = 'o', color = 'red')
plt.grid()
plt.xlabel('square meter')
plt.ylabel('Price')
