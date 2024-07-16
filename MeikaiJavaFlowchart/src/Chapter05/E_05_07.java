package Chapter05;

/*
*クラス名：E_05_07
*概要：0.0から1.0まで0.001おきに、その値とその値の2乗を表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/11
*/

public class E_05_07 {

	/*
	*関数名：main
	*概要：0.0から1.0まで0.001おきに、その値とその値の2乗を表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/11
	*/

	public static void main(String[] args) {

		// インクリメントした値を1000で割るための定数を宣言
		final int SPECIFIED_NUMBER = 1000;

		// どちらの変数を表示しているのかわかりやすくするための表記
		System.out.println("0.0～1.0   2乗");
		// 表記と値の表示の境目
		System.out.println("---------------------");
		
		// 0.0から1.0まで0.001おきに繰り返す
		for (int i = 0; i <= SPECIFIED_NUMBER; i ++) {

			// 誤差を累積させないように0.001ずつ値を増加させる
			float firstVariable = (float)i / SPECIFIED_NUMBER;
			// その値を2乗する
			float squareNumber = firstVariable * firstVariable;
			
			// そのとき値を小数点第7位まで表示
			System.out.printf("%1.7f", firstVariable);
			// 境目を表示
			System.out.print("  ");
			// 2乗した値を小数点第7位まで表示
			System.out.printf("%1.7f\n", squareNumber);
			
			
		}

	}

}
