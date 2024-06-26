package com.htjs.designpattern.principles.demo3.before;

/**
 * 以来导致原则
 */
public class ComputerDemo {

    public static void main(String[] args) {
        Computer computer = new Computer();
        IntelCpu cpu = new IntelCpu();
        KingstonMemory memory = new KingstonMemory();
        XiJieHardDisk disk = new XiJieHardDisk();
        computer.setCpu(cpu);
        computer.setMemory(memory);
        computer.setDisk(disk);
        computer.run();
    }
}
