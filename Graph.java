import java.io.*;
import java.lang.Integer;
import java.util.*;

class Graph {
	Vector < Vertex > A ;
	int time=0;
	Vector < Vertex> B ;
	Vector <Integer> C;
	Vector <index> SCC;
	// Vector < Integer> C;
	public Graph(int N) {
		A = new Vector<Vertex>();
		B=  new Vector<Vertex>();
		C= new  Vector<Integer>();
		SCC= new Vector<index>();
		// int o=0;
		C.add(0);
		// Vertex p= new Vertex();
		for(int i=0;i<=N;i++) {
			A.add(new Vertex(i));
			B.add(new Vertex(i));
			
		}		

	}

	public void Add_edges( int i ,Vector temp) {
		 // A.get(i).list = new Vector<Integer>();
		 A.get(i).list=temp;
	}
	public void Add_scc(int i , int j) {
		SCC.get(i).list1.add(j);
	}

	public void Graph_DFS() {
	
		int i=1;

		while(  i<=A.size()-1) {
			
			if(!A.get(i).explored)
			DFS(A.get(i).value ,A);
			i++;
			// System.out.println(i);
		}
	}


	
	public void DFS(int s ,Vector<Vertex> A) {
		
		A.get(s).explored=true;
		

		A.get(s).start=++time;
		for(int i=0; i<=A.get(s).list.size()-1;i++) {
			if(!A.get(A.get(s).list.get(i)).explored){
				DFS(A.get(A.get(s).list.get(i)).value ,A);
			}
		}
		A.get(s).finish=++time;
	// System.out.println(s);
		C.add(s);


	}
	public int DFS2(int s ,Vector<Vertex> B ,int y) {
		int g=0;
		
		  //System.out.println(y);
		int l= C.indexOf(s);
		   // System.out.println(l);
		C.set(l,0);
		B.get(s).explored=true;
		 // System.out.println(y);
		SCC.get(y).list1.add(s);
		   // System.out.println(B.get(s).list.size());

		for(int i=0; i<=B.get(s).list.size()-1;i++) {
			if(B.get(B.get(s).list.get(i)).explored &&( y>=1 ) ) {
				// System.out.println("llol");

				for(int j=0;j<=SCC.get(y-1).list1.size()-1;j++) {
					if(B.get(s).list.get(i)==SCC.get(y-1).list1.get(j)) {
						g=1;
					}

				}
		
			}

			// System.out.println(i);
			if(!B.get(B.get(s).list.get(i)).explored){
				//System.out.println(s);
				DFS2(B.get(B.get(s).list.get(i)).value ,B ,y);
			}
		}
		return(g);
	
	}
	public void REVERSE_GRAPH() {
	

		for(int i=1;i<=A.size()-1;i++) {
			B.get(i).start=A.get(i).start;
			B.get(i).finish=A.get(i).finish;
			for(int j=0;j<=A.get(i).list.size()-1;j++) {
				B.get(A.get(i).list.get(j)).list.add(i);
			}
		}
	}
	public void REVERSE_GRAPH_DFS() {
		int count=0;
		int check=0;
		for(int i=C.size()-1;i>0;i--) {
			 //if(i==3) System.out.println(C.get(3));
			if(C.get(i)!=0) {
				SCC.add(new index(count));

				check=DFS2(C.get(i) , B ,count);


				count++;
				// System.out.println(count);
				if(count>=2 && check==0) {
					  System.out.println("0");
					return;
				}

			}
		}
	
			 System.out.println("1");
		


	}	





}
