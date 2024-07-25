package Chapter07;

/*
*クラス名：E_07_02
*概要：三つのint型引数の最小値を求める
*作成者：N.Kimoto
*作成日：2024/04/17
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_02 {
	
	/*
	*関数名：min
	*概要：int型の引数a, b, cの最小値を返却
	*引数：a, b, c(int型)
	*戻り値：最小値
	*作成者：N.Kimoto
	*作成日：2024/04/17
	*/
	
	public static int min(int a, int b, int c) {
		
		// 最小値をaで初期化
		int minimumValue = a;
		
		// 現在の最小値よりbのほうが小さい場合
		if (b < minimumValue) {
			
			// 最小値をbに初期化
			minimumValue = b;
		}
		
		// 現在の最小値よりcのほうが小さい場合
		if (c < minimumValue) {
			
			// 最小値をcに初期化
			minimumValue = c;
			
		}
		
		// 最小値を返却
		return minimumValue;
		
	}
	
	/*
	*関数名：main
	*概要：三つのint型引数の最小値を求める
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/17
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		
		// 一つ目の整数の入力を促す
		System.out.print("整数a：");
		// 入力された値を読み込む
		int firstVariable = standardInput.nextInt();
		// 二つ目の整数の入力を促す
		System.out.print("整数b：");
		// 入力された値を読み込む
		int secondVariable = standardInput.nextInt();
		// 三つ目の整数の入力を促す
		System.out.print("整数c：");
		// 入力された値を読み込む
		int thirdVariable = standardInput.nextInt();
		
		// 最小値を表示
		System.out.println("最小値は" + min(firstVariable, secondVariable, thirdVariable) + "です。");

	}

}
