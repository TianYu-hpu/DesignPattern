package com.htjs.designpattern.principles.demo3.after;

/**
 * 依赖导致原则
 */
public class ComputerDemo {

    public static void main(String[] args) {
        CPU cpu = new IntelCpu();
        Memory memory = new KingstonMemory();
        HardDisk disk = new XiJieHardDisk();
        Computer computer = new Computer(cpu, memory, disk);
        computer.run();
    }
}
