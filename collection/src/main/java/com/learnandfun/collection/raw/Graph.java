package com.learnandfun.collection.raw;

import java.util.LinkedList;

public class Graph {
	private int vertices;
	private LinkedList<GraphNode> adjList[];

	public Graph(int vertices) {
		this.vertices = vertices;
		adjList = new LinkedList[vertices];
		for (int index = 0; index < vertices; index++) {
			adjList[index] = new LinkedList<GraphNode>();
		}

	}

	public void addEdge(int vertex, int value) {
		// 0 -> [2,3]
		GraphNode node = new GraphNode(value);
		adjList[vertex].add(node);
	}

	public void BFS() {
		// Create a queue
		LinkedList<GraphNode> queue = new LinkedList<>();
		// For first Node


		for (int graphIndex = 0; graphIndex < vertices; graphIndex++) {
			LinkedList<GraphNode> nodeList = adjList[graphIndex];
			for (int nodeIndex = 0; nodeIndex < nodeList.size(); nodeIndex++) {
				// Added Neighbors
				GraphNode node = nodeList.get(nodeIndex);
				node.visited = true;
				queue.add(node);
				for (int index = 0; index < queue.size(); index++) {
					GraphNode node1 = queue.poll();
					System.out.print(node1.value);
					// Add Neighbors
				}

			}

		}

	}


}
