/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucasian.ejb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author martin
 */
@Stateless(mappedName = "UsersBusinessBean", name = "UsersBusinessBean")
public class UsersBusinessBean implements UsersBusinessBeanRemote {
    
    

    @Override
    public List<Map<String,String>> businessMethod() {       
       List<Map<String,String>> listOfMaps = new ArrayList<>();
       Map<String,String> map = null;
       final int limit = 1000;
        for(int x = 0 ; x < limit ; x++){
            map = new HashMap<>();
            map.put("usuario",x%2==0 ? "Alan"+x : x%6 == 0 ? "Pedro"+x : "Leroy "+x );
            map.put("equipo",x%2==0 ? "Lenovo"+x : x%6 == 0 ? "Mac Pro"+x : "HP "+x );
            map.put("plataforma",x%2==0 ? "Linux"+x : x%6 == 0 ? "WinDOS"+x : "HP UX "+x );
            map.put("edad",x%2==0 ? "45"+x : x%6 == 0 ? "24"+x : "37 "+x );
            map.put("salario",x%2==0 ? "30,000"+x : x%6 == 0 ? "13,899"+x : "32,500 "+x );
            listOfMaps.add(map);
        }
        return listOfMaps;
    }
    
    

}
