package com.htjs.designpattern.principles.demo3.before;

public class Computer {

    private IntelCpu cpu;
    private KingstonMemory memory;
    private XiJieHardDisk disk;

    public IntelCpu getCpu() {
        return cpu;
    }

    public void setCpu(IntelCpu cpu) {
        this.cpu = cpu;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory memory) {
        this.memory = memory;
    }

    public XiJieHardDisk getDisk() {
        return disk;
    }

    public void setDisk(XiJieHardDisk disk) {
        this.disk = disk;
    }
    
    public void run() {
        System.out.println("CPU型号:" + cpu.getName());
        System.out.println("内存型号型号:" + memory.getName());
        System.out.println("硬盘型号:" + disk.getName());
    }
}
