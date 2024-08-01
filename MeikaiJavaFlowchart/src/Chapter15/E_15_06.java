package Chapter15;

// Mathクラスをインポート
import static java.lang.Math.*;

/*
*クラス名：E_15_06
*概要：コマンドライン引数で与えられた半径を持つ円の円周の長さと面積を求めて表示
*作成者：N.Kimoto
*作成日：2024/05/28
*/
public class E_15_06 {

	/*
	*関数名：main
	*概要：コマンドライン引数で与えられた半径を持つ円の円周の長さと面積を求めて表示
	*引数：半径(double型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/28
	*/
	public static void main(String[] args) {
		// 円周の長さを表す変数を宣言
		double circumferenceLength = 0;
		// 円の面積を表す変数を宣言
		double circleArea = 0;
		// 円の半径を表す変数を宣言
		double circleRadius = 0;
		
		// 円の円周の長さと面積を求める
		for (int i = 0; i < args.length; i++) {
			
			// 半径を表す変数を初期化
			circleRadius = Double.parseDouble(args[i]);
			// 値の符号を反転させる定数を宣言
			final int REVERSE_SIGN = -1;
			// 与えられた引数が負の値だった場合
			if (circleRadius < 0) {
				System.out.println("半径が負の値なので正の値に反転させます");
				// 符号を反転させる
				circleRadius *= REVERSE_SIGN;
			}
			
			// 円の直径を求める式に出てくる定数を宣言
			final int CALCULATE_CIRCUMFERENCE_LENGTH_CONSTANT = 2;
			// 直径を求め代入
			circumferenceLength = circleRadius * CALCULATE_CIRCUMFERENCE_LENGTH_CONSTANT * PI;
			// 面積を求め代入
			circleArea = circleRadius * circleRadius * PI;
			
			// 半径を表示
			System.out.println("半径" + circleRadius + "の");
			// 円周を表示
			System.out.println("円周の長さ：" + circumferenceLength);
			// 面積を表示
			System.out.println("円の面積：" + circleArea);
			
			// 改行する
			System.out.println();
		}
	}

}
