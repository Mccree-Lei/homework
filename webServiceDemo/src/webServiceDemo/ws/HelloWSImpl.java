/**
 * 
 */
package webServiceDemo.ws;

import javax.jws.WebService;

/**
 * 【业务编码】：
 * @工程： webServiceDemo
 * @类名： HelloWSImpl
 * @模块： 
 * @作者： 常雷雷
 * @创建日期： 2019年8月12日
 * @修改记录（修改时间、作者、原因）：
 */

@WebService
public class HelloWSImpl implements HelloWS {

    /**
     * 功能逻辑：SEI 的实现
     * 方法名称：sayHello
     * @作者: 常雷雷
     * @创建日期： 2019年8月12日
     * @param name
     * @return
     * @返回值： 
     * @修改记录（修改时间、作者、原因）： 
     */
    @Override
    public String sayHello(String name) {
        System.out.println("server sayhello()" + name );
        return "hello," + name;
    }

}
