package action;

import com.opensymphony.xwork2.ActionSupport;
import model.User;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import service.UserService;

public class UserAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private String ssn;
	private String password;
	private String type;
	private JSONObject jsonObject = new JSONObject();
	private JSONArray jsonArray = new JSONArray();

	public String login(){
		UserService userService = new UserService();
		User u = new User();
		u.setSsn(ssn);
		u.setPassword(password);
		u.setType(type);
		if(userService.getUser(u)==true){
			jsonObject.put("ssn", ssn);
			jsonObject.put("status", "ok");
		}
		return "jsonObject";
	}
	
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public JSONObject getJsonObject() {
		return jsonObject;
	}
	public void setJsonObject(JSONObject jsonObject) {
		this.jsonObject = jsonObject;
	}
	public JSONArray getJsonArray() {
		return jsonArray;
	}
	public void setJsonArray(JSONArray jsonArray) {
		this.jsonArray = jsonArray;
	}

}
