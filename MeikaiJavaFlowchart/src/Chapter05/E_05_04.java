package Chapter05;

/*
*クラス名：E_05_04
*概要：3つの整数値を読み込んでその合計と平均(実数)を表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/11
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_05_04 {
	
	/*
	*関数名：main
	*概要：3つの整数値を読み込んでその合計と平均(実数)を表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/11
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		
		// 平均値の計算結果をdouble型にするための定数を宣言
		final double REAL_NUMBER = 3.0;

		// プログラムの内容を説明
		System.out.println("整数値x,y,zの合計と平均値を求めます。");

		// 整数値の入力を促す
		System.out.print("整数x：");
		// 入力された整数値を読み込む
		int firstVariable = standardInput.nextInt();
		// 整数値の入力を促す
		System.out.print("整数y：");
		// 入力された整数値を読み込む
		int secondVariable = standardInput.nextInt();
		// 整数値の入力を促す
		System.out.print("整数z：");
		// 入力された整数値を読み込む
		int thirdVariable = standardInput.nextInt();

		// 三つの整数の合計を計算する
		int totalValue = firstVariable + secondVariable + thirdVariable;
		// 三つの整数の平均を実数で計算する
		double averageValue = totalValue / REAL_NUMBER;
		
		// 三つの整数の合計を表示
		System.out.println("整数x,y,zの合計値は" + totalValue + "です。");
		// 三つの整数の平均を実数で表示
		System.out.println("整数x,y,zの平均値は" + averageValue + "です。");
		
		

	}

}
