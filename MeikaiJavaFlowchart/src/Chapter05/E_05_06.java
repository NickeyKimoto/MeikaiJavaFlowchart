package Chapter05;

/*
*クラス名：E_05_06
*概要：float型の変数を0.0から1.0まで0.001ずつ増やしていく様子と、
*int型の変数を0から1000までインクリメントした値を1000で割った値を
*求める様子を、横に並べて表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/11
*/

public class E_05_06 {

	/*
	*関数名：main
	*概要：float型の変数を0.0から1.0まで0.001ずつ増やしていく様子と、
	*int型の変数を0から1000までインクリメントした値を1000で割った値を
	*求める様子を、横に並べて表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/11
	*/

	public static void main(String[] args) {
		
		// インクリメントした値を1000で割るための定数を宣言
		final int SPECIFIED_NUMBER = 1000;

		// 増やしていくint型の変数を宣言
		int integerVariable = 0;
		
		// どちらの変数を表示しているのかわかりやすくするための表記
		System.out.println("  float        int ");
		// 表記と値の表示の境目
		System.out.println("---------------------");
		
		// float型の変数を0.0から1.0まで0.001ずつ増やし、1.0Fまで繰り返す
		for (float firstVariable = 0.0F; firstVariable <= 1.0F; firstVariable += 0.001F) {
			
			// インクリメントした値を1000で割った値の計算
			float secondVariable = (float) integerVariable / SPECIFIED_NUMBER;
			
			// 0.0から1.0まで0.001ずつ増やした値を表示
			System.out.printf("%1.7f",firstVariable);
			// わかりやすく並べるため空白を表示
			System.out.print("   ");
			// インクリメントした値を1000で割った値を表示
			System.out.printf("%1.7f\n",secondVariable);
			
			// int型の変数をインクリメント
			integerVariable++;

		}

	}

}
