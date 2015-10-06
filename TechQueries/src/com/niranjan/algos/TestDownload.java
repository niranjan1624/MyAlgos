package com.niranjan.algos;

public class TestDownload {
	 public static void main(String[] args){
		 DownloadTask task = new DownloadTask("http://www.java2s.com/Code/JarDownload/activemq-http/activemq-http-5.8.0-sources.jar.zip", "C:\\Users\\Niranjan\\Downloads");
		 task.doInBackground();
	 }
}
