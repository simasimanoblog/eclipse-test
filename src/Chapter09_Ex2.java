
public class Chapter09_Ex2 {

	public static void main(String[] args) {
		int a = 427;
		int b = 976;
		System.out.println(a + " と " + b + " の最大公約数は、" + gcd(a, b) + "です。");
	}

	// ユークリッドの互除法で最大公約数を計算するメソッド
	/* 
	static int gcd(int a, int b) {

		int ad = a;
		int bd = b;

		if (a <= b) {
			ad = b;
			bd = a;
		}

		int amari = ad % bd;

		if (amari == 0) {
			return bd;
		}
		return gcd(bd, amari);
	}
	*/

    // ユークリッドの互除法で最大公約数を計算するメソッド
    static int gcd(int a, int b) {
        // b(余り)が0になった時のaが最大公約数
        if (b == 0) {
            return a;
        }
        // 再帰呼び出し
        return gcd(b, a % b);
    }
	
}
