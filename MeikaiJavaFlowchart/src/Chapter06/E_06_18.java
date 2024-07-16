package Chapter06;

/*
*クラス名：E_06_18
*概要：行数・各行の列数・各要素の値をキーボードから読み込めるList6-18
*作成者：N.Kimoto
*作成日：2024/04/16
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_06_18 {
	
	/*
	*関数名：main
	*概要：行数・各行の列数・各要素の値をキーボードから読み込み、配列を表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/16
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// 行数の入力を促す
		System.out.print("行数：");
		// 入力された値を読み込む
		int lineCount = standardInput.nextInt();
		// 正の整数値以外の値を受け付けないようにする
		while (lineCount <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください:");
			// 入力された値を読み込む
			lineCount = standardInput.nextInt();

		}

		// 入力した値の行・列・要素を持つ行列を生成
		int firstArray[][] = new int[lineCount][];

		// 行数の分だけ、列数とその要素に値を代入
		for (int i = 0; i < lineCount; i++) {

			// 列数の入力を促す
			System.out.println("その行の列数");
			// 表題の表示
			System.out.print("c[" + i + "] = new int[] ←：");

			// 入力された値を読み込む
			int columnCount = standardInput.nextInt();
			// 正の整数値以外の値を受け付けないようにする
			while (columnCount <= 0) {

				// 正の整数値の入力を促す
				System.out.print("正の整数値を入力してください:");
				// 入力された値を読み込む
				columnCount = standardInput.nextInt();

			}

			// 入力された列数の配列に書き換え
			firstArray[i] = new int[columnCount];

			// 列数の分だけ要素に値を入力し代入する
			for (int j = 0; j < columnCount; j++) {

				// 要素の値の入力を促す
				System.out.print("c[" + i + "][" + j + "] = ");

				// 入力された値を読み込む
				int integerVariable = standardInput.nextInt();

				// 入力された値をその要素に代入する
				firstArray[i][j] = integerVariable;

			}

			//改行する
			System.out.println();

		}

		// 行数分の値を表示
		for (int i = 0; i < lineCount; i++) {

			// 列数分の値を表示
			for (int j = 0; j < firstArray[i].length; j++) {

				// その要素の値を表示
				System.out.printf("%4d", firstArray[i][j]);

			}

			// 改行する
			System.out.println();

		}

	}

}
