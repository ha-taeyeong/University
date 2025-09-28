# reads a graph from a given data source which can be a file path or string as .graph or .layout.

import networkx as nx
import matplotlib.pyplot as plt
import os

def read_graph_or_layout(input_data, from_file=True, is_directed=False):
    if from_file:
        file_extension = os.path.splitext(input_data)[1]
        with open(input_data, 'r') as file:
            data = file.read()
    else:
        file_extension = '.layout' if 'arrowExists' in input_data else '.graph'
        data = input_data

    if file_extension == ".graph":
        return read_graph_format(data, is_directed)
    elif file_extension == ".layout":
        return read_layout_format(data, is_directed)
    else:
        raise ValueError(f"Unknown file format: {file_extension}")

def read_graph_format(data, is_directed):
    G = nx.DiGraph() if is_directed else nx.Graph()
    node_positions = None
    lines = data.strip().split('\n')
    
    for line in lines:
        node, neighbors = line.strip().replace("}", "").replace("{", "").split(":")
        node = int(node)
        neighbors = map(int, neighbors.split(", "))
        
        for neighbor in neighbors:
            G.add_edge(node, neighbor)
                
    return G, node_positions

def read_layout_format(data, is_directed):
    G = nx.DiGraph() if is_directed else nx.Graph()
    node_positions = {}
    
    lines = data.strip().split('\n')
    for line in lines:
        line = line.strip()
        
        if not line.startswith("arrowExists") and not line.startswith("nodeX") and not line.startswith("nodeY"):
            continue
        
        if line.startswith("arrowExists"):
            parts = line.split("=")
            if parts[1] == "true":
                nodes = parts[0].split("_")[1:]
                source = int(nodes[0])
                target = int(nodes[1])
                G.add_edge(source, target)
        
        if line.startswith("nodeX"):
            node = int(line.split("_")[1].split("=")[0])
            x_pos = float(line.split("=")[1])
            
            if node not in node_positions:
                node_positions[node] = (x_pos, 0)
            else:
                node_positions[node] = (x_pos, node_positions[node][1])
        
        if line.startswith("nodeY"):
            node = int(line.split("_")[1].split("=")[0])
            y_pos = float(line.split("=")[1])
            
            if node not in node_positions:
                node_positions[node] = (0, y_pos)
            else:
                node_positions[node] = (node_positions[node][0], y_pos)
    
    return G, node_positions

def visualize_graph(G, node_positions=None):
    if node_positions:
        nx.draw(
            G, pos=node_positions, with_labels=True, node_color='lightblue', node_size=700, font_size=10, arrows=nx.is_directed(G)
        )
    else:
        nx.spring_layout(G, iterations=4000, seed=4000)
        nx.draw(G, with_labels=True, node_color='lightblue', node_size=700, font_size=10, arrows=nx.is_directed(G))
    plt.show()
