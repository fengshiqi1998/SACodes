package facade;

public class Computer {
    protected Cpu c = new Cpu();
    protected Mem m = new Mem();
    protected Disk d = new Disk();
    public void start() {
        startCpu();
        startMem();
        startDisk();
    }
    public void stop() {
        stopCpu();
        stopMem();
        stopDisk();
    }
    public void startCpu() {
        c.start();
    }
    public void startMem() {
        m.start();
    }
    public void startDisk() {
        d.start();
    }
    public void stopCpu() {
        c.stop();
    }
    public void stopMem() {
        m.stop();
    }
    public void stopDisk() {
        d.stop();
    }
}
