package iterator;

import java.util.Vector;

public class HaierTV implements ITelevision {
    private Vector channel;
    public HaierTV() {
        channel = new Vector();
        for(int i=1;i<8;i++) {
            channel.addElement(new Item("channel " + i));
        }
    }
    @Override
    public Iterator createIterator() {
        return new Controller(channel);
    }

//    @Override
//    public Vector getChannels() {
//        return channel;
//    }
}
