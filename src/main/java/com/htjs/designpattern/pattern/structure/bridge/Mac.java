package com.htjs.designpattern.pattern.structure.bridge;

public class Mac extends OperatingSystem {

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String filename) {
        System.out.println("MAC 播放视频文件");
        videoFile.decode(filename);
    }
}
