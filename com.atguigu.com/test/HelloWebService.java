package test;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class HelloWebService implements WebServiceI {


    @Override
    public String helloWord(String name) {
        return"Hello: "+name;
    }

    @Override
    public String helloWord2(String name){
        return"Hello: "+name;
    }

    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:8080/helloWord",new HelloWebService());
    }

}