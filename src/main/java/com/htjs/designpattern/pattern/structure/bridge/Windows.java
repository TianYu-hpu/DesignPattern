package com.htjs.designpattern.pattern.structure.bridge;

public class Windows extends OperatingSystem {

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String filename) {
        System.out.println("Windows 播放视频文件");
        videoFile.decode(filename);
    }
}
