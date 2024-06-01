package com.htjs.designpattern.pattern.structure.bridge;

public class RMWBVideoFile implements VideoFile {
    public void decode(String filename) {
        System.out.println("RMVB 格式解码:" + filename);
    }
}
