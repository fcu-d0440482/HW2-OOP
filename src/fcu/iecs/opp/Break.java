package fcu.iecs.opp;
public class Break {

	public static void main(String[] args) {
		int i;
		for( i = 0 ; i < 5 ; i++ )
		{
			if( i == 2 )
			{
				break;
			}
			System.out.println(i);
		}

	}

}
