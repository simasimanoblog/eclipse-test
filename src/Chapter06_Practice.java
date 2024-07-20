
public class Chapter06_Practice {
	public static void main(String[] args) {
		
		//整数型
		// long long1 = 9223372036854775807;  // コンパイルエラーになる
		// Long は明示的に「L」を記述する
		long long2 = 9223372036854775807L;
		short short1 = 32767;
		byte byte1 = 127;

		//浮動小数型
		double double1 = 1234567.89;
		double double2 = 1234567.89d;  // 明示的にすることも可能
		//float float1 = 0.123;          // コンパイルエラー
		// float は明示的に「f」を記述する
		float float2 = 0.123f;
		//浮動小数点の循環小数
		System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);
	
		//論理型
		boolean boolean1 = true;
		boolean boolean2 = false;
	
		//文字型
		char char1 = 'あ';
		char char3 = 'A';
		//char char2 = 'AB'     // コンパイルエラー
		char char4 = 0x3042;  // 文字コードでひらがなの「あ」を表現
		//'あ';                 // プログラム上ではchar型
		System.out.println();
		
		//文字列クラス（String型）
		String string1 = "あいう";
		// 「"あいう";」はプログラム上ではString型
		
		
		/*
		プリミティブ型	ラッパークラス型
		long	Long
		int	Integer
		short	Short
		byte	Byte
		double	Double
		float	Float
		boolean	Boolean
		char	Character
		*/
		
		
		//ボクシング
		Integer integer1 = 5;                   // オートボクシング
		Integer integer2 = Integer.valueOf(5);  // 明示的なボクシング
		int int1 = integer1;             // アンボクシング
		int int2 = integer2.intValue();  // 明示的なアンボクシング
		
	
		//配列
		int[] array1 = new int[3];  // 配列の宣言と生成
		array1[0] = 60;  // インデックス番号「0」を指定して１番目の要素にデータを代入
		array1[2] = 20;  // ２番目の要素より先に３番目の要素にデータを代入
		array1[1] = 20;  // ３番目と同じ値を２番目の要素に代入
		int int3 = array1[2];  // インデックス番号「2」を指定して３番目の要素を取得

		int array2[] = null;  // []は変数名の後ろでも可
		
		//配列の初期化
		int[] array3 = new int[] { 10, 20, 50 };
		int[] array4 = { 10, 20, 50 };
		
		//配列の要素数取得
		System.out.println(array3.length);
		
		
	}
}
