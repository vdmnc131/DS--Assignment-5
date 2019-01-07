import java.io.*;
import java.lang.Integer;
import java.util.*;

class Vertex {
	public int value;
	public boolean explored;
	public Vector<Integer> list;
	public int start;
	public int finish;
	// public Vertex() {
	// 	value=0;
	// 	explored=false;
	// 	start=0;
	// 	finish=0;
	// 	list = new Vector<Integer>();
	// }

	public Vertex(int value) {
		this.value=value;
		explored=false;
		start=0;
		finish=0;
		list = new Vector<Integer>();
	}


}