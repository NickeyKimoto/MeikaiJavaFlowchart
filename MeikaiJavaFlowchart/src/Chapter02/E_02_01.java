package Chapter02;

/*
*クラス名：E_02_01
*概要：小数部を持つ実数値をxとyに代入した場合の検証
*作成者：N.Kimoto
*作成日：2024/04/04
*/

public class E_02_01 {
	
	/*
	*関数名：main
	*概要：小数部を持つ実数値をxとyに代入した場合の検証
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/04
	*/

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// List2-6の該当箇所を小数部を持つ実数値をxとy代入
		// 結果の予想は「代入された実数値の小数部を切り捨てられてから計算される」
		
		// firstVariableに一つ目の小数部を持つ実数値を代入
		int firstVariable = 63.5;
		// secondVariableに二つ目の小数部を持つ実数値を代入
		int secondVariable = 18.2;
				
		// 一つ目の実数値を表示
		System.out.println("xの値は" + firstVariable + "です。");
		// 二つ目の実数値を表示
		System.out.println("yの値は" + secondVariable + "です。");
		// 合計を表示
		System.out.println("合計は" + (firstVariable + secondVariable) + "です。");
		// 平均を表示
		System.out.println("平均は" + (firstVariable + secondVariable) / 2 + "です。");
		
		// 結果、エラーのため表示できず。
		// 理由：firstVariableとsecondVariableに整数値を入力していないから。

	}

}
