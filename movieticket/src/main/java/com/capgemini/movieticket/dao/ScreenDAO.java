package com.capgemini.movieticket.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.capgemini.movieticket.bean.Screen;
import com.capgemini.movieticket.bean.Show;

public class ScreenDAO implements IScreenDAO {
	Map<Integer,Screen> map = new HashMap<Integer,Screen>();
Screen screenObject=new Screen();
//Show showObject;
	public Screen addScreen(Screen obj) {
		Screen value = null;
		map.put(obj.getScreenId(), obj);
	  
		 value =obj;
		return value;
	}

	public boolean deleteScreen(int screenId) {
		boolean flag = false;
		Screen delete = map.remove( screenId);
		if(delete!=null) {
			flag = true;
		}
   		return flag;
	}

	public void viewScreen() {
Collection<Screen>	col=	map.values();
List<Screen> list = new ArrayList<Screen>(col);

for(Screen view:list) {
	System.out.println(view+" ");
		}
		
		
		
		
	}

	
	

}
