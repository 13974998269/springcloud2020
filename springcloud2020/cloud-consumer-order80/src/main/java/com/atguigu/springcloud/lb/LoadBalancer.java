package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import java.util.List;

/**
 * @Author ZL
 * @Date 2020/5/21 18:15
 * @Version 1.0
 */
public interface LoadBalancer {
    //收集服务器总共有多少台能够提供服务的机器，并放到list里面
    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
