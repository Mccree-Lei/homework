/**
 * 
 */
package webServiceDemo.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * 【业务编码】：SEI
 * @工程： webServiceDemo
 * @类名： HelloWS
 * @模块： 
 * @作者： 常雷雷
 * @创建日期： 2019年8月12日
 * @修改记录（修改时间、作者、原因）：
 */

@WebService
public interface HelloWS {
    @WebMethod
    public String sayHello(String name);
}
