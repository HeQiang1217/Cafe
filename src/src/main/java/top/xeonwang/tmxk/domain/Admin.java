package top.xeonwang.tmxk.domain;

public class Admin
{
	private String AdminId;
	private String AdminName;
	private String AdminPos;
	private String AdminPwd;
	
	public String getAdminId() {
		return this.AdminId;
	}
	public void setUserId(String id) {
		this.AdminId = id;
	}
	public String getAdminName() {
		return this.AdminName;
	}
	public void setUserName(String Name) {
		this.AdminName = Name;
	}
	public String getAdminPos() {
		return this.AdminPos;
	}
	public void setUserPos(String pos) {
		this.AdminPos = pos;
	}
	public String getAdminPwd() {
		return AdminPwd;
	}
	public void setAdminPwd(String adminPwd) {
		AdminPwd = adminPwd;
	}
	
}
