include "user.thrift"

namespace java com.dapeng.springboot.api.service

service UserService {
    string sayHello(1:string name),

    user.User getUser(1:string id)
}