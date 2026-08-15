/*Digital Watch Program is a Java program that demonstrates the basic working of a digital watch using classes, objects, instance variables, and methods.

The program stores the watch's brand name, watch type, hours, minutes, and seconds. It provides methods to:

Display the watch details.
Update the hour by 1 hour.
Update the minutes by 5 minutes.
Update the seconds by 5 seconds.
Automatically handle 60-minute and 60-second carry-over.
Handle the 24-hour format by resetting the hour to 0 after 23.

The program creates a DigitalWatch object, assigns values to its properties, calls the update methods, and displays the updated time. */
package com.vcubeprograms;

public class DigitalWatch {
	String brandName;
	String watchType;
	int hr;
	int min;
	int sec;
	void displayWatchDetails() {
		System.out.println("Watch Details");
		System.out.println("-----------------");
		System.out.println("brand: "+brandName);
		System.out.println("Type of watch: "+watchType);
		System.out.println(hr+":"+min+":"+sec);
		System.out.println("**********************************");
		System.out.println();
		
	}
	void updateHour() {
		if(hr>0&&hr<=23) {
			hr+=1;
		}
		else {
			hr=hr%24;
		}
		
		
	}
	void updateMin() {
		if(min>0&&min<=55) {
			min+=5;
			
		}
		else {
			hr+=min/60;
			min=min%60;
		}
	}
	void updateSec()
	{
		if(sec>0&&sec<=55) {
			sec+=5;
		}
		else {
			min+=(sec/60);
			sec=sec%60;
		}
	}
	void displayTime() {
		System.out.println("------------------------------");
		System.out.println("Updated Time");
		System.out.println("Hr:min:sec "+hr+":"+min+":"+sec);
	}

	public static void main(String[] args) {
		DigitalWatch d=new DigitalWatch();
		d.brandName="Rolex";
		d.watchType="Analog watch";
		d.hr=45;
		d.min=89;
		d.sec=199;
		d.displayWatchDetails();
		d.updateHour();
		d.updateMin();
		d.updateSec();
		d.displayTime();
		
	}

}
