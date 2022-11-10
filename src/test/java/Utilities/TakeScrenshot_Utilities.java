package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseClass.Baseclass_Amazon;

public class TakeScrenshot_Utilities extends Baseclass_Amazon{
	
	public static String scrname;
	public static String scrpath;
	
	public static String capturescreenshot() throws IOException {
		
		File scrfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Date date = new Date();
		System.out.println("Today's Date ====>" + date);
		scrname = date.toString().replace(":", "_").replace(" ", "_");
		System.out.println("Today's Date ===" + scrname);
		FileUtils.copyFile(scrfile, new File(System.getProperty("user.dir") + "\\ScreenShots\\" + scrname+".png"));
		scrpath = System.getProperty("user.dir") + "\\ScreenShots\\" + scrname+".png";
		return scrpath;
		
	}
}
