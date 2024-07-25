package Chapter07;

/*
*クラス名：E_07_28
*概要：二つの行列の和を求める
*作成者：N.Kimoto
*作成日：2024/04/24
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_28 {
	
	/*
	*関数名：addMatrix
	*概要：二つの行列の和である行列を生成し返却する。
	*引数：行列(int型)
	*戻り値：二つの行列の和の行列
	*作成者：N.Kimoto
	*作成日：2024/04/24
	*/

	static int[][] addMatrix(int[][] x, int[][] y) {

		// 二つの行列の行数と同じ行数を持つ行列を生成
		int[][] addArray = new int[x.length][];

		// 二つの行列のその行に基準をそろえる
		for (int i = 0; i < x.length; i++) {

			// 二つの行列のその行の列数を、生成した行列の同じ行の列数を合わせる
			addArray[i] = new int[x[i].length];

			// その列の値を計算し生成した行列の要素に値を代入する
			for (int j = 0; j < x[i].length; j++) {

				// 二つの行列の要素を加算し生成した行列の該当要素に値を代入
				addArray[i][j] = x[i][j] + y[i][j];

			}

		}

		// 生成した二つの行列の和の行列を返却
		return addArray;

	}

	/*
	*関数名：printMatrix
	*概要：行列の全要素を表示
	*引数：行列(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/24
	*/

	static void printMatrix(int[][] m) {

		// その行列の行を指定
		for (int i = 0; i < m.length; i++) {

			// その行列の列を指定
			for (int j = 0; j < m[i].length; j++) {

				// 指定された行と列にある要素を表示
				System.out.print(m[i][j] + "  ");

			}

			// 次の行に表示
			System.out.println();

		}

	}
	
	/*
	*関数名：main
	*概要：二つの行列の和を求める
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/24
	*/

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		// 一つ目の行列の行数の入力を促す
		System.out.print("行列aの行数：");
		// 入力された値を読み込む
		int firstLine = standardInput.nextInt();

		// 0か負の整数の値を入力された場合
		while (firstLine <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください：");
			// 入力された値を読み込む
			firstLine = standardInput.nextInt();

		}

		// 一つ目の行列の列数の入力を促す
		System.out.print("行列aの列数：");
		// 入力された値を読み込む
		int firstColumn = standardInput.nextInt();

		// 0か負の整数の値を入力された場合
		while (firstColumn <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください：");
			// 入力された値を読み込む
			firstColumn = standardInput.nextInt();

		}

		// 入力された値の行数と列数の行列を生成
		int[][] firstArray = new int[firstLine][firstColumn];

		// 一つ目の行列の行を指定
		for (int i = 0; i < firstLine; i++) {

			// 一つ目の行列の列を指定
			for (int j = 0; j < firstColumn; j++) {

				// 該当する要素に代入する値の入力を促す
				System.out.print("a[" + i + "][" + j + "] = ");
				// 入力された値を読み込む
				firstArray[i][j] = standardInput.nextInt();

			}

		}

		// 二つ目の行列の行数の入力を促す
		System.out.print("行列bの行数：");
		// 入力された値を読み込む
		int secondLine = standardInput.nextInt();

		// 0か負の整数の値を入力された場合
		while (secondLine <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください：");
			// 入力された値を読み込む
			secondLine = standardInput.nextInt();

		}

		// 二つ目の行列の列数の入力を促す
		System.out.print("行列bの列数：");
		// 入力された値を読み込む
		int secondColumn = standardInput.nextInt();

		// 0か負の整数の値を入力された場合
		while (secondColumn <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください：");
			// 入力された値を読み込む
			secondColumn = standardInput.nextInt();

		}

		// 入力された値の行数と列数の行列を生成
		int[][] secondArray = new int[secondLine][secondColumn];

		// 二つ目の行列の行を指定
		for (int i = 0; i < secondLine; i++) {

			// 二つ目の行列の列を指定
			for (int j = 0; j < secondColumn; j++) {

				// 該当する要素に代入する値の入力を促す
				System.out.print("b[" + i + "][" + j + "] = ");
				// 入力された値を読み込む
				secondArray[i][j] = standardInput.nextInt();

			}

		}

		// 二つの行列の和の行列を生成したことを表示
		System.out.println("行列aとbの和である行列cを生成しました。");

		// 一つ目の行列を表示することを表示
		System.out.println("行列a");
		// 一つ目の行列を表示
		printMatrix(firstArray);
		// 二つ目の行列を表示することを表示
		System.out.println("行列b");
		// 二つ目の行列を表示
		printMatrix(secondArray);
		// 和の行列を表示することを表示
		System.out.println("行列c");
		// 和の行列を表示
		printMatrix(addMatrix(firstArray, secondArray));

	}

}
