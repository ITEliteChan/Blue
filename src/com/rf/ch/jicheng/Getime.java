package com.rf.ch.jicheng;


public abstract class Getime{
    public final void getTime(){
    long start = System.currentTimeMillis();
        run();
    long end = System.currentTimeMillis();
    System.out.println("运行毫秒："+(end - start));
    }
        public abstract void run();
}

