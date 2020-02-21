package com.capgemini.movieticket.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.capgemini.movieticket.bean.Screen;
import com.capgemini.movieticket.bean.Show;
import com.capgemini.movieticket.service.ScreenService;

public class User {
	public static void main(String[] args) {
		ScreenService object = new ScreenService();
		
		
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			
		System.out.println("carryon with the process");
		System.out.println("1.Add Screen");
		System.out.println("2.Delete Screen");
		System.out.println("3.View Screens");
		System.out.println("4.Exit");
		System.out.println("Enter your choice");
		int choice = scan.nextInt();
		switch (choice) {
		
		case 1:Screen obj = new Screen();
		Show showobj = new Show();
		
			System.out.println("Add Screen");
		System.out.println("Enter the Screen Id");
		int screenId= scan.nextInt();
		System.out.println("Enter the Theatre Id");
		int theatreId=scan.nextInt();
		System.out.println("Enter Screen Name");
		String screenName = scan.next();
		scan.nextLine();
		System.out.println("Enter rows");
		int row = scan.nextInt();
		System.out.println("Enter Movie End Date");
		DateTimeFormatter formatdate = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String text = scan.next();
		LocalDate movieEndDate = LocalDate.parse(text, formatdate);
		System.out.println("Enter the showList");
		String showList= scan.next();
		obj.setTheatreId(theatreId);
		obj.setScreenId(screenId);
		obj.setScreenName(screenName);
	    obj.setRows(row);
		obj.setMovieEndDate(movieEndDate);
		showobj.setshowList(showList);
		obj.showlist.add(showobj);
		 

		
		boolean valid = ScreenService.screenValidation(obj);
		if(valid)
		{
			Screen add = object.addScreen(obj);
			
			System.out.println("Screen with Id " + add.getScreenId() + add+" added successfuly");
		}
		else
		{
			System.out.println("can not add Screen");
		}
		 
		break;
			
        case 2:
        	System.out.println("Enter the ScreenId");
        	int screenId1 = scan.nextInt();
			boolean flag = object.deleteScreen(screenId1);
			if(flag == true) {
				System.out.println("Screen with Id " + screenId1 + " Deleted Successfully");
			}
			else
			{
				System.out.println("Screen not Deleted");
			}
			break;
        case 3:
        	
        	System.out.println("Available Screen");
        	object.viewScreen();
            break;
		default:
			System.out.println("Invalid choice");
			break;
		}
	}
		
	}
}


