import java.util.Scanner;
public class Transpose2darray {

	public static void main(String[] args) {
		System.out.println("enter the total rows and columns");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int column=sc.nextInt();
		int a[][]= new int[row][column];
		int i,j;
		System.out.println("enter matrix");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				a[i][j]=sc.nextInt();
				System.out.println("");
				
			}
			System.out.println("transpose matrix is");
			for(i=0;i<column;i++)
			{
				for(j=0;j<row;j++)
				{
					{
						System.out.println(a[i][j]+"");
					}
					System.out.println("");
				}
			}
		}
        
	}

}