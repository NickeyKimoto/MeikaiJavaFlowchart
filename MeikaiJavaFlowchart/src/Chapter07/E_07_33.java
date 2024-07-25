package Chapter07;

/*
*クラス名：E_07_33
*概要：int型の1次元配列とint型の2次元配列の全要素の値を表示
*作成者：N.Kimoto
*作成日：2024/04/25
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_33 {
	
	/*
	*関数名：putChars
	*概要：指定された数の文字を連続表示する
	*引数：個数(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/17
	*/
	
	static void putChars(char c, int n) {

		// 指定回文字を表示する
		while (n-- > 0) {

			// 文字を表示する
			System.out.print(c);

		}

	}
	
	/*
	*関数名：printArray
	*概要：指定された1次元配列の全要素を表示
	*引数：1次元配列(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/25
	*/

	static void printArray(int[] a) {

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");

		}

	}
	
	/*
	*関数名：printArray
	*概要：指定された2次元配列の全要素を表示
	*引数：2次元配列(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/25
	*/

	static void printArray(int[][] a) {
		
		// 値の桁数を調査するための定数を宣言
		final int RESEARCH_DIGITS = 10;
		// 2次元配列の最大要素数を調べるための定数を宣言
		final int RESEARCH_COLUMN = 1;
		// 空白部分を調整するための定数を宣言
		final int ADJUSTMENT_NUMBER = 1;

		// 2次元配列の列数を初期化
		int maximumLine = a.length;
		// 2次元配列の最大要素数を初期化
		int maximumLength = 0;

		// 2次元配列の凹凸を埋めた行列を生成
		// 2次元配列の最大要素数を行ごとに調査
		for (int i = 0; i < a.length; i++) {

			// その行の要素数を調査
			for (int j = 0; j < a[i].length; j++) {

				// その行の要素数が最大だった場合
				if (maximumLength < j + RESEARCH_COLUMN) {

					// 最大要素数を更新
					maximumLength = j + RESEARCH_COLUMN;

				}

			}

		}

		// 2次元配列の列数と求めた要素数で、凹凸を埋めた行列を生成
		int[][] temporaryArray = new int[maximumLine][maximumLength];
		// その列の要素の最大桁数を初期化
		int[] digits = new int[maximumLength];

		// 生成した行列に値を代入しながら桁数を調査し、その列の最大桁数を調査
		// 生成した行列に2次元配列の各値を代入する
		for (int i = 0; i < a.length; i++) {

			// その行の各要素を調査する
			for (int j = 0; j < a[i].length; j++) {

				// 生成した行列に2次元配列の各値を代入する
				temporaryArray[i][j] = a[i][j];

				// 代入した値の桁数を調べるための変数を初期化
				int dividedTimes = 0;
				
				// その要素の値が負の整数だった場合
				if (a[i][j] < 0) {
					
					// 符号を反転させる
					a[i][j] = -a[i][j];
					
					// 符号を桁数としてカウントする
					dividedTimes++;
					
				}
					
				// 符号を反転しその値が10で割れなくなるまで
				while (a[i][j] > 0) {

					// 10で割る
					a[i][j] /= RESEARCH_DIGITS;
					// 10で割った回数をカウントし、その値が桁数
					dividedTimes++;

				}

				// 最大桁数よりその値の桁数のほうが大きかった場合
				if (digits[j] < dividedTimes) {

					// その列の最大桁数を更新する
					digits[j] = dividedTimes;

				}

			}

		}

		// 生成した行列で2次元配列と重なる要素だけを表示し、最低限の空白を表示
		// その行の要素を順に表示
		for (int i = 0; i < a.length; i++) {

			// 要素を値と空白を表示
			for (int j = 0; j < a[i].length; j++) {

				// 要素の値を表示
				System.out.print(temporaryArray[i][j]);
				
				// その要素の値の桁数を初期化
				int dividedTimes = 0;

				// その要素の値が負の整数だった場合
				if (temporaryArray[i][j] < 0) {
					
					// 符号を反転させる
					temporaryArray[i][j] = -temporaryArray[i][j];
					
					// 符号を桁数としてカウントする
					dividedTimes++;
					
				}
					
				// 符号を反転しその値が10で割れなくなるまで
				while (temporaryArray[i][j] > 0) {

					// 10で割る
					temporaryArray[i][j] /= RESEARCH_DIGITS;
					// 10で割った回数をカウントし、その値が桁数
					dividedTimes++;

				}
				
				// その値とその列の最大桁数から必要最低限の空白の個数を計算し表示
				putChars(' ', digits[j] - dividedTimes + ADJUSTMENT_NUMBER);

			}

			//改行する
			System.out.println();

		}

	}

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		// 配列の要素数の入力を促す
		System.out.print("配列aの要素数：");
		// 入力された値を読み込む
		int elementCount = standardInput.nextInt();

		// 0か負の整数の値を入力された場合
		while (elementCount <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください：");
			// 入力された値を読み込む
			elementCount = standardInput.nextInt();

		}

		// 入力された値の要素数を持つ配列を宣言
		int[] firstArray = new int[elementCount];

		// 配列の要素に順に値を代入
		for (int i = 0; i < elementCount; i++) {

			// 該当する要素に代入する値の入力を促す
			System.out.print("a[" + i + "] = ");
			// 入力された値を読み込む
			firstArray[i] = standardInput.nextInt();

		}

		// 生成した配列の全要素を表示
		printArray(firstArray);
		// 1行空ける
		System.out.println("\n");

		// 二次元配列の行数の入力を促す
		System.out.print("2次元配列bの行数：");
		// 入力された値を読み込む
		int firstLine = standardInput.nextInt();

		// 0か負の整数の値を入力された場合
		while (firstLine <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください：");
			// 入力された値を読み込む
			firstLine = standardInput.nextInt();

		}

		// 入力された値の行数を持つ2次元配列を生成
		int[][] secondArray = new int[firstLine][];

		// その行の要素数の詳細を設定
		for (int i = 0; i < secondArray.length; i++) {

			// その行の要素数の入力を促す
			System.out.print("b[" + i + "]の要素数：");
			// 入力された値を読み込む
			int firstColumn = standardInput.nextInt();

			// 0か負の整数の値を入力された場合
			while (firstColumn <= 0) {

				// 正の整数値の入力を促す
				System.out.print("正の整数値を入力してください：");
				// 入力された値を読み込む
				firstColumn = standardInput.nextInt();

			}

			// その行が持つ要素数を宣言
			secondArray[i] = new int[firstColumn];

			// その行の要素を指定
			for (int j = 0; j < firstColumn; j++) {

				// 該当する要素に代入する値の入力を促す
				System.out.print("b[" + i + "][" + j + "] = ");
				// 入力された値を読み込む
				secondArray[i][j] = standardInput.nextInt();

			}

		}

		// 生成した2次元配列の全要素を表示
		printArray(secondArray);
		//改行する
		System.out.println();

	}

}
