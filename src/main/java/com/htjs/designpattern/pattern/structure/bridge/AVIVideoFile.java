package com.htjs.designpattern.pattern.structure.bridge;

public class AVIVideoFile implements VideoFile {
    public void decode(String filename) {
        System.out.println("AVI 格式解码:" + filename);
    }
}
