package com.capgemini.movieticket.bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Screen {

	private int screenId;
	private int theatreId;
	private String screenName;
	private int rows;
	private LocalDate movieEndDate;
	public List<Show> showlist=new ArrayList<Show>();
	
	//public List<Show> listOfShows=new ArrayList<Show>();
	
	public static Map<Integer,String> listOfScreens=new HashMap<Integer,String>();
	
	public Screen(int screenId, int theatreId, String screenName, int rows, LocalDate movieEndDate,
			List<Show> showlist) {
		super();
		this.screenId = screenId;
		this.theatreId = theatreId;
		this.screenName = screenName;
		this.rows = rows;
		this.movieEndDate = movieEndDate;
		this.showlist = showlist;
	}




	public Screen() {
	
		
	}

 public List<Show> getShowlist() {
		return showlist;
	}

	

	public void setShowlist(List<Show> showlist) {
		this.showlist = showlist;
	}

	public int getScreenId() {
		
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public LocalDate getMovieEndDate() {
		return movieEndDate;
	}

	public void setMovieEndDate(LocalDate movieEndDate) {
		this.movieEndDate = movieEndDate;
	}

	@Override
	public String toString() {
		return "Screen [ theatreId=" +theatreId+ ", screenName=" + screenName + ", rows="
				+ rows + ", movieEndDate=" + movieEndDate + ", showlist=" + showlist + "]";
	}

	
}



	