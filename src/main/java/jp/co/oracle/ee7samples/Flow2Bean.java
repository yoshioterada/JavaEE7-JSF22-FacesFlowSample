/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.oracle.ee7samples;

/**
 *
 * @author tyoshio2002
 */
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named
@FlowScoped("flow2")

public class Flow2Bean {
    public String getName() {
        return "basicFlow2";
    }
    public String getReturnValue() {
        return "/return2.xhtml";
    }

    /**
     * Creates a new instance of Flow2Bean
     */
    public Flow2Bean() {
    }
}
