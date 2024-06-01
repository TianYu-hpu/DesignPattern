package com.htjs.designpattern.pattern.create.builder.demo2;

public class Phone {

    private String cpu;
    private String memory;
    private String hardDisk;

    public Phone(Builder builder) {
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.hardDisk = builder.hardDisk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                '}';
    }

    public static class Builder {
        private String cpu;
        private String memory;
        private String hardDisk;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder hardDisk(String hardDisk) {
            this.hardDisk = hardDisk;
            return this;
        }
        public Phone build() {
            return new Phone(this);
        }
    }
}
