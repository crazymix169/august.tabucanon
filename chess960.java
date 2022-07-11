import java.util.Arrays;
import java.util.concurrent.TimeUnit;
public class chess960
{

	void generate( int c )
	{
		for( int x = 0; x < c; x++ )
		System.out.println(startPos());
	}


	String startPos()
	{
		char[] p=new char[8];
		//memset( p, 0, 8 );
		Arrays.fill(p,'o');
		int b1, b2;
		boolean q;
		int x1=0;

		// bishops
		while( true )
		{
			b1 = (int)(Math.random()*8) % 8;
			b2 = (int)(Math.random()*8) % 8;
			//
			if( !( (b1 % 2)==1 ) && ((b2 % 2)==1) ) break;
			System.out.println(b1+" "+b2+" "+x1++);
		}
		p[b1] = 'B'; p[b2] = 'B';

		// queen, knight, knight
		q = false;
		for( int x = 0; x < 3; x++ )
		{
			do
			{ b1 = (int)Math.random() % 8; }
			while( p[b1]=='B' || p[b1]=='o');
			if( !q )
			{ p[b1] = 'Q'; q = true; }
			else p[b1] = 'N';
		}

		// rook king rook
		q = false;
		for( int x = 0; x < 3; x++ )
		{
			int a = 0;
			for( ; a < 8; a++ )
			if( !(p[a]=='K') || !(p[a]=='R') ) break;

			if( !q )
			{ p[a] = 'R'; q = true; }
			else
			{ p[a] = 'K'; q = false; }
		}

		String s="";
		StringBuilder sb = new StringBuilder();
		for( int x = 0; x < 8; x++ )
		{
			//sb.append( p[x] );
			s=s+Character.toString(p[x]);
		}
		//s=sb.toString();

		return s;
	}


	public static void main( String args[] )
	{
		//srand( time( NULL ) );
		chess960 c=new chess960();
		c.generate( 10 );
		System.out.println("\n");
		//TimeUnit.SECONDS.sleep(10);
	}
}