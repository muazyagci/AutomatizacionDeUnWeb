package com.Zara.utilities;

public class Utils {
    public static void sleep(int second){
        second*=100;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e){
            System.out.println("Something Went Wrong in BrowserUtils");
        }
    }


}
