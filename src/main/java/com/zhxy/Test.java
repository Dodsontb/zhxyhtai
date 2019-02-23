package com.zhxy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class Test {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\Lenovo\\git\\zhxyhtai\\src\\main\\resources\\mapper");
		File[] files=file.listFiles();
		for (File item : files) {
			BufferedReader bufferedReader=null;
			StringBuffer stringBuffer=new StringBuffer();
	        try {
	        	bufferedReader=new BufferedReader(new FileReader(item));
	            String line = null;
	            while ((line = bufferedReader.readLine()) != null) {
	                if(line.contains("com.zhxy.dao")){
	                      line=line.replace("com.zhxy.dao", "com.zhxy.mapper");
	                }
	                stringBuffer.append(line);
	                stringBuffer.append(System.getProperty("line.separator"));
	            }
	            bufferedReader.close();
	            PrintWriter printWriter=new PrintWriter(item);
	            printWriter.write(stringBuffer.toString().toCharArray());
	            printWriter.flush();
	            printWriter.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		}
        System.out.println("finish");
	}
}
