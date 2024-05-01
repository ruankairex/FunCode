package javaCore;

import java.util.*;
import java.text.*;

public class TimeTransfer {
	public static void main(String[]args) {
		String rowData = "20240430133015";
		timeTransfer(rowData);
	}
	
	public static void timeTransfer(String input) {
		 SimpleDateFormat rowTime = new SimpleDateFormat("yyyyMMddHHmmss");
		 SimpleDateFormat processTime = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
		 try {
			Date rowDate = rowTime.parse(input);
			String processDate = processTime.format(rowDate);
			System.out.println(processDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	

}
