import numpy as np
import matplotlib.pyplot as plt
xx = np.arange(-10, 10, 0.1)
yy = xx**2 + 10
plt.plot(xx, yy)
plt.grid()
plt.show()