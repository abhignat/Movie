package com.capgemini.movieticket.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.movieticket.bean.Screen;
import com.capgemini.movieticket.bean.Show;
import com.capgemini.movieticket.dao.ScreenDAO;

public class MovieTest {

	ScreenDAO dao=null;
	Show show  = new Show();
	List<Show> list=new ArrayList<Show>();
	
	Screen screen1=new Screen(1235,2568,"movie",5,LocalDate.of(2014,02,2),list);
	
	
	@Before
	public void addScreen() {
		
		dao=new ScreenDAO();
		
	}
	
	@Test
	 public void testaddScreen() 
	{
		
		Screen screen =dao.addScreen(screen1);
		assertEquals(screen1.getScreenId(),screen.getScreenId());
		
	

	}
	
	@Test
	public void testaddScreen1()
	{
		Screen name=dao.addScreen(screen1) ;
		assertEquals(screen1.getScreenName(),name.getScreenName());
	}
	
	@Test
	public void testdeleteScreen() {
		
		Boolean id=dao.deleteScreen(1235);
		assertEquals(screen1.getScreenId(),1235);
	}

}
