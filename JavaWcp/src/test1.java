
public class test1 {

	public static void main( String[] args ) {
		// 足す値の最大値nの値を格納する変数
	 		int n = 15;
	   
		// 1からnを足した値を計算
	  		int sum = 0;
	   		for ( int i = 1; i <= n; ++ i )
	   			sum = sum + i;
	   
	   		// 結果を表示
	System.out.println( "1～" + n + "の和 : " + sum );
	}
}
