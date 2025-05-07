# prompt: make a plot using torchivision mnist

import torch
import torchvision
import matplotlib.pyplot as plt

# Download MNIST dataset
mnist_data = torchvision.datasets.MNIST(root='./data', train=True, download=True)

# Access data samples
image, label = mnist_data[0]

# Display the image
plt.imshow(image, cmap='gray')
plt.title(f'Label: {label}')
plt.show()
