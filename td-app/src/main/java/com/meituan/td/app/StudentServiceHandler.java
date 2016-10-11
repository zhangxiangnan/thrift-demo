package com.meituan.td.app;

import com.meituan.td.service.GetStudentResponse;
import com.meituan.td.service.GetStudentReuqest;
import com.meituan.td.service.Student;
import com.meituan.td.service.StudentService;
import org.apache.thrift.TException;

import java.util.ArrayList;

/**
 * Created by zhangxiangnan on 16/10/11.
 */
public class StudentServiceHandler implements StudentService.Iface {

    public GetStudentResponse getStudentsByName(GetStudentReuqest request) throws TException {
        GetStudentResponse response = new GetStudentResponse();

        // 中间可以是调service层的服务去查询数据库或者缓存等
        Student student = new Student();
        student.setAge(1);
        student.setName(request.getParam().getName());
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student);

        response.setStudents(new ArrayList<Student>(students));
        return response;
    }
}
