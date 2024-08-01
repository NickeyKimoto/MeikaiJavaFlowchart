package Chapter14.pet2;

/*
*クラス名：RobotPet
*概要：ロボットペットに関する機能を追加するクラス
*作成者：N.Kimoto
*作成日：2024/05/24
*/
class RobotPet extends Pet implements Housework, Skinnable{
	
	/*
	*コンストラクタ名：RobotPet
	*概要：フィールドを初期化する
	*引数：ロボットペットの名前(String型)、主人の名前(String型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/24
	*/
	public RobotPet(String name, String masterName) {
		
		// ロボットペットの名前と主人の名前を表すフィールドを初期化
		super(name, masterName);
		
	}
	
	/*
	*関数名：introduce
	*概要：自己紹介する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/24
	*/
	public void introduce() {
		
		// ロボットペット自身の名前を表示
		System.out.println("◇私はロボット。名前は" + getName() + "。");
		// 主人の名前を表示
		System.out.println("◇ご主人様は" + getMasterName() + "。");
		
	}
	
	/*
	*関数名：doHousework
	*概要：家事をする
	*引数：家事を表す数値(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/24
	*/
	public void doHousework(int numberOfHousework) {
		// 引数によって行う家事を決定する
		switch (numberOfHousework) {
		// 掃除を行う場合
		case doClean : 
			// 掃除することを表示
			System.out.println("掃除します。");
			// 掃除を終了する
			break;
		// 洗濯を行う場合
		case doLaundry :
			// 洗濯することを表示
			System.out.println("洗濯します。");
			// 洗濯を終了する
			break;
		// 料理を行う場合
		case doCook :
			// 料理することを表示
			System.out.println("炊事します。"); 
			// 料理を終了する
			break;
		}
		
	}
	
	/*
	*関数名：changeSkin
	*概要：スキンを変更する
	*引数：スキンの色を表す数値(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/24
	*/
	public void changeSkin(int skin) {
		// スキンを変えることを表示
		System.out.print("スキンを");
		// 引数によってスキンの色を決定する
		switch (skin) {
		// 漆黒に決定する場合
		case BLACK:
			// 変更先の色の名前を表示
			System.out.print("漆黒"); 
			// 変更を完了
			break;
		// 深紅に決定する場合
		case RED:
			// 変更先の色の名前を表示
			System.out.print("深紅");
			// 変更を完了
			break;
		// 柳葉に決定する場合
		case GREEN:
			// 変更先の色の名前を表示
			System.out.print("柳葉");
			// 変更を完了
			break;
		// 露草に決定する場合
		case BLUE:
			// 変更先の色の名前を表示
			System.out.print("露草");
			// 変更を完了
			break;
		// 豹柄に決定する場合
		case LEOPARD:
			// 変更先の色の名前を表示
			System.out.print("豹柄");
			// 変更を完了
			break;
		// 無地に決定する場合
		default :
			// 変更先の色の名前を表示
			System.out.print("無地");
			// 変更を完了
			break;
		}
		// 変更を完了したことを表示
		System.out.println("に変更しました。");
		
	}
	
}
