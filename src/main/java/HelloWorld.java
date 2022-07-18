/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {

    @ManagedProperty(value = "#{messageBean}")
    private Message messageBean;

    private String message;

    public HelloWorld() {
        message = "Hello from bean";
    }

    public String getMessage() {
        if (messageBean != null) {
            message = messageBean.getMessage();
        }

        return message;
    }

    public void setMessageBean(Message message) {
        this.messageBean = message;
    }
}
