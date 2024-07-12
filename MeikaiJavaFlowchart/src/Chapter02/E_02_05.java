package Chapter02;

/*
*クラス名：E_02_05
*概要：読み込んだ二つの実数値の和と平均を求めて表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/04
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_02_05 {
	
	/*
	*関数名：main
	*概要：読み込んだ二つの実数値の和と平均を求めて表示するプログラム
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/04
	*/

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
				
		// 一つ目の実数値の入力を促す
		System.out.print("xの値：");
		// 入力された一つ目の実数値を読み込む
		double firstVariable = standardInput.nextDouble();
				
		// 二つ目の実数値の入力を促す
		System.out.print("yの値：");
		// 入力された二つ目の実数値を読み込む
		double secondVariable = standardInput.nextDouble();
				
		// 入力された実数値の合計を表示
		System.out.println("合計は" + (firstVariable + secondVariable) + "です。");
				
		// 入力された実数値の平均を表示
		System.out.println("平均は" + (firstVariable + secondVariable) / 2 + "です。");

	}

}
