/**
 * 
 */
package webServiceDemo.server;

import javax.xml.ws.Endpoint;

import webServiceDemo.ws.HelloWSImpl;

/**
 * 【业务编码】：发布 webservice
 * @工程： webServiceDemo
 * @类名： ServerTest
 * @模块： 
 * @作者： 常雷雷
 * @创建日期： 2019年8月12日
 * @修改记录（修改时间、作者、原因）：
 */
public class ServerTest {
    
    public static void main(String[] args) {
        String address = "http://localhost:8000/webServiceDemo/hellows";
        Endpoint.publish(address, new HelloWSImpl());
        System.out.println("webService 发布成功！");
    }
}
