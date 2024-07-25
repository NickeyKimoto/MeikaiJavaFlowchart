package Chapter07;

/*
*クラス名：E_07_01
*概要：受け取ったint型引数の値nが負であれば-1、0であれば0、正であれば1を返却する
*作成者：N.Kimoto
*作成日：2024/04/17
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_01 {
	
	/*
	*関数名：sign0f
	*概要：受け取ったint型引数の値nが負であれば-1、0であれば0、正であれば1を返却する
	*引数：n(int型)
	*戻り値：-1, 0, 1
	*作成者：N.Kimoto
	*作成日：2024/04/17
	*/

	static int sign0f(int n) {

		// nが正の場合
		if (n > 0) {

			// 1を返却
			return 1;

		// nが負の場合
		} else if (n < 0) {

			// -1を返却
			return -1;

		// nが0の場合	
		} else {

			// 0を返却
			return 0;

		}

	}
	
	/*
	*関数名：main
	*概要：返却された値がどうなってるか表示を確認する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/17
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		
		// 整数の入力を促す()
		System.out.print("整数：");
		// 入力された値を読み込む
		int integerVariable = standardInput.nextInt();
		
		// 返却値を表示する
		System.out.println("返却する値は" + sign0f(integerVariable) + "です。");

	}

}
