package com.capgemini.movieticket.bean;

public class Show {

	private String showList;

	public String getshowList() {
		return showList;
	}

	public void setshowList(String showList) {
		this.showList = showList;
	}

	@Override
	public String toString() {
		return showList ;
	}
}
