package com.capgemini.movieticket.dao;

import com.capgemini.movieticket.bean.Screen;

public interface IScreenDAO {
	Screen addScreen(Screen obj);
	boolean deleteScreen(int movieId);
	void viewScreen();
}
