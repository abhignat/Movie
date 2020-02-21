package com.capgemini.movieticket.service;

import com.capgemini.movieticket.bean.Screen;

public interface IScreenService {
	Screen addScreen(Screen obj);
	Boolean deleteScreen(int movieId);
	public void viewScreen();
	

}
