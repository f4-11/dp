package com.test.dp.structural.proxy;

public class UserController {
    private MetricsCollector metricsCollector;

    public UserVo login() {
        return new UserVo();
    }

    public UserVo register() {
        return new UserVo();
    }
}

// 1. 基于接口实现静态代理
// public interface IUserController {
//     UserVo login();
//     UserVo register();
// } UserController implement该接口
// public class UserControllerProxy implements IUserContrller {
//     private MetricsCollector metricscollector;
//     private UserControler userControler;
//     public UserControllerProxy(UserControler userControler) {
//         this.userControler = userControler;
//         this.metricsController = new MetricsController();
//     }
//     ...
// }
// 2. 基于继承实现静态代理 直接调用super的方法，利用多态进行实例化
// 3. 基于反射实现动态代理 批量写代理类成本太大 实现见google
