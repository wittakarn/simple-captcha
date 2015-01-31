/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.wittakarn.view;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Wittakarn
 */
@RequestScoped
@ManagedBean(name = "imageBean")
public class ImageBean implements Serializable{
    
    private int random;
    
    public ImageBean(){
        random = (int)Math.floor(Math.random() * 10);
    }
    
    public void setRandom(int random) {
        this.random = random;
    }
    
    public int getRandom(){
        return random;
    }
    
    public void reload(ActionEvent event){
        random = (int)Math.floor(Math.random() * 10);
    }
}
