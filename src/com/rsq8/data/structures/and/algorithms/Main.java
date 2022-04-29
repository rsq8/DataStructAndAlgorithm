package com.rsq8.data.structures.and.algorithms;
import java.security.Key;
import java.util.*;

public class Main {
	public static void main (String[] args) {
		Node list1 = new Node(1);
		Node list2 = new Node(2);
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
		Node six = new Node(6);
		Node seven = new Node(7);
		Node eight = new Node(8);
		Node nine = new Node(9);
		Node ten = new Node(10);

		LinkedList data = new LinkedList();
		data.addNodeHead(one);
		data.addNodeHead(five);
		data.addNodeHead(seven);
		data.insertHead(93);
		data.insertHead(35);
		data.insertHead(15);
		/*data.addNodeTail(two);
		data.addNodeTail(ten);
		data.addNodeTail(eight);
		data.insertTail(16);
		data.insertTail(33);
		data.insertTail(14);*/

		/*for (Node n: data.nodes()){
			System.out.print(n +", ");
		}

		System.out.println();
		Node track = data.getHead();
		Node other = data.getHead();

		while(other.next.data != 7){
			other = other.next;
		}

		while (track.next != other){
			track = track.next;
		}

		track.next = other.next;
		other.next = null;

		for (Node x = data.getHead(); x != null; x = x.next){
			System.out.print(x.data + ", ");
		}*/


		/*for (int i = 0; i < data.size(); i++){
			System.out.print(data.getNode(i) + ", ");
		}*/

		/*one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;

		Node result = reverseStack(one);*/

		/*while (result != null){
			System.out.print(result.data + ", ");
			result = result.next;
		}*/

		/*TreeMap<Integer, Integer> prac = new TreeMap<>();
		prac.put(7, 7);
		prac.put(4, 4);
		prac.put(1, 1);
		prac.put(11, 11);
		prac.put(8, 8);*/

		BinarySearchTree test = new BinarySearchTree();
		test.insert(1, 1);
		test.insert(2, 2);
		test.insert(3, 3);
		test.insert(4, 4);
		test.insert(5, 5);
		test.insert(6, 6);
		test.insert(7, 7);

		TreeNode start = test.getRoot();
		//com.rsq8.data.structures.and.algorithms.LinkedList list = new com.rsq8.data.structures.and.algorithms.LinkedList();
		//LinkedList list = new LinkedList();
		postOrder(start);
		/*for (int i = 0; i < list.size(); i++) {
			System.out.print(list.getNode(i) + ", ");
		}
		System.out.println();*/

		/*LinkedList sol = new LinkedList();

		for (int num: prac.values()){
			sol.addNodeHead(new Node(num));
			System.out.print(num + ", ");
		}
		System.out.println();
		for (int i = 0; i < sol.size(); i++){
			System.out.print(sol.getNode(i).data + ", ");
		}*/

		/*Graph graph = new Graph(7);
		graph.addEdge(0,1);
		graph.addEdge(0,2);
		graph.addEdge(0,5);
		graph.addEdge(0,6);
		graph.addEdge(6,4);
		//graph.addEdge(3,2);
		graph.addEdge(3,5);
		//graph.addEdge(3,6);
		graph.addEdge(3,4);
		graph.addEdge(5,4);*/
		//graph.addEdge(1,4);

		/*Graph directedGraph = new Graph(7);
		directedGraph.addDirectedEdge(0,1);
		directedGraph.addDirectedEdge(0,2);
		directedGraph.addDirectedEdge(0,5);
		directedGraph.addDirectedEdge(6,0);
		directedGraph.addDirectedEdge(6,4);
		directedGraph.addDirectedEdge(3,2);
		directedGraph.addDirectedEdge(3,5);
		directedGraph.addDirectedEdge(3,6);
		directedGraph.addDirectedEdge(3,4);
		directedGraph.addDirectedEdge(5,2);
		directedGraph.addDirectedEdge(1,4);


		ConnectedComponents cc = new ConnectedComponents(graph);*/
		//cc.print();

		/*BFS data = new BFS(directedGraph, 0);
		System.out.print("Bfs: ");
		data.print();
		System.out.println();
		DFS inOrder = new DFS(directedGraph, 0);
		System.out.print("Dfs : ");
		inOrder.print();
		System.out.println();
		System.out.print("Dfs postOrder: ");
		DFSPostOrder postOrder = new DFSPostOrder(directedGraph, 3);*/
		//System.out.print("Dfs postOrder: ");
		/*postOrder.print();
		System.out.println();
		System.out.print("Topological sort: ");
		TopologicalSort ts = new TopologicalSort(directedGraph, 3);*/
		//System.out.print("Topological sort: ");
		//ts.print();

		/*DirectedEdge a = new DirectedEdge(0,1,2.5);
		DirectedEdge b = new DirectedEdge(0,2,12.0);
		DirectedEdge c = new DirectedEdge(0,5,5.5);
		DirectedEdge d = new DirectedEdge(6,0,2.8);
		DirectedEdge e = new DirectedEdge(6,4,3.1);
		DirectedEdge f = new DirectedEdge(3,5,1.5);
		DirectedEdge g = new DirectedEdge(3,2,2.7);
		DirectedEdge h = new DirectedEdge(3,6,3.5);
		DirectedEdge i = new DirectedEdge(3,4,3.8);
		DirectedEdge j = new DirectedEdge(5,2,3.0);
		DirectedEdge k = new DirectedEdge(1,4,4.4);

		EdgeWeightedDiGraph graph = new EdgeWeightedDiGraph(7);
		graph.addEdge(a);
		graph.addEdge(b);
		graph.addEdge(c);
		graph.addEdge(d);
		graph.addEdge(e);
		graph.addEdge(f);
		graph.addEdge(g);
		graph.addEdge(h);
		graph.addEdge(i);
		graph.addEdge(j);
		graph.addEdge(k);

		DijkstraSP sp = new DijkstraSP(graph, 3);
		System.out.print(sp.distanceTo(4));*/
	}

	static void inOrder(TreeNode node){
		if (node == null) return;
		inOrder(node.left);
		System.out.print(node.data + ", ");
		inOrder(node.right);
	}

	static void postOrder(TreeNode n){
		if (n == null) return;
		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.data + ", ");
	}

	static Node reverse(Node n){
		Node curr = n;
		Node prev = new Node();
		Node next = new Node();
		while (curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	static Node reverseStack(Node n){
		LinkedStack data = new LinkedStack();
		while (n != null){
			data.push((int)n.data);
			n = n.next;
		}
		n = new Node(data.pop());
		Node track = n;
		while (!data.isEmpty()){
			Node temp = new Node(data.pop());
			track.next = temp;
			track = track.next;
		}
		return  n;
	}
	
	static Node splitLinkedList(Node l) {
		if (l == null || l.next == null) {
			return l;
		}

		Node tail1 = l;
		Node end = l.next;
		
		while(tail1 != null && end.next != null) {
			tail1 = tail1.next;
			end = end.next.next;
			if (end == null) break;
		}
		
		Node head2 = tail1.next;
		tail1.next = null;
		
		Node first = splitLinkedList(l);
		Node second = splitLinkedList(head2);
		Node merged = mergeLinkedList(first, second);
		return merged;
		
	}
	
	static Node mergeLinkedList(Node l1, Node l2) {
		Node head = new Node();
		Node trace = new Node();
		if (l1 == null) return l2;
		if (l2 == null) return l1;
		if ((int)l1.data <= (int)l2.data) {
			trace = l1;
			l1 = trace.next;
		} else {
			trace = l2;
			l2 = trace.next;
		}
		
		head = trace;
		
		while(l1 != null && l2 != null) {
			if((int)l1.data <= (int)l2.data) {
				trace.next = l1;
				trace = l1;
				l1 = trace.next;	
			} else {
				trace.next = l2;
				trace = l2;
				l2 = trace.next;
			}
		}
		
		if (l1 == null) trace.next = l2;
		else if (l2 == null) trace.next = l1;
		
		return head;
	}
	
	/*static boolean correctlyPaired(int[] n) {
		LinkedStack open = new LinkedStack();
		LinkedQueue close = new LinkedQueue();
		for (int i = 0; i < n.length; i++) {
			if (n[i] == 1) open.push(1);
			if (n[i] == 10) close.enqueue(1);
			if (n[i] == 2) open.push(2);
			if (n[i] == 20) close.enqueue(2);
			if (n[i] == 3) open.push(3);
			if (n[i] == 30) close.enqueue(3);
		}

		if (close.size() == open.size()) {
			while (!open.isEmpty()) {
				if (open.top() == close.front()) {
					open.pop();
					close.dequeue();
				} else return false;
			}
			return true;
		}
		return false;
	}*/
	/*static Node intersection(LinkedList l1, LinkedList l2) {
		int maxSize = 0;
		int l1Size = l1.size();
		int l2Size = l2.size();
		if (l1.size() < l2.size()) {
			maxSize = l2.size();
		} else {
			maxSize = l1.size();
		}
		while(maxSize > 0) {
			if(l1.getNode(l1Size) == l2.getNode(l2Size)) {
				l1Size--;
				l2Size--;
				maxSize--;
			} else {
				return l1.getNode(l1Size + 1);
			}
		}
		return null;
	}*/
	static int powerOfTwo(int n) {
		if (n == 0) {
			return 1;
		} else {
			return 2 * powerOfTwo (n - 1);
		}
	}
	//linked list intersect set
	static Node intersectionSet(Node l1, Node l2) {
		Set<Node> node = new HashSet<>();
		//long start = System.nanoTime();
		while (l1 != null) {
			node.add(l1);
			l1 = l1.next;
		}
		//long start = System.nanoTime();
		while (l2 != null) {
			if (node.contains(l2)) {
				//long stop = System.nanoTime();
				//System.out.println("Set time: " + (stop - start));
				return l2;
			}
			l2 = l2.next;
		}
		//long stop = System.nanoTime();
		//System.out.println("n time: " + (stop - start));
		return null;
	}
	//linked list intersect map
	static Node intersectionMap(Node l1, Node l2) {
		HashMap<Node, Boolean> node = new HashMap<>();
		//long start = System.nanoTime();
		while (l1 != null) {
			node.put(l1, true);
			l1 = l1.next;
		}
		//long start = System.nanoTime();
		while (l2 != null) {
			if (node.containsKey(l2)) {
				//long stop = System.nanoTime();
				//System.out.println("Map time: " + (stop - start));
				return l2;
			}
			l2 = l2.next;
		}
		//long stop = System.nanoTime();
		//System.out.println("n time: " + (stop - start));
		return null;
	}
	//linked list intersect array while loop
	/*static Node intersectionArrayW(Node l1, Node l2) {
		Node[] nodes = new Node[1];
		int count1 = 0;
		//int count2 = 0;
		//long start = System.nanoTime();
		while(l1 != null) {
			if (count1 == nodes.length - 1) {
				nodes = resize(nodes, (2*nodes.length));
			}
			nodes[count1] = l1;
			l1 = l1.next;
			count1++;
			/*if (l1 == null) {
				count2 = count1;
			}
		}*/
		//long start = System.nanoTime();
		/*while (l2 != null) {
			for (int i = 0; i < count1; i++) {
				if (nodes[i] == l2) {
					//long stop = System.nanoTime();
					//System.out.println("Array(While) time: " + (stop - start));
					return l2;
				}
			}
			if (count1 == nodes.length - 1) {
				nodes = resize(nodes, (2*nodes.length));
			}
			nodes[count1] = l2;
			l2 = l2.next;
			//count1++;
		}
		//long stop = System.nanoTime();
		//System.out.println("Array(while) time: " + (stop - start));
		return null;
	}*/
	//linked list intersect array for loop
	static Node intersectionArrayF(Node l1, Node l2) {
		Node[] nodes = new Node[1];
		int count = 0;
		while(l1 != null) {
			if (count == nodes.length - 1) {
				nodes = resize(nodes, (2*nodes.length));
			}
			nodes[count] = l1;
			l1 = l1.next;
			count++;
		}
		while(l2 != null) {
			if (count == nodes.length - 1) {
				nodes = resize(nodes, (2*nodes.length));
			}
			nodes[count] = l2;
			l2 = l2.next;
			count++;
		}
		//long start = System.nanoTime();
		for (int i = 0; i < nodes.length; i++) {
			for (int j = 0; j < nodes.length; j++) {
				if (nodes[i] == nodes[j] && i != j) {
					//long stop = System.nanoTime();
					//System.out.print("Array(For) time: " + (stop - start));
					//System.out.println();
					return nodes[j];
				}
			}
		}
		//long stop = System.nanoTime();
		//System.out.print("Array(For) time: " + (stop - start));
		return null;
	}
	//resize an array
	static Node[] resize(Node[] a, int max) {
		Node[] temp = new Node[max];
		for (int i = 0; i < a.length; i++) {
			temp[i] = a[i];
		}
		return temp;
	}
	//sum of all elements in an array using a for loop
	static double sumArrayElements1(double[] a) {
		double sum = 0.0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
	//sum of all elements in an array using a while loop
	static double sumArrayElements2(double[] a) {
		double sum = 0.0;
		int counter = a.length - 1;
		while (counter >= 0) {
			sum += a[counter];
			counter --;
		}
		return sum;
	}
	//reverse an array
	static double[] reverseArray(double[] a) {
		int mid = a.length / 2;
		for (int i = 0; i < mid; i++) {
			double temp = a[i];
			a[i] = a[a.length -1 - i];
			a[a.length -1 - i] = temp;
		}
		return a;
	}
	// sum even numbers in an array
	static int sumEvenNumbers(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				sum += a[i];
			}
		}
		return sum;
	}
	//test if a number is prime (6k + 1 algorithm https://tinyurl.com/2p8e4ndv)
	static boolean isPrime(int n) {
		if (n <= 3 ) {
			return n > 1;
		}
		if (n%2 == 0 || n%3 == 0) {
			return false;
		}
		int i = 5;
		while(i*i <= n) {
			if (n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
			i += 6;
		}
		return true;
	}
	// pivot elements of an array about an index
	// return the array to check correctness, or return 
	//the final index to be used for quick sort
	static int[] pivot(int[] a, int index) {
		int end = a.length - 1;
		int start = 0;
		while(start <= end) {
			if (start <= index) {
				if (a[start] <= a[index]) {
					start ++;
				} else  {
					int temp = a[start];
					a[start] = a[end];
					a[end] = temp;
					end --;
				} 
			} else {
				if (a[start] > a[index]) {
					start ++;
				} else {
					int temp = a[start];
					a[start] = a[index];
					a[index] = temp;
					int temp1 = start;
					start = index;
					index = temp1;
				}
			}
		 
		}
		return a;
	}
	// selection sort
	static int[] selectionSort(int[] n) {
		for (int i = 0; i < n.length; i++) {
			int smallest = n[i];
			int index = i;
			for (int j = i + 1; j < n.length; j++) {
				if (n[j] < smallest) {
					smallest = n[j];
					index = j;
				}
			}
			int temp = n[index];
			n[index] = n[i];
			n[i] = temp;
		}
		return n;
	}
	// insertion sort
	static int[] insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0 && (a[j] < a[j-1]); j--) {
				int temp = a[j];
				a[j] = a[j-1];
				a[j-1] = temp;
			}
		}
		return a;
	}
	// Initialise holding array for merge sort
	static int[] temp;
	// method for the merge in mergesort
	/*static void merge(int[] a, int lo, int mid, int hi) {
		int i = lo;
		int j = mid + 1;
		for(int k = lo; k <= hi; k++ ) {
			temp[k] = a[k];
		}
		for (int k = lo; k <= hi; k++) {
			if (i > mid) {
				a[k] = temp[j];
				j++;
			}
			else if (j > hi) {
				a[k] = temp[i];
				i++;
			}
			else if (temp[j] < temp[i]) {
				a[k] = temp[j];
				j++;
			} else {
				a[k] = temp[i];
				i++;
			}
		}
	}
	// recursive method for the sort in mergesort
	/*static void sortMrg(int[] a, int lo, int hi) {
		if (hi <= lo) {
			return;
		}
		int mid = lo + (hi - lo)/2;
		sortMrg(a, lo, mid);
		sortMrg(a, mid+1, hi);
		merge(a, lo, mid, hi);
	}
	// method for user input in merge sort
	/*static int[] mergeSort(int[] a) {
		temp = new int[a.length];
		sortMrg(a, 0, a.length -1);
		return a;
	}
	//method for quicksort partitioning
	/*static int partition(int[] a, int lo, int hi) {
		int i = lo;
		int j = hi+1;
		int k = a[lo];
		while(true) {
			while (a[++i] < k) {
				if (i == hi) break;
			}
			while (k < a[--j]) {
				if (j == lo) break;
			}
			if (i >= j) break;
			int temp = a[j];
			a[j] = a[i];
			a[i] = temp;
		}
		int temp = a[lo];
		a[lo] = a[j];
		a[j] = temp;
		return j;
	}
	//method for recursive quicksort calls 
	static void sortQuk(int[] a, int lo, int hi) {
		if (hi <= lo) {
			return;
		}
		int part = partition(a, lo, hi);
		sortQuk(a, lo, part-1);
		sortQuk(a, part+1, hi);
	}
	//quicksort
	/*static int[] quickSort(int[] a) {
		sortQuk(a, 0, a.length - 1);
		return a;
	}*/
}
