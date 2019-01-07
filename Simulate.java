import java.io.*;
import java.lang.*;
import java.util.*;

class Simulate{

	public static void main (String[] args)
	{		
		// long start=System.currentTimeMillis();
		

		try 
		{
			int l=1;
			FileInputStream file =  new FileInputStream("query.txt"); 
	 		Scanner p = new Scanner(file);
	 		
	 		String q = p.nextLine();
	 		Graph W = new Graph(Integer.parseInt(q));
	 		
	 		while(p.hasNextLine())
	 		{
	 			
	 			String query = p.nextLine(); 

	 			
	 	
	 		
	 				String[] s = query.split(",");
	 			

	 				Vector < Integer>  u= new Vector<Integer>();
	 				if(query.equals("-"))
	 					W.Add_edges(l,u);
	 				else{
	 				for(int i=0;i<s.length;i++) {
	 					u.add(Integer.parseInt(s[i]));
	 					W.Add_edges(l,u);
	 				}
	 				}

	 		
	 			l++;
	 		}
	 		W.REVERSE_GRAPH();
          	W.Graph_DFS();
            W.REVERSE_GRAPH_DFS();
         //              for(int i=1;i<=W.B.size()-1;i++)
         // {
         //    System.out.println(W.B.get(i).value);
         // }
         // // // System.out.println(sutta.C.size());
         
             
	 	} 
	
		catch (FileNotFoundException e)
		{
	 		System.out.println("File not found");
		}
	// }
				// long stop=System.currentTimeMillis();
				// long elapsedTime=stop-start;
				// System.out.println(elapsedTime);
				// System.out.println();


			
		
	}
}
