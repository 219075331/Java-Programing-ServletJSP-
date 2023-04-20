package study.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserInfo implements Serializable {

	// デフォルトコンストラクタ
	public UserInfo() {
	}

	// プロパティ
	private String name;
	private String yomi;
	private String zip;
	private String address;
	private String tel;
	private String email;
	

	// アクセッサメソッド
	public String getName() {
		return name;
	}
	public String getYomi() {
		return yomi;
	}
	public String getZip() {
		return zip;
	}
	public String getAddress() {
		return address;
	}
	public String getTel() {
		return tel;
	}
	public String getEmail() {
		return email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setYomi(String yomi) {
		this.yomi = yomi;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
