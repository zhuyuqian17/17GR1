package soso;

import java.util.HashMap;
import java.util.Set;

public class UserPlus {
			
	HashMap<String,Users> hm=new HashMap<String,Users>();
	
	public void addUser(Users u){
		hm.put(u.getCardNum(), u);
	}
	public boolean IsExit(String number){
		Users user=hm.get(number);
		if(user!=null&& ! user.getPassword().equals("")){
			
			return true;
		} 
		return false;
	}
	public boolean IsExit(String number,String password){
		Users user=hm.get(number);
		if(user!=null&& ! user.getPassword().equals(password)){
			
			return true;
		} 
		return false;
	}
	public void findAll(){
		Set<String> keySet = hm.keySet();
		for(String ks:keySet){
			Users users = hm.get(ks);
			users.print();
		}
	}
	
}

