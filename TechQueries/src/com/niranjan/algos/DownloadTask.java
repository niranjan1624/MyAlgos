package com.niranjan.algos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
 
/**
 * Execute file download in a background thread and update the progress.
 * @author www.codejava.net
 *
 */
public class DownloadTask {
    private static final int BUFFER_SIZE = 4096;   
    private String downloadURL;
    private String saveDirectory;
     
    public DownloadTask(String downloadURL, String saveDirectory) {
        this.downloadURL = downloadURL;
        this.saveDirectory = saveDirectory;
    }
     
    /**
     * Executed in background thread
     */
    protected Void doInBackground()  {
    	 try {
             DownloadFile util = new DownloadFile();
             util.downloadFile(downloadURL);
            
             String saveFilePath = saveDirectory + File.separator + util.getFileName();
  
             InputStream inputStream = util.getInputStream();
             // opens an output stream to save into file
             FileOutputStream outputStream = new FileOutputStream(saveFilePath);
  
             byte[] buffer = new byte[BUFFER_SIZE];
             int bytesRead = -1;
         
             while ((bytesRead = inputStream.read(buffer)) != -1) {
                 outputStream.write(buffer, 0, bytesRead);
               
   
             }
  
             outputStream.close();
  
             util.disconnect();
             System.out.println("File downloaded!!");
         } catch (IOException ex) {
             System.out.println("IOException:  " + ex);     
         }
         return null;
    }
 
}