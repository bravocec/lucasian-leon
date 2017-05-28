/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucasian.ejb;

import java.util.List;
import java.util.Map;
import javax.ejb.Remote;

/**
 *
 * @author Alan
 */
@Remote
public interface UsersBusinessBeanRemote {
    
    List<Map<String,String>> businessMethod();
    
}
