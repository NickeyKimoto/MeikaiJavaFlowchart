package Chapter13.person;

/**
*クラス名：PersonPlus 概要：人の名前・身長・体重の情報を管理し、表示する
*@author N.Kimoto
*/
public class PersonPlus {
	
	/**
	*フィールド名：personName 概要：名前を表すフィールド(String型)
	*@author N.Kimoto
	*/
	private String personName;
	
	/**
	*フィールド名：personHeight 概要：身長を表すフィールド(double型)
	*@author N.Kimoto
	*/
	private double personHeight;
	
	/**
	*フィールド名：personWeight 概要：体重を表すフィールド(double型)
	*@author N.Kimoto
	*/
	private double personWeight;
	
	/**
	*コンストラクタ名：PersonPlus 概要：インスタンスの初期化
	*@param personName   名前(String型)
	*@param personHeight 身長(double型)
	*@param personWeight 体重(double型)
	*@author N.Kimoto
	*/
	PersonPlus(String personName, double personHeight, double personWeight) {
		
		// 名前を表すインスタンス変数を初期化
		this.personName = personName;
		// 身長を表すインスタンス変数を初期化
		this.personHeight = personHeight;
		// 体重を表すインスタンス変数を初期化
		this.personWeight = personWeight;
		
	}
	
	/**
	*関数名：getPersonName 概要：名前を表すフィールドの値を取得
	*@return personName 名前(String型)
	*@author N.Kimoto
	*/
	String getPersonName() {
		
		// 名前を表すフィールドの値を返却
		return personName;
		
	}
	
	/**
	*関数名：getPersonHeight 概要：身長を表すフィールドの値を取得
	*@return personHeight 身長(double型)
	*@author N.Kimoto
	*/
	double getPersonHeight() {
		
		// 身長を表すフィールドの値を返却
		return personHeight;
		
	}
	
	/**
	*関数名：getPersonWeigh 概要：体重を表すフィールドの値を取得
	*@return personWeight 体重(double型)
	*@author N.Kimoto
	*/
	double getPersonWeigh() {
		
		// 体重を表すフィールドの値を返却
		return personWeight;
		
	}
	
	/**
	*関数名：putSpec 概要：各ステートの表示
	*@author N.Kimoto
	*/
	public void putSpec() {
		
		// 名前を表示
		System.out.println("名前：" + personName);
		// 身長を表示
		System.out.println("身長：" + personHeight);
		// 体重を表示
		System.out.println("体重：" + personWeight);
		
	}

}
