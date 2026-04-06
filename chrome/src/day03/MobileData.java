package day03;

import java.util.Scanner;

public class MobileData {

	public static void main(String[] args) {
		
		int dataUsedMB=1536;
		float totalGB=2;
		float totalMB=totalGB*1024;
		
		 float usage = (dataUsedMB / (totalMB)) * 100;
		 System.out.println(usage+"%");
	}

}
