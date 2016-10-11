namespace java com.meituan.td.service

# 查询指定名字的用户列表
struct Param{
    1: required string name;
}

struct Base{
    1: string deviceId,
    2: optional string ip;
}

struct Student{
    1: i64 uid,
    2: string name,
    3: i32 age,
    4: bool hasWife;
}

struct GetStudentReuqest{
    1:Param param,
    2:Base base;
}

struct GetStudentResponse{
    1: list<Student> students;
}

service StudentService{
    GetStudentResponse getStudentsByName(1:GetStudentReuqest request);
}