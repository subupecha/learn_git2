
public class intvQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc[][]={{2,4,5},{3,0,10},{1,2,3}};
		int min=abc[0][0];
		int minimumColoumn = 0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]<min)
				{
					min=abc[i][j];
					 minimumColoumn = j;
				}
			}
		}
		int max=abc[0][minimumColoumn];
		int k=0;
		while(k<3)
		{
			if(abc[k][minimumColoumn]>max)
			{
				max=abc[k][minimumColoumn];
			}
			k++;
		}
		System.out.println(max);
		

	}

}
