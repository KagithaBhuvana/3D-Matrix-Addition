import java.util.*;
class addition3d{
	public static void main(String[] args){
		int[][][] a=new int[10][10][10];
		int[][][] b=new int[10][10][10];
		int[][][] c=new int[10][10][10];
		int i,j,m1,m2,n1,n2,p1,p2,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of length of 3d array:");
		m1=sc.nextInt();
		System.out.println("enter no.of width of 3d array:");
		n1=sc.nextInt();
		System.out.println("enter no.of height of 3d array:");
		p1=sc.nextInt();
		System.out.println("enter no.of length of 3d array:");
		m2=sc.nextInt();
		System.out.println("enter no.of width of 3d array:");
		n2=sc.nextInt();
		System.out.println("enter no.of height of 3d array:");
		p2=sc.nextInt();
		System.out.println("enter elements of array1:");
		for(i=0;i<m1;i++)
		{
			for(j=0;j<n1;j++)
			{
				for(k=0;k<p1;k++)
				{
					a[i][j][k]=sc.nextInt();
				}
			}	
		}
		System.out.println("enter elements of array2:");
		for(i=0;i<m2;i++)
		{
			for(j=0;j<n2;j++)
			{
				for(k=0;k<p2;k++)
				{
					b[i][j][k]=sc.nextInt();
				}
			}
		}
		System.out.println("-----elements of array1-----:");
		for(i=0;i<m1;i++)
		{
			for(j=0;j<n1;j++)
			{
				for(k=0;k<p1;k++)
				{
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();	
		}
		System.out.println("-----elements of array2-----:");
		for(i=0;i<m2;i++)
		{
			for(j=0;j<n2;j++)
			{
				for(k=0;k<p2;k++)
				{
					System.out.print(b[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		if(m1!=m2 || n1!=n2 || p1!=p2)
		{
			System.out.println("addition not possible");
		}
		else{
		for(i=0;i<m2;i++)
		{
			for(j=0;j<n2;j++)
			{
				for(k=0;k<p2;k++)
				{
					c[i][j][k]=a[i][j][k]+b[i][j][k];
				}
			}
		}
		System.out.println("resultant matrix");
		for(i=0;i<m2;i++)
		{
			for(j=0;j<n2;j++)
			{
				for(k=0;k<p2;k++)
				{
					System.out.print(c[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		}
	}
}
		
		
