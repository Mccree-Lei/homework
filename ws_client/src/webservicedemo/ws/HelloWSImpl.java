
package webservicedemo.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWSImpl", targetNamespace = "http://ws.webServiceDemo/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWSImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://ws.webServiceDemo/", className = "webservicedemo.ws.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://ws.webServiceDemo/", className = "webservicedemo.ws.SayHelloResponse")
    @Action(input = "http://ws.webServiceDemo/HelloWSImpl/sayHelloRequest", output = "http://ws.webServiceDemo/HelloWSImpl/sayHelloResponse")
    public String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
