package org.perscholas.lectures.w4d4.haseebdemo2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioWriteData {
    public static void main(String[] args) throws IOException {
        String[] inputFiles = {"resources/data.txt", "resources/data2.txt"};

        String outputFile = "resources/NioOutput.txt";

        FileOutputStream fos = new FileOutputStream(outputFile);
        FileChannel targetChannel = fos.getChannel();

        for (String inputFile : inputFiles) {
            FileInputStream fis = new FileInputStream(inputFile);
            FileChannel inputchannel = fis.getChannel();
            long size = inputchannel.size();
            ByteBuffer buf = ByteBuffer.allocate((int)size);// -20);
            int numBytesRead = inputchannel.read(buf);
            System.out.println(numBytesRead);
            buf.flip();
            while(buf.hasRemaining()) {
                System.out.println(inputFile);
                targetChannel.write(buf);
            }
            buf.clear();
            inputchannel.close();

        }
        fos.close();
    }


}

