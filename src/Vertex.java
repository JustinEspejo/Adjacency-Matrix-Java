
public class Vertex {

	private final int v1;
	private final int v2;
	
	Vertex (int v1, int v2){
		
		this.v1 = v1;
		this.v2 = v2;
		
		
	}
	
	
	public String getVertex ()
	{
		
		System.out.print("("+ v1 + "," + v2 + ") ");
		String vertex = "("+ v1 + "," + v2 + ") ";
		return vertex;
		
	}
	
	
}

