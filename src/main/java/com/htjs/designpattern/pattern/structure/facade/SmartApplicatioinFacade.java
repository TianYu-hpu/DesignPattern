package com.htjs.designpattern.pattern.structure.facade;

import java.util.ArrayList;
import java.util.List;

public class SmartApplicatioinFacade {

    List<JiaDian> jiandianList = new ArrayList<JiaDian>();



    public void addJianDian(JiaDian jiaDian) {
        jiandianList.add(jiaDian);
    }

    public void say(String msg) {
        if(msg.contains("打开")) {
            for (JiaDian jiadian : this.jiandianList) {
                jiadian.on();
            }
        } else if(msg.contains("关闭")) {
            for (JiaDian jiadian : this.jiandianList) {
                jiadian.off();
            }
        } else {
            throw new RuntimeException("不支持的操作");
        }
    }
}
