package cloud.techstar.imageloader;

import android.content.Context;

import java.io.File;

/**
 * @author Turtuvshin Byambaa
 * Copyright (C) 2018 Techstar, Inc.
 * www.techstar.cloud
 */

public class FileCache {

    private File cacheDir;

    public FileCache(Context context){

        if (android.os.Environment.getExternalStorageState().equals(android.os.Environment.MEDIA_MOUNTED))
            cacheDir=new File(android.os.Environment.getExternalStorageDirectory(),"dir");
        else
            cacheDir=context.getCacheDir();
        if(!cacheDir.exists())
            cacheDir.mkdirs();
    }

    public File getFile(String url){
        String filename=String.valueOf(url.hashCode());
        File f = new File(cacheDir, filename);
        return f;

    }

    public void clear(){
        File[] files=cacheDir.listFiles();
        if(files==null)
            return;
        for(File f:files)
            f.delete();
    }
}