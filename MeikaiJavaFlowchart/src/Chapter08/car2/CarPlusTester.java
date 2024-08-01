package Chapter08.car2;

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

/*
*クラス名：CarPlusTester
*概要：車の各データを管理、表示し、対話的に車を移動させる。
*作成者：N.Kimoto
*作成日：2024/04/30
*/

public class CarPlusTester {
	
	// Scannerオブジェクトを生成
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	*関数名：inputRange
	*概要：入力した値を範囲内の値で入力させる
	*引数：入力された値(int型)
	*戻り値：読み込んだ値(int型)
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/

	static int inputRange(int inputValue) {

		// 範囲内の値の入力を促す
		System.out.print("有効範囲内で入力してください：");
		// 入力された値を読み込む
		inputValue = standardInput.nextInt();
		// 読み込んだ値を返却する
		return inputValue;

	}
	
	/*
	*関数名：inputRange
	*概要：入力した値を範囲内の値で入力させる
	*引数：入力された値(double型)
	*戻り値：読み込んだ値(double型)
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/

	static double inputRange(double inputValue) {

		// 範囲内の値の入力を促す
		System.out.print("有効範囲内で入力してください：");
		// 入力された値を読み込む
		inputValue = standardInput.nextDouble();
		// 読み込んだ値を返却する
		return inputValue;

	}
	
	/*
	*関数名：main
	*概要：入力した車の各データを管理し表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/

	public static void main(String[] args) {
		
		// タンク容量の最低値の定数を宣言
		final double MINIMUM_GASOLINE = 5.0;
		// 移動することを表す定数を宣言
		final int CHOICE_ONE = 1;
		// ガソリンスタンドに移動することを表す定数を宣言
		final int CHOICE_TWO = 2;
		// 給油しないことを表す定数を宣言
		final int CHOICE_THREE = 3;
		// 給油することを表す定数を宣言
		final int CHOICE_FOUR = 4;

		// 車の各データの入力を促す
		System.out.println("車のデータを入力せよ。");

		// 車種の入力を促す
		System.out.print("名前は：");
		// 入力された文字を読み込む(教本準拠の変数)
		String myCarName = standardInput.next();
		// 自動車メーカー名の入力を促す
		System.out.print("自動車メーカーは：");
		// 入力された文字を読み込む
		String carManufacturer = standardInput.next();
		// プレートナンバーの入力を促す
		System.out.print("プレートナンバーは：");
		// 入力された文字を読み込む
		String plateNumber = standardInput.next();
		// 車幅の入力を促す(教本準拠の変数)
		System.out.print("車幅は：");
		// 入力された値を読み込む
		int myCarWidth = standardInput.nextInt();
		// 入力された値が0以下の場合
		while (myCarWidth <= 0) {
			
			// 正の整数値を入力させる
			inputRange(myCarWidth);
			
		}
		// 車高の入力を促す(教本準拠の変数)
		System.out.print("高さは：");
		// 入力された値を読み込む
		int myCarHeight = standardInput.nextInt();
		// 入力された値が0以下の場合
		while (myCarHeight <= 0) {
			
			// 正の整数値を入力させる
			inputRange(myCarHeight);
			
		}
		// 車長の入力を促す(教本準拠の変数)
		System.out.print("長さは：");
		// 入力された値を読み込む
		int myCarLength = standardInput.nextInt();
		// 入力された値が0以下の場合
		while (myCarLength <= 0) {
			
			// 正の整数値を入力させる
			inputRange(myCarLength);
			
		}
		// タンク容量の入力を促す
		System.out.print("タンク容量は：");
		// 入力された値を読み込む
		double tankCapacity = standardInput.nextDouble();
		// 入力された値が5.0未満の場合
		while (tankCapacity < MINIMUM_GASOLINE) {
			
			// 5.0以上の値を入力させる
			tankCapacity = inputRange(tankCapacity);
			
		}
		// ガソリン量の入力を促す
		System.out.print("ガソリン量は：");
		// 入力された値を読み込む
		double remainderFuel = standardInput.nextDouble();
		// 入力された値が5.0未満やタンク容量を超過する場合
		while (tankCapacity < remainderFuel || remainderFuel < MINIMUM_GASOLINE) { 
			
			// 有効範囲内の値を入力させる
			remainderFuel = inputRange(remainderFuel);
			
		}
		// 燃費の入力を促す
		System.out.print("燃費は：");
		// 入力された値を読み込む
		double fuelEfficiency = standardInput.nextDouble();
		// 入力された値が0以下の場合
		while (fuelEfficiency <= 0) {
			
			// 正の整数値を入力させる
			fuelEfficiency = inputRange(fuelEfficiency);
			
		}
		
		// 入力されたデータで初期化
		CarPlus myCar = new CarPlus(myCarName, carManufacturer, plateNumber, myCarWidth, 
				myCarHeight, myCarLength, tankCapacity, remainderFuel, fuelEfficiency);
		
		// 車を移動させる
		OUTER : while (true) {
			
			// 移動させる判断を表す変数を初期化
			int choiceNumber = 0;
			
			// 走行距離と残り燃料を表示
			System.out.println("現在地(" + myCar.getX() + "km, " 
			+ myCar.getY() + "km)・残り燃料 "+ myCar.getFuel() + "L");
			
			// 残り燃料が5.0L未満の場合
			if (myCar.getFuel() < MINIMUM_GASOLINE) {
				
				// 自動で近くのガソリンスタンドまで移動する
				myCar.moveGasStation();
				// 燃料を満タンまで給油する
				myCar.supplyOil();
				// 走行距離と残り燃料を表示する
				continue OUTER;
				
			}
			
			// 移動するかどうか尋ねる
			System.out.print("移動しますか[0…No / 1…Yes / 2…ガソリンスタンド]：");
			// 入力された値を読み込む
			choiceNumber = standardInput.nextInt();
			// 入力された値が有効範囲外の場合
			while (choiceNumber < 0 || choiceNumber > CHOICE_TWO) {
				
				// 有効範囲内の値を入力させる
				choiceNumber = inputRange(choiceNumber);
				
			}
			
			// 0が入力された場合
			if (choiceNumber == 0) {
				
				// 移動せずプログラムを終了する
				break;
			
			// 1が入力された場合
			} else if (choiceNumber == CHOICE_ONE) {
			
				// x方向の移動距離の入力を促す
				System.out.print("X方向の移動距離：");
				// 入力された値を読み込む
				double verticalDistance = standardInput.nextDouble();
				// y方向の移動距離の入力を促す
				System.out.print("Y方向の移動距離：");
				// 入力された値を読み込む
				double besideDistance = standardInput.nextDouble();
				
				// 移動距離に対して消費燃料が不足している場合
				if (!myCar.move(verticalDistance, besideDistance)) {
					
					// 燃料が不足しているため移動できないことを表示
					System.out.println("燃料が不足する恐れがあり移動できません！");
					
				}
				
			// 2が入力された場合
			} else {
				
				// 近くのガソリンスタンドまで移動する
				myCar.moveGasStation();
				
				// 残り燃料が5.0L未満の場合
				if (myCar.getFuel() < MINIMUM_GASOLINE) {
					
					// 燃料を満タンまで給油する
					myCar.supplyOil();
					// 走行距離と残り燃料を表示する
					continue OUTER;
					
				}
				
				// 給油するかどうか尋ねる
				System.out.print("給油しますか[3…No / 4…Yes]：");
				// 入力された値を読み込む
				choiceNumber = standardInput.nextInt();
				// 入力された値が有効範囲外の場合
				while (choiceNumber < CHOICE_THREE || choiceNumber > CHOICE_FOUR) {
					
					//有効範囲内の値を入力させる
					choiceNumber = inputRange(choiceNumber);
					
				}
				
				// 4が入力された場合
				if (choiceNumber == CHOICE_FOUR) {
					
					// 燃料を満タンまで給油する
					myCar.supplyOil();
					
				}
				
				
			}
			
		}

	}

}
