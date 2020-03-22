package test;

import javax.jws.WebMethod;

/**
 * @version v1.0
 * @author: TianXiang
 * @description:
 * @date: 2020/3/17
 */
public interface WebServiceI {

    @WebMethod(exclude=true)
    String helloWord(String name);

    @WebMethod(exclude=true)
    String helloWord2(String name);

}
