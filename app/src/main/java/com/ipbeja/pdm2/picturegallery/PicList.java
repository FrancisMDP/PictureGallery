package com.ipbeja.pdm2.picturegallery;

import android.os.Environment;

import java.io.File;

/**
 * Created by Francisco on 16/11/2016.
 */

public class PicList {
    String path = Environment.DIRECTORY_PICTURES;
    String path2 = Environment.DIRECTORY_DCIM;
    File f = new File(path);
    File f2 = new File(path2);
    File[] files = f.listFiles(new ImageFileFilter());
    File[] files2 = f2.listFiles(new ImageFileFilter());


    static String[] picName = {
            "Nova imagem...",
            "1",
            "2",
            "3",
            "4",
            "5",
            "6"
    };
    static String[] picContent = {
            "",
            "161",
            "252",
            "343",
            "434",
            "525",
            "616"
    };
}
