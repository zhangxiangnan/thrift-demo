package com.meituan.td.client;

import com.meituan.td.service.*;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

/**
 * 客户端
 * Created by zhangxiangnan on 16/10/11.
 */
public class StudentServiceClient {
    public static void main(String[] args) {
        try {
            TTransport transport;
            transport = new TSocket("localhost", 9090);
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);// 二进制传输
            StudentService.Client client = new StudentService.Client(protocol);

            invoke(client);// 调用例子

            transport.close();
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    private static void invoke(StudentService.Client client) throws TException {
        GetStudentReuqest request = new GetStudentReuqest();
        request.setBase(new Base());

        Param param = new Param();
        param.setName("zxn");
        request.setParam(param);

        System.out.println("getStudentsByName()");
        GetStudentResponse response = client.getStudentsByName(request);// 发起调用
        System.out.println("result=" + response);
    }
}
