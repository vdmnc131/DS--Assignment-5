import java.io.*;
import java.lang.Integer;
import java.util.*;
public class check{
    public static void main(String args[]){

        long start=System.currentTimeMillis();
         Graph sutta = new Graph(4);

         Vector < Integer>  p= new Vector<Integer>();
         Vector < Integer>  q= new Vector<Integer>();
         Vector < Integer>  r= new Vector<Integer>();
          Vector < Integer>  s= new Vector<Integer>();
         p.add(2);p.add(4);
         q.add(3);
         
         s.add(3);
         sutta.Add_edges(1,p);
         sutta.Add_edges(2,q);
         sutta.Add_edges(3,r);
         sutta.Add_edges(4,s);
         sutta.REVERSE_GRAPH();
          sutta.Graph_DFS();
             sutta.REVERSE_GRAPH_DFS();
                            long stop=System.currentTimeMillis();
                long elapsedTime=stop-start;
                System.out.println(elapsedTime);
                System.out.println();

   



     
}
}

