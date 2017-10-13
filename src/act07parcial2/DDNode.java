/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act07parcial2;

/**
 *
 * @author Familia Andrade
 * @param <T>
 */

public class DDNode <T> {
    T data;
    DDNode next;
    DDNode previous;
    /*
    Constructor
    */
    public DDNode(T data){
        this.data = data;
        this.next = null;
        this.previous = null;
    }
    
     //Métodos
    
    public void setData(T data){
        this.data = data;
    }
    public T getData(){
        return this.data;
    }
    public void setNext(DDNode n){
        this.next = n;
    }
    public DDNode getNext(){
        return this.next;
    }

    public DDNode getPrevious() {
        return previous;
    }

    public void setPrevious(DDNode previous) {
        this.previous = previous;
    }
}

