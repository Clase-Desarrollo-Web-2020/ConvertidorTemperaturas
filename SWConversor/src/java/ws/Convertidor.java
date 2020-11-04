/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Emily
 */
@WebService(serviceName = "Convertidor")
public class Convertidor {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "toCelsius")
    public Double toCelsius(@WebParam(name = "valor") Double valor) {
        //TODO write your implementation code here:
        return ((valor - 32) * 5.0) / 9.0;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "toFahrenheit")
    public Double toFahrenheit(@WebParam(name = "valor") Double valor) {
        //TODO write your implementation code here:
        return (valor * 9 / 5) + 32;
    }
}
