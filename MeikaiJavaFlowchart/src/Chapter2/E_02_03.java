package Chapter2;

/*
*クラス名：E_02_03
*概要：キーボードから読み込んだ整数値をそのまま表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/04
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_02_03 {
	
	/*
	*関数名：main
	*概要：キーボードから読み込んだ整数値をそのまま表示するプログラム
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/04
	*/

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		
		// 整数値の入力を促す
		System.out.print("整数値：");
		// 入力された整数値を読み込む
		int firstVariable = standardInput.nextInt();
		
		// 入力された整数値を表示
		System.out.println(firstVariable +"と入力しましたね。");

	}

}
