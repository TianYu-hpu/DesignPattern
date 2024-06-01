package com.htjs.designpattern.pattern.structure.bridge;

public class Linux extends OperatingSystem {

    public Linux(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String filename) {
        System.out.println("Linux 播放视频文件");
        videoFile.decode(filename);
    }
}
