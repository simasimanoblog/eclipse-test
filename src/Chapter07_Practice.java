
public class Chapter07_Practice {

	public static void main(String[] args) {
		int a = 15;
		int c;
		c = a + 3; // c = 18
		System.out.println("加算：" + c);
		c = a - 5; // c = 10
		System.out.println("減算：" + c);
		c = a * 2; // c = 20
		System.out.println("乗算：" + c);
		c = a / 6; // c = 2
		System.out.println("除算：" + c);
		c = a % 4; // c = 3
		System.out.println("剰余算：" + c);

		int d;
		d = 10;
		d++; // d = 11
		System.out.println("インクリメント：" + d);
		d = 10;
		d--; // d = 9
		System.out.println("デクリメント：" + d);

		int e;
		int f;

		e = 5;
		f = ++e; // e をインクリメントした後に、e が f に代入される
		// それぞれの値は、e が「6」で f も「6」
		System.out.println("前置e：" + e);
		System.out.println("前置f：" + f);

		e = 5;
		f = e++; // e を f に代入した後に、e がインクリメントされる
		// それぞれの値は、e が「6」で f が「5」
		System.out.println("後置e：" + e);
		System.out.println("後置f：" + f);

		//「代入演算子」
		int g;
		g = 10; // g = 10：gに10を代入
		g += 5; // g = 15：gにg+5の結果を代入
		g -= 3; // g = 12：gにg-3の結果を代入
		g *= 4; // g = 48：gにg*4の結果を代入
		g /= 2; // g = 24：gにg/2の結果を代入
		g %= 7; // g = 3 ：gにg%7の結果を代入

		
		//「関係（比較）演算子」
		int h = 5;
		boolean i;

		i = h < 5;   // i = false
		i = h <= 5;  // i = true
		i = h > 4;   // i = true
		i = h >= 6;  // i = false
		i = h == 5;  // i = true
		i = h != 5;  // i = false

		//「論理演算子」
		boolean j = true;
		boolean k = false;
		boolean l;

		l = j && true;   // l = true
		l = j && false;  // l = false
		l = k || true;   // l = true
		l = k || false;  // l = false
		l = !j;          // l = false
		l = !k;          // l = true


		//「文字列の連結」
		String m = "100";
		String n = "200";
		String o;
		o = m + n;        // o = 100200
		o = "あ" + "い";   // o = あい

		
		//「文字列の等価比較」
		String p = "applePie";
		String q = "applePie";
		Boolean r;
		r = p == q;  // r = true
		
		//String a = "applePie";
		//String d = "apple";
		//String e = d + "Pie";
		//c = a == e;  // c = false
		
		// 変数の中身はすぐ上の例と同じ
		//c = a.equals(b);  // c = true
		//c = a.equals(e);  // c = true
		//c = a.equals(f);  // c = true
		
		

		
	}

}
