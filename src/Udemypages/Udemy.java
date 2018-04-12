package Udemypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.config;

public class Udemy {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5);
		String str = " ";   // If NO SPACE it will print TRUE
							// If there is SPACE it will print FALSE
		if (sb.toString().equals(str)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
}
}