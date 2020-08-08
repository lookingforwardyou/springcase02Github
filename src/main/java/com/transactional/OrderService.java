package com.transactional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    //事务的传播性，在这个方法中的就说明已经绑定好事务了
    //可以设置事务的传播行为和隔离级别
    @Transactional(propagation=Propagation.REQUIRES_NEW,isolation = Isolation.READ_COMMITTED)
    public boolean addOrder(){

        //查询AspectJ切入点表达式以及作业的log4j
        return true;
    }
}
