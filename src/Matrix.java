

public class Matrix {

	private int n;
	private Vertex v[] = new Vertex[16];
	private int max = 0; 
	private String output = "";
	
	public Matrix (int n)
	{
		this.n = n;
		output += "n is " + n + "\n" + "\n";
		int counter = 0;
		for(int i = 1; i<=4; i++){
			for(int j = 1; j<=4; j++){
//				System.out.println("counter " + i + " " + j);
				v[counter] = new Vertex(i,j);
				counter++;
			}
		}
		this.max = (int) Math.pow(2, Math.pow(n,2))-1;

	}

	public String getVertices (){

//		for (int i=0; i<=n; i++){

//			System.out.println("n is " + n);

			
				for(int i = 0 ; i<=max; i++){
				
				System.out.println("The max number 2^(n^2)-1 = " + i);
				output += "The max number 2^(n^2)-1 = " + i + "\n";

				String binary = Integer.toBinaryString(i);
				System.out.println("Binary form: " + binary);
				output += "Binary form: " + binary + "\n";

				
				int length = binary.length()-1;
		 
				for(int j=length; j>=0; j--){
//
					if(i==0)output += "empty set";
					if(binary.charAt(j)=='1') output += v[length-j].getVertex();

//					if(j == length) break;
//					
				}
				System.out.println();
				output = output + "\n";
			}
//				System.out.println(output);
				return output;
	}
} 



