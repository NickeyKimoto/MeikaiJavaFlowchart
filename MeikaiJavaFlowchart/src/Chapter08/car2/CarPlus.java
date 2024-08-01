package Chapter08.car2;

//ランダム関数を利用できるようにする
import java.util.Random;
//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

/*
*クラス名：CarPlus
*概要：車の各データを管理し表示する
*作成者：N.Kimoto
*作成日：2024/04/30
*/

public class CarPlus {
	
	// ランダムクラスのインスタンスを生成
	static Random randomVariable = new Random();
	// Scannerオブジェクトを生成
	static Scanner standardInput = new Scanner(System.in);

	// 名前を表すインスタンス変数を宣言(教本準拠の変数)
	private String name;
	// 自動車メーカーを表すインスタンス変数を宣言
	private String carManufacturer;
	// ナンバープレート番号を表すインスタンス変数を宣言
	private String plateNumber;
	// 車幅を表すインスタンス変数を宣言(教本準拠の変数)
	private int width;
	// 車高を表すインスタンス変数を宣言(教本準拠の変数)
	private int height;
	// 車長を表すインスタンス変数を宣言(教本準拠の変数)
	private int length;
	// 現在位置X座標を表すインスタンス変数を宣言(教本準拠の変数)
	private double x;
	// 現在位置Y座標を表すインスタンス変数を宣言(教本準拠の変数)
	private double y;
	// タンク容量を表すインスタンス変数を宣言
	private double tankCapacity;
	// 残り燃料を表すインスタンス変数を宣言(教本準拠の変数)
	private double fuel;
	// 燃費を表すインスタンス変数を宣言
	private double fuelEfficiency;
	

	/*
	*コンストラクタ名：CarPlus
	*概要：インスタンスの初期化
	*引数：名前(String型)、自動車メーカー名(String型)、プレートナンバー(String型)、車幅(int型)、車高(int型)、
	*車長(int型)、残り燃料(double型)、タンク容量(double型)、燃費(double型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/
	
	CarPlus(String name, String carManufacturer, String plateNumber, int width, int height, 
			int length, double tankCapacity, double fuel, double fuelEfficiency) {
		
		// 名前を表すインスタンス変数を初期化
		this.name = name;
		// 自動車メーカーを表すインスタンス変数を初期化
		this.carManufacturer = carManufacturer;
		// ナンバープレート番号を表すインスタンス変数を初期化
		this.plateNumber = plateNumber;
		// 車幅を表すインスタンス変数を初期化
		this.width = width;
		// 車高を表すインスタンス変数を初期化
		this.height = height;
		// 車長を表すインスタンス変数を初期化
		this.length = length;
		// タンク容量を表すインスタンス変数を初期化
		this.tankCapacity = tankCapacity;
		// 残り燃料を表すインスタンス変数を初期化
		this.fuel = fuel;
		// 燃費を表すインスタンス変数を初期化
		this.fuelEfficiency = fuelEfficiency;
		// 現在位置X,Y座標を表すインスタンス変数を初期化
		x = y = 0.0;
		
	}
	
	// メソッド
	
	/*
	*関数名：getX
	*概要：現在位置のX座標を取得する
	*引数：なし
	*戻り値：現在位置のX座標(double型)
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/
	
	double getX() {
		
		// 現在位置のX座標を返却
		return x;
		
	}
	
	/*
	*関数名：getY
	*概要：現在位置のX座標を取得する
	*引数：なし
	*戻り値：現在位置のY座標(double型)
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/
	
	double getY() {
		
		// 現在位置のY座標を返却
		return y;
		
	}
	
	/*
	*関数名：getFuel
	*概要：現在の残り燃料を取得する
	*引数：なし
	*戻り値：現在の残り燃料(double型)
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/
	
	double getFuel() {
		
		// 現在の残り燃料を返却
		return fuel;
		
	}
	
	/*
	*関数名：putSpec
	*概要：各ステートの表示
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/
	
	void putSpec() {
		
		// 車種を表示
		System.out.println("名前：" + name);
		// 自動車メーカー名を表示
		System.out.println("自動車メーカー名：" + carManufacturer);
		// プレートナンバーを表示
		System.out.println("ナンバープレート：" + plateNumber);
		// 車幅を表示
		System.out.println("車幅：" + width + "mm");
		// 車高を表示
		System.out.println("車高：" + height + "mm");
		// 車長を表示
		System.out.println("車長：" + length + "mm");
		// タンク容量を表示
		System.out.println("タンク容量：" + tankCapacity + "L");
		// 燃費を表示
		System.out.println("燃費：" + fuelEfficiency + "km/L");
		
	}
	
	/*
	*関数名：move
	*概要：車を指定した場所に移動させる
	*引数：x方向の移動距離(double型)、y方向の移動距離(double型)
	*戻り値：移動の可否(boolean型)
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/
	
	boolean move(double dx, double dy) {
		
		// 移動の可否を表す変数を宣言
		boolean judgmentMove = true;
		
		// 移動距離を三平方の定理を用いて求める(distは教本準拠の変数)
		double dist = Math.sqrt(dx * dx + dy * dy);
		
		// 移動距離に対して燃料が足りない場合
		if (dist / fuelEfficiency > fuel) {
			
			// 移動できないため変数をfalseにする
			judgmentMove = false;
			
		// 移動距離に対して燃料が足りる場合
		} else {
			
			// 移動距離の分だけ燃料を消費
			fuel -= dist / fuelEfficiency;
			// x方向の移動距離を加算
			x += dx;
			// y方向の移動距離を加算
			y += dy;

		}
		
		// 移動の可否を返却
		return judgmentMove;
		
	}
	
	/*
	*関数名：moveGasStation
	*概要：車を近くのランダムなガソリンスタンドに移動させる
	*引数：なし
	*戻り値：給油の有無(boolean型)
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/
	
	void moveGasStation() {
		
		// ガソリンスタンドまでの距離の乱数を生成するための定数を宣言
		final double RANDOM_DISTANCE = 1.0;
		
		// ガソリンスタンドまでのx方向の距離をランダムに決定
		double besideDistance = randomVariable.nextDouble(RANDOM_DISTANCE);
		// ガソリンスタンドまでのy方向の距離をランダムに決定
		double verticalDistance = randomVariable.nextDouble(RANDOM_DISTANCE);
		
		// ガソリンスタンドまでの移動距離を三平方の定理を用いて求める
		double distanceGasStation = Math.sqrt(verticalDistance * verticalDistance + besideDistance * besideDistance);
		
		// 移動距離の分だけ燃料を消費
		fuel -= distanceGasStation / fuelEfficiency;
		
		// 移動距離を表示
		System.out.println("ガソリンスタンドまでの移動距離：" + distanceGasStation + "km");
		// 消費燃料を表示
		System.out.println("ガソリン消費量：" + distanceGasStation / fuelEfficiency + "L");
		
		// x方向の移動距離を加算
		x += verticalDistance;
		// y方向の移動距離を加算
		y += besideDistance;
		
	}
	
	/*
	*関数名：supplyOil
	*概要：タンク容量満タンまで給油する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/
	
	void supplyOil() {
		
		// ガソリンの1Lあたりの値段の定数を宣言
		final int GASOLINE_COST = 190;
		
		// 今回給油した分のガソリン代を計算
		double payPrice = (tankCapacity - fuel) * GASOLINE_COST;
		
		// ガソリンを満タンにする
		fuel = tankCapacity;
		
		// 満タンまで給油したことを表示
		System.out.println("満タンまで給油しました。");
		// 今回のガソリン代を表示
		System.out.println("ガソリン代は" + (int)payPrice + "円です。");
		
	}

}
