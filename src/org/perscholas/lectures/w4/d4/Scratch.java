package org.perscholas.lectures.w4.d4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Scratch {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream afile = new FileInputStream("resources/byteoutstream.txt");
        FileChannel inChannel = afile.getChannel();
        System.out.println(inChannel.size());
        int channelSize = (int) inChannel.size();

        ByteBuffer buf = ByteBuffer.allocate(channelSize);
//        ByteBuffer buf2 = new ByteBuffer(48);  // can't do this; ByteBuffer is abstract


        int byteReader = inChannel.read(buf);
//        buf.flip();
        System.out.println(buf.get());
    }

}
