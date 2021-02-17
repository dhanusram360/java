package mycaptain;

public class Array {

	public static void main(String[] args) {
		int a[][]= { {1,3,4} ,{2,4,3} , {3,4,5} }; 
		int b[][]= { {1,3,4}, {2,4,3} , {1,2,4} };
	    int c[][]= new int[3][3] ;
		int i;
		int j;
		for(i=0;i<=2;i++) {
	
			for(j=0;j<=2;j++) 
			{
				c[i][j]= a[i][j] +  b[i][j];
			}
		}
		
		System.out.println(c[0][0] +" "+  c[0][1] +" "+c[0][2]  +" "+ c[1][0]+" "+c[1][1] +" "+c[1][2] +" "+ c[2][0] +" "+c[2][1]+" "+c[2][2]);
		
		
		
		
		

	}

}
