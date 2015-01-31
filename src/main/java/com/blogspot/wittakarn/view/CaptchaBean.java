/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.wittakarn.view;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Wittakarn
 */
@ViewScoped
@ManagedBean(name = "captchaBean")
public class CaptchaBean implements Serializable{
    private int random;
    private String[] images = {"7334", "N1LLOI3N", "W177akarn", "ExMak8", "UkEaX1", "6557", "rut54", "Fake Captcha", "moL9Yy", "PKHXr"};

    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
    }
    private String matchString;

    public String getMatchString() {
        return matchString;
    }

    public void setMatchString(String matchString) {
        this.matchString = matchString;
    }
    
    public void submit(ActionEvent event){
        boolean isCorrect = false;
        
        System.out.println("matchString/images[random] : " + matchString + "/" + images[random]);
        
        if(matchString.equals(images[random]))
            isCorrect = true;
        
        matchString = null;
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Result", String.valueOf(isCorrect)));
    }
}
