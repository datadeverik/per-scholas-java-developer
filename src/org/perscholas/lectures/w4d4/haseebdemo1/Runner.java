package org.perscholas.lectures.w4d4.haseebdemo1;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Runner {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        // channel

        FileInputStream afile = new FileInputStream("C:\\Users\\PSAdmin\\Downloads\\TestingFolder\\Data.txt");
        // FileInputStream afile1 = new FileInputStream("C:\\Users\\PSAdmin\\Downloads\\TestingFolder\\Data2.txt");

        FileChannel inChannel = afile.getChannel();
        long channelsize = inChannel.size();

        // initialize buffer
        // we can not create instance of abstract class
        ByteBuffer buf = ByteBuffer.allocate((int)channelsize);

        int byteReader =   inChannel.read(buf);
        buf.flip();
        for(int i = 0; i< channelsize; i++)
        {
            System.out.print((char)buf.get());
        }

        inChannel.close();
        afile.close();


//	 while(byteReader != -1 )
//	 {
//
//		 buf.flip(); // make buffer ready for read
//		 // get() used to read data from buffer, read 1 byte at a time
//		 while(buf.hasRemaining())
//		 {
//			 	System.out.print((char)buf.get());
//		 }
//	      buf.clear(); //make buffer ready for writing
//	      byteReader = inChannel.read(buf);
//
//
//	 }


        //String[]  a =  String1.abc();

    }
}