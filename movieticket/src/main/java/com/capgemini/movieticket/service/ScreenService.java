package com.capgemini.movieticket.service;

import com.capgemini.movieticket.bean.Screen;
import com.capgemini.movieticket.dao.ScreenDAO;
import com.capgemini.movieticket.exception.InValidIdException;
import com.capgemini.movieticket.exception.InValidNameException;

public class ScreenService implements IScreenService {

	ScreenDAO dao = new ScreenDAO();

	public Screen addScreen(Screen obj) {
		return dao.addScreen(obj);
	}

	public Boolean deleteScreen(int screenId) {
		return dao.deleteScreen(screenId);
	}
	public void viewScreen() {
		dao.viewScreen();
	}
	

	public static boolean isValidScreenId(int screenId,int theatreId) {
		
		
		String id=String.valueOf(screenId);
		
		String id1=String.valueOf(theatreId);
		try {
		if((!id.matches("[0-9]{4}")&& !id1.matches("[2]{1}[0-9]{3}")))
			
		{
			throw new InValidIdException("Invalid ScreenId");
		}
		}catch(InValidIdException e) {
		
		}
		return true;
		
	}

	public static boolean isValidScreenName(String screenName) {
		boolean validScreenName = false;
		validScreenName = screenName.matches("[A-Z][a-z]+");
		if (validScreenName == false) {
			try {
				throw new InValidNameException("InValid ScreenName");
			} catch (InValidNameException e) {
			}
		}
		return validScreenName;

	}

	

	public static boolean screenValidation(Screen obj) {
		boolean flag = false;
		if (isValidScreenId(obj.getScreenId(), obj.getTheatreId()) && isValidScreenName(obj.getScreenName()))
		 {
			flag = true;
		}
		return flag;
	}

}

