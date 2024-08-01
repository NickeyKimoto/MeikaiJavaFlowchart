package Chapter15;

/*
*クラス名：E_15_07
*概要：コマンドライン引数で与えられた値の合計をを求めて表示
*作成者：N.Kimoto
*作成日：2024/05/28
*/
public class E_15_07 {

	/*
	*関数名：main
	*概要：コマンドライン引数で与えられた値の合計をを求めて表示
	*引数：実数値(String型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/28
	*/
	public static void main(String[] args) {
		// 合計を表す変数を宣言(教本準拠の変数名)
		double sum = 0.0;
		// 合計を求める
		for (String s : args) {
			// 実数値を一つずつ加算
			sum += Double.parseDouble(s);
		}
		// 合計値を表示
		System.out.println("合計は" + sum + "です。");
	}

}
