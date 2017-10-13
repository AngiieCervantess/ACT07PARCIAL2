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
public class queue<T> {

    private Node front;
    private Node rear;
    private int size;

    public queue() {
    this.front = null;
    this.rear = null;
    this.size = 0;
    }
    
     public void enqueue(T d){
        Node node = new Node(d);
        if(isEmpty()){
            front=rear=node;
            size=1;
        } else {
            rear.next=node;
            rear=node;
            size++;
        }
    }
    
    public T dequeue(T d){
        if(isEmpty()){
            return null;
        } else {
            Node fd = front;
            front = front.next;
            size--;
            return (T) fd.data;
        }
    }
    
    public Object getFront() {
        if(isEmpty()){
            return null;
        } else {
        return front.getData();
    }
    }
    
     public int getSize() {
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    
    public void clearQueue(){
        front=rear=null;
        size=0;
    }
}
    
    
    
    
 