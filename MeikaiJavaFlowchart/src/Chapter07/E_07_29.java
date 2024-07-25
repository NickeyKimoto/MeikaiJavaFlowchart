package Chapter07;

/*
*クラス名：E_07_29
*概要：指定した2次元配列と同じ配列を生成する
*作成者：N.Kimoto
*作成日：2024/04/24
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_29 {
	
	/*
	*関数名：arrayClone2
	*概要：指定した2次元配列と同じ配列を生成し返却する。
	*引数：2次元配列(int型)
	*戻り値：同じ要素数で同じ値の2次元配列(int型)
	*作成者：N.Kimoto
	*作成日：2024/04/24
	*/

	static int[][] arrayClone2(int[][] a) {

		// 指定された2次元配列の行数と同じ行数を持つ2次元配列を生成
		int[][] cloneArray = new int[a.length][];

		// 指定された2次元配列のその行に基準をそろえる
		for (int i = 0; i < a.length; i++) {

			// 指定された2次元配列のその行の要素数を、生成した2次元配列の同じ行に要素数を合わせる
			cloneArray[i] = new int[a[i].length];

			// 指定された2次元配列の要素と同じ値を該当する要素に代入
			for (int j = 0; j < a[i].length; j++) {

				// 指定された2次元配列の要素と同じ値を生成した2次元配列の該当要素に値を代入
				cloneArray[i][j] = a[i][j];

			}

		}

		// 生成した2次元配列を返却
		return cloneArray;

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
	*概要：指定した2次元配列と同じ配列を生成する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/24
	*/

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		// 一つ目の行列の行数の入力を促す
		System.out.print("2次元配列aの行数：");
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
		int[][] firstArray = new int[firstLine][];

		// その行の要素数の詳細を設定
		for (int i = 0; i < firstArray.length; i++) {
		
			// その行の要素数の入力を促す
			System.out.print("a[" + i + "]の要素数：");
			// 入力された値を読み込む
			int firstColumn = standardInput.nextInt();
	
			// 0か負の整数の値を入力された場合
			while (firstColumn <= 0) {
	
				// 正の整数値の入力を促す
				System.out.print("正の整数値を入力してください：");
				// 入力された値を読み込む
				firstColumn = standardInput.nextInt();
	
			}
			
			// その行が持つ要素数
			firstArray[i] = new int[firstColumn];
			
			// その行の要素を指定
			for (int j = 0; j < firstColumn; j++) {

				// 該当する要素に代入する値の入力を促す
				System.out.print("a[" + i + "][" + j + "] = ");
				// 入力された値を読み込む
				firstArray[i][j] = standardInput.nextInt();

			}
			
		}

		// 指定した2次元配列と同じ配列を生成したことを表示
		System.out.println("2次元配列aを複製しました。");

		// 指定した2次元配列を表示することを表示
		System.out.println("2次元配列a");
		// 指定した2次元配列を表示
		printMatrix(firstArray);
		// 指定した2次元配列と同じ配列を表示することを表示
		System.out.println("行列b");
		// 指定した2次元配列と同じ配列を表示
		printMatrix(arrayClone2(firstArray));

	}

}
