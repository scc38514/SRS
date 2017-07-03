package service;

import java.util.List;

import dao.DaoFactory;
import dao.UserDao;
import model.User;

public class UserService {

	private UserDao dao = DaoFactory.createUserDao();
	public boolean getUser(User user) {
		List<User> users = dao.findAllUser();
		for(User u:users){
			if(u.validatePassword(user.getPassword(),user.getType())){
				return true;
			}
		}
		return false;
		
	}
}
