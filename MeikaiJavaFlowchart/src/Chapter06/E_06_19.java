package Chapter06;

/*
*クラス名：E_06_19
*概要：クラス数・各クラスの人数・全員の点数を読み込み、点数の合計点と平均点を求めるプログラム
*(合計点と平均点はクラスごとのものと、全体のものを表示)
*作成者：N.Kimoto
*作成日：2024/04/16
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_06_19 {
	
	/*
	*関数名：main
	*概要：クラス数・各クラスの人数・全員の点数を読み込み、点数の合計点と平均点を求める
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/16
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// 指定された表記にするための定数を宣言
		final int ADJUSTMENT_NUMBER = 1;

		// クラスごとの人数を初期化
		int studentNumber = 0;

		// クラス数の入力を促す
		System.out.print("クラス数：");
		// 入力された値を読み込む
		int classCount = standardInput.nextInt();
		// 正の整数値以外の値を受け付けないようにする
		while (classCount <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください:");
			// 入力された値を読み込む
			classCount = standardInput.nextInt();

		}

		// クラスごとの合計点の配列を生成
		int classSum[] = new int[classCount];

		// 入力した値の行・列・要素を持つ行列を生成
		int firstArray[][] = new int[classCount][];

		// クラス数の分だけクラスの人数と生徒の点数を入力する
		for (int i = 0; i < classCount; i++) {

			// そのクラスの合計点を初期化
			int pointSum = 0;

			// クラスの人数の入力を促す
			System.out.print((i + ADJUSTMENT_NUMBER) + "組の人数：");
			// 入力された値を読み込む
			studentNumber = standardInput.nextInt();
			// 正の整数値以外の値を受け付けないようにする
			while (studentNumber <= 0) {

				// 正の整数値の入力を促す
				System.out.print("正の整数値を入力してください:");
				// 入力された値を読み込む
				studentNumber = standardInput.nextInt();

			}

			// 入力された生徒数の行列に書き換え
			firstArray[i] = new int[studentNumber];

			// 生徒数の分だけ、点数を入力
			for (int j = 0; j < studentNumber; j++) {

				// 点数の入力を促す
				System.out.print((i + ADJUSTMENT_NUMBER) + "組" + (j + ADJUSTMENT_NUMBER) + "番の点数：");
				// 入力された値を読み込む
				int scoreValue = standardInput.nextInt();
				// 0か正の整数値以外の値を受け付けないようにする
				while (scoreValue < 0) {

					// 0か正の整数値の入力を促す
					System.out.print("0か正の整数値を入力してください:");
					// 入力された値を読み込む
					scoreValue = standardInput.nextInt();

				}

				// 入力された点数を各要素に代入
				firstArray[i][j] = scoreValue;

				// 入力された値をクラスごとの合計に加算
				pointSum += scoreValue;

			}

			// クラスごとの合計点の配列にそのクラスの合計点を代入
			classSum[i] = pointSum;

		}

		// 表題の表記
		System.out.println("  組 |  合計   平均");
		// 表題の表記
		System.out.println("-----+-------------");

		// それぞれのクラスの合計点の総合点を初期化
		int allSum = 0;

		// クラス数分の値を表示
		for (int k = 0; k < classCount; k++) {

			// 表題の表記
			System.out.print(" " + (k + ADJUSTMENT_NUMBER) + "組 |" + " ");
			// そのクラスの合計点を表示
			System.out.printf("%5d", classSum[k]);
			// 表題の表記
			System.out.print("  ");
			// そのクラスの平均点を計算して表示
			System.out.printf("%5.1f", (double) classSum[k] / studentNumber);

			// 改行する
			System.out.println();

			// 総合点にそのクラスの合計点を加算
			allSum += classSum[k];

		}

		// 表題の表記
		System.out.println("-----+--------------");
		// 表題の表記
		System.out.print("  計 | ");
		// 全体の総合点を表示
		System.out.printf("%5d", allSum);
		// 表題の表記
		System.out.print("  ");
		// 全体の平均点を計算して表示
		System.out.printf("%5.1f", (double) allSum / (classCount * studentNumber));

	}

}
