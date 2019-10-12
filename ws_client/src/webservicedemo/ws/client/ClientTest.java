/**
 * 
 */
package webservicedemo.ws.client;

import webservicedemo.ws.HelloWSImpl;
import webservicedemo.ws.HelloWSImplService;

/**
 * 【业务编码】：调用webservice
 * @工程： ws_client
 * @类名： ClientTest
 * @模块： 
 * @作者： 常雷雷
 * @创建日期： 2019年8月12日
 * @修改记录（修改时间、作者、原因）：
 */
public class ClientTest {
 
    public static void main(String[] args) {
        HelloWSImplService factory = new HelloWSImplService();
        HelloWSImpl helloWSImpl =  factory.getHelloWSImplPort();
        System.out.println(helloWSImpl.getClass());
        
        String result = helloWSImpl.sayHello("jack");
        System.out.println("client " + result);
    }
}
