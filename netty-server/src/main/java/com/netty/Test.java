package com.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.Charset;

/**
 * Created by qinfajia on 2018/6/28.
 */
public class Test {

    public static void main(String[] args) {
        Charset utf8 = Charset.forName("UTF-8");
        ByteBuf buf = Unpooled.copiedBuffer(" Netty in Action rocks!", utf8);
        System.out.println(buf.getBoolean(1));

        ByteBuf intBuf = Unpooled.buffer(100);
        intBuf.writeInt(100);
        intBuf.writeInt(200);
        intBuf.writeInt(300);
        int length = intBuf.readableBytes()/4;
        for(int i=0;i<length;i++){
            System.out.println(intBuf.readInt());
        }
    }
}
