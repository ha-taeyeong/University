import numpy as np
import matplotlib.pyplot as plt
xx = np.linspace(0, 4 * np.pi, 50)  # 시작, 끝, 점 개수
yy = np.sin(xx)*xx
plt.plot(xx, yy)
plt.grid()
plt.show()

