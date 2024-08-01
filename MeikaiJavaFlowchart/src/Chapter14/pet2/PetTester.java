package Chapter14.pet2;

// Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class PetTester {
	
	// Scannerオブジェクトを生成
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	*関数名：inputRange
	*概要：入力した値を範囲内の値で入力させる
	*引数：なし
	*戻り値：入力された値(int型)
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/
	
	static int inputRange() {

		// 範囲内の値の入力を促す
		System.out.print("有効範囲内で入力してください：");
		// 入力された値を読み込む
		int inputValue = standardInput.nextInt();
		// 読み込んだ値を返却する
		return inputValue;
	
	}

	public static void main(String[] args) {

		// 情報を入力するペットの匹数の入力を促す
		System.out.print("ペットは何匹：");
		// 入力された値を読み込む
		int numberOfShapes = standardInput.nextInt();
		// 入力された値が0以下の場合
		while (numberOfShapes <= 0) {
			
			// 1以上の値を入力させる
			numberOfShapes = inputRange();
			
		}
		
		// ペットの情報を格納した配列を宣言
		Pet[] petInformation = new Pet[numberOfShapes];
		
		// ペットの種類数の最大値を表す定数を宣言
		final int MAXIMUM_NUMBER_OF_PET_TYPES = 2;
		// ペットの種類数分の要素数を持つ配列を宣言
		final int[] NUMBER_OF_PET_TYPES = new int[MAXIMUM_NUMBER_OF_PET_TYPES];
		// それぞれの要素にペットの種類を区別する値を代入
		for (int i = 0; i < NUMBER_OF_PET_TYPES.length; i++) {
			
			// ペットの種類を区別する値を表す変数を宣言
			NUMBER_OF_PET_TYPES[i] = i;
			
		}
		
		// 何匹目のペットであるかを表す変数を宣言
		int petNumber = 0;
		
		// ペットの情報を入力させる
		for (int i = 0; i < petInformation.length; i++) {

			// ペットの種類の入力を促す
			System.out.print(++petNumber + "匹目のペットの種類(0…動物／1…ロボット)：");
			// 入力された値を読み込む
			int petType = standardInput.nextInt();
			// 入力された値がペットの種類を区別する値の範囲外の場合
			while (petType < NUMBER_OF_PET_TYPES[0] || petType >=  NUMBER_OF_PET_TYPES.length) {
				
				// 範囲内の値を入力させる
				petType = inputRange();
				
			}
			
			// 0が入力された場合
			if (petType == NUMBER_OF_PET_TYPES[0]) {
				
				// ペットの名前の入力を促す
				System.out.print("ペットの名前：");
				// 入力された文字列を読み込む
				String livingPetsName = standardInput.next();
				
				// 飼い主の名前の入力を促す
				System.out.print("飼い主の名前：");
				// 入力された値を読み込む
				String ownerName = standardInput.next();
				
				// ペットの情報に各名前の情報を追加する
				petInformation[i] = new Pet(livingPetsName,ownerName);
				
			// 1が入力された場合
			} else if (petType == NUMBER_OF_PET_TYPES[1]) {
				
				// ロボットペットの名前の入力を促す
				System.out.print("ペットの名前：");
				// 入力された文字列を読み込む
				String robotPetsName = standardInput.next();
				
				// マスターの入力を促す
				System.out.print("マスターの名前：");
				// 入力された値を読み込む
				String masterName = standardInput.next();
				// ペットの情報に各名前の情報を追加する
				petInformation[i] = new RobotPet(robotPetsName,masterName);
				
			}
			
		}
		// ペットの情報を表示する
		for (Pet r : petInformation) {
			
			// 自己紹介する
			r.introduce();
			// このペットがロボットペットだった場合
			if (r instanceof RobotPet) {
				// 選択できる家事を表す数値の最大値を表す定数を宣言
				final int MAXIMUM_CAN_CHOOSE_NUMBER_OF_HOUSEWORK = 2;
				// 行わせる家事の入力を促す
				System.out.print("家事をします。\n仕事を選んでください：[0…掃除／1…洗濯／2…炊事]：");
				// 入力された値を読み込む
				int doHousework = standardInput.nextInt();
				// 入力された値が選択できる家事を表す数値の範囲外の場合
				while (doHousework < 0 || doHousework >  MAXIMUM_CAN_CHOOSE_NUMBER_OF_HOUSEWORK) {
					// 範囲内の値を入力させる
					doHousework = inputRange();
				}
				// 家事を行う
				((RobotPet)r).doHousework(doHousework);
				
				// スキンの変更をしないことを表す定数を宣言
				final int NO_CHANGE_SKIN = 0;
				// スキンの変更をすることを表す定数を宣言
				final int DO_CHANGE_SKIN = 1;
				// スキンの変更を行うかどうかの選択を促す
				System.out.print("スキンを変更しますか？：[0…NO／1…YES]：");
				// 入力された値を読み込む
				int chooseChangeSkin = standardInput.nextInt();
				// 入力された値が範囲外の場合
				while (chooseChangeSkin != NO_CHANGE_SKIN && chooseChangeSkin !=  DO_CHANGE_SKIN) {
					// 範囲内の値を入力させる
					chooseChangeSkin = inputRange();
				}
				
				if (chooseChangeSkin == DO_CHANGE_SKIN) {
					// 変更するスキンの色の入力を促す
					System.out.print("スキンの色を選んでください：[0…漆黒／1…深紅／2…柳葉／3…露草／4…豹柄／それ以外の値…無地]：");
					// 入力された値を読み込む
					int skinColor = standardInput.nextInt();
					// スキンを変更する
					((RobotPet)r).changeSkin(skinColor);
				}
				
			}
			
		}

	}

}
