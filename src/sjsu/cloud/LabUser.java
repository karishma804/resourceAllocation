package sjsu.cloud;

/**
 * User entity class contains user info
 * 
 * @author Group 13
 * 
 */
public class LabUser {
	/*
	 * Unique ID for each user
	 */
	private int labUserID;
	//Userinfo stored in JSON format. 
	private String userInfo;

	public int getLabUserID() {
		return labUserID;
	}

	public void setLabUserID(int labUserID) {
		this.labUserID = labUserID;
	}

	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}

}
