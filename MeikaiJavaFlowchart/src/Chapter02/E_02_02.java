package Chapter02;

/*
*クラス名：E_02_02
*概要：三つの値の合計と平均を求めるプログラム
*作成者：N.Kimoto
*作成日：2024/04/04
*/

public class E_02_02 {
	
	/*
	*関数名：main
	*概要：三つの値の合計と平均を求めるプログラム
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/04
	*/

	public static void main(String[] args) {
	// TODO 自動生成されたメソッド・スタブ
		
		// int型の変数に一つ目の整数を代入
		int firstVariable = 63;
		// int型の変数に二つ目の整数を代入
		int secondVariable = 18;
		// int型の変数に三つ目の整数を代入
		int thirdVariable = 41;
		
		// 合計を表示
		System.out.println("合計は" + (firstVariable + secondVariable + thirdVariable) + "です。");
		// 平均を表示
		System.out.println("平均は" + (firstVariable + secondVariable + thirdVariable) / 3 + "です。");

	}

}
