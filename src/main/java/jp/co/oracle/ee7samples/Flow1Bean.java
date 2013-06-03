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
@FlowScoped("flow1")
public class Flow1Bean {

    public String getName() {
        return "basicFlow1";
    }

    public String getReturnValue() {
        return "/return1.xhtml";
    }

    /**
     * Creates a new instance of FlowBean
     */
    public Flow1Bean() {
    }
}
