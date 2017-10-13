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
public class Dequeue <T> {
    //Atributos
    DDNode front;
    DDNode rear;
    int size;
    
    //Constructor
    public Dequeue(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }
    
    //Métodos
    private boolean isEmpty() {
        return front == null;
    }

    
    public void enqueueFront(T n){
        DDNode node = new DDNode(n);
         if(isEmpty()){
        front = node;
        rear = node;
        }else{
        node.setNext(front);
        front.setPrevious(node);
        front = node;
        }
    }
    
    
    public void enqueueRear(T n){
        DDNode node = new DDNode(n);
        if(isEmpty()){
        front = node;
        rear = node;
        }else{
        rear.setNext(node);
        node.setPrevious(rear);
        rear = node;
        }
    }
    
    public void dequeueFront(){
        if(isEmpty()){
        }else{
        if(this.size == 1){
        front = rear = null;
        size--;
        }else{
        front.getNext().setPrevious(null);
        front = front.getNext();  }
        }
    }
    
    
    public void dequeueRear(){
       if(isEmpty()){
        }else{
        size--;
        if(this.size == 1){
        front = rear = null;
        }else{
        rear.getPrevious().setNext(null);
        rear = rear.getPrevious();   
            }
        } 
    }
    
    public DDNode getFront(){
        return this.front;
    }
    
    public DDNode getRear(){
        return this.rear;
    }
    
    public void clearQueue(){
        front = rear = null;
        this.size = 0;
    }
    
    public int getSize(){
        return this.size;
    }
}

