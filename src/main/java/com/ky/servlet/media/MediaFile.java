package com.ky.servlet.media;

import java.io.File;
import java.util.ArrayList;

public class MediaFile {
    public static ArrayList<String> getFiles(String path){
        ArrayList<String> files=new ArrayList<>();
        File file=new File(path);
        if(!file.exists()){
            file.mkdirs();
        }
        File[] f=file.listFiles();
        for(File item:f){
            files.add(item.getName());
        }
        return files;
    }
    public static boolean deleteMedia(String path,String item){
        boolean status=false;
        File file=new File(path+"/"+item);
        if(file.exists()){
            file.delete();
            status=true;
        }
        return status;
    }
}
