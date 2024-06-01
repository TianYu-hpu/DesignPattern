package com.htjs.designpattern.principles.demo3.after;

public class Computer {

   private CPU cpu;
   private Memory memory;
   private HardDisk disk;

    public Computer(CPU cpu, Memory memory, HardDisk disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public void run() {
        System.out.println("CPU型号:" + cpu.getName());
        System.out.println("内存型号型号:" + memory.getName());
        System.out.println("硬盘型号:" + disk.getName());
    }
}
