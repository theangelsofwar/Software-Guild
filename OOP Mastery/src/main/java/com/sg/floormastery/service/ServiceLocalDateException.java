/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.floormastery.service;

public class ServiceLocalDateException extends Exception{
    
    public ServiceLocalDateException(String message){
        super(message);
    }
    
    public ServiceLocalDateException(String message, Throwable cause){
        super(message, cause);
    }
    
}
