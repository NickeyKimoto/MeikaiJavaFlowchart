package Chapter14.pet2;

/*
*クラス名：Pet
*概要：ペットに関する情報を管理するクラス
*作成者：N.Kimoto
*作成日：2024/05/24
*/
class Pet {
	
	// ペットの名前を表すフィールドを宣言
	private String name;
	// 飼い主の名前を表すフィールドを宣言
	private String masterName;
	
	/*
	*コンストラクタ名：Pet
	*概要：フィールドを初期化する
	*引数：ペットの名前(String型)、飼い主の名前(String型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/
	*/
	public Pet(String name, String masterName) {
		
		// ペットの名前を表すフィールドを初期化
		this.name = name;
		// 飼い主の名前を表すフィールドを初期化
		this.masterName = masterName;
		
	}
	
	
	/*
	*関数名：getName
	*概要：ペットの名前を返却
	*引数：なし
	*戻り値：ペットの名前(String型)
	*作成者：N.Kimoto
	*作成日：2024/05/
	*/
	public String getName() { 
		// ペットの名前を返却
		return name;
	}
	

	/*
	*関数名：getMasterName
	*概要：飼い主の名前を返却
	*引数：なし
	*戻り値：飼い主の名前(String型)
	*作成者：N.Kimoto
	*作成日：2024/05/
	*/
	public String getMasterName() { 
		// 飼い主の名前を返却
		return masterName;
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
		// ペットの名前を表示
		System.out.println("■僕の名前は" + name + "です！");
		// 飼い主の名前を表示
		System.out.println("■ご主人様は" + masterName + "です！");
		
	}

}
