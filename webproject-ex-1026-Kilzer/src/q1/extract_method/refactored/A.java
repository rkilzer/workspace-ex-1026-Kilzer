package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      m3(nodes, p);
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      m3(edgeList, p);
      
      // other implementation
      return null;
   }

   <T extends Graph>Graph m3(List<T> graphList, String p) {
	   for (Graph graph : graphList) {
			if (graph.contains(p))
				System.out.println(graph);
		}
	   
	   return null;
   }
}

class Node extends Graph {

}

class Edge extends Graph {

}

class Graph {
	   String name;

	   public boolean contains(String p) {
	       return name.contains(p);
	   }
}