package com.famous.stick.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author pat
 * @version V1.0
 * @date 2018/4/28 下午2:34
 */
public class StickServer {

    public void xx() {
        try {
            ServerSocket server = new ServerSocket(7090);
            Socket clientSocket = server.accept();

            InputStream is = clientSocket.getInputStream();


        } catch (IOException e) {

        }

    }
}
