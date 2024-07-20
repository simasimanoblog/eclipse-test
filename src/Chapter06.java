
public class Chapter06 {

	public static void main(String[] args) {
		// プリミティブ型の「long」の変数に値(10000000000)を代入して出力
		long lngVariable = 10000000000L;
		System.out.println(lngVariable);		
		// プリミティブ型の「double」の変数に値(3.14)を代入して出力
		double dblVariable = 3.14;
		System.out.println(dblVariable);		
		// プリミティブ型の「boolean」の変数(true)に値を代入して出力
		boolean blnVariable = true;
		System.out.println(blnVariable);		
		
		
		// ラッパークラスの「Integer」の変数に値(100)を代入して出力
		//int intVariable = 100;
		//System.out.println(intVariable);		
		Integer i = 100;
		System.out.println(i);
		// ラッパークラスの「Float」の変数に値(1.4142)を代入して出力
		//float fltVariable = 1.4142f;
		//System.out.println(fltVariable);		
		Float f = 1.4142f;
		System.out.println(f);
		// ラッパークラスの「Character」の変数に値('う')を代入して出力
		//char chrVariable = 'う';
		//System.out.println(chrVariable);		
		Character c = 'う';
		System.out.println(c);
		
		
		// 要素数が5の「int」配列に値({ 0, 10, 20, 30, 40 })を代入して、インデックス番号が3の値を出力
		int arr[] = new int[] {0,10,20,30,40};
		System.out.println(arr[3]);		
				
				
	}

}