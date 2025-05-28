import numpy as np
import matplotlib.pyplot as plt
import math

# xx = np.linspace(0, 4 * np.pi, 100)  # 시작, 끝, 점 개수
xx = [ kk/10 for kk in range(0, 100)]
yy = [math.sin(kk) for kk in xx]

plt.plot(xx, yy)
plt.grid()
plt.show()

