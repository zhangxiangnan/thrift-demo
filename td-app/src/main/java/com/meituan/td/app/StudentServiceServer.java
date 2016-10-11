package com.meituan.td.app;

import com.meituan.td.service.StudentService;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

/**
 * Created by zhangxiangnan on 16/10/11.
 */
public class StudentServiceServer {

    public static StudentService.Processor processor;

    public static StudentServiceHandler serviceHandler;

    public static void main(String[] args) {
        try {
            // 初始化
            serviceHandler = new StudentServiceHandler();
            processor = new StudentService.Processor(serviceHandler);

            // 启动一个线程执行
            Runnable simpleServerThread = new Runnable() {
                public void run() {
                    startSimpleServer(processor);
                }
            };
            new Thread(simpleServerThread).start();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    /**
     * 创建简单的thrift服务端
     *
     * @param processor
     */
    public static void startSimpleServer(StudentService.Processor processor) {
        try {
            TServerTransport serverTransport = new TServerSocket(9090);
            TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(processor));

            // 使用下面的代码可以创建一个支持多线程的thrift服务端
            // TServer server = new TThreadPoolServer(new TThreadPoolServer.Args(serverTransport).processor(processor));

            System.out.println("启动thrift服务端...");
            server.serve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
