// You are implementing a network message system, which needs a priority queue for 
// sending messages based on priority levels. Develop and test a Java program that 
// implements PriorityQueue to store messages and sorts them based on priority, 
// and a method that sends messages in the order of priority. 

import java.util.PriorityQueue;
import java.util.Queue;

class Message{
    private String content;
    private int priority;

    public Message(String content, int priority){
        this.content = content;
        this.priority = priority;
    }

    public String getMessage(){
        return this.content;
    }

    public int getPriority(){
        return this.priority;
    }

    public void setMessage(String content){
        this.content = content;
    }

    public void setPriority(int priority){
        this.priority = priority;
    }

    @Override
    public String toString(){
        return "Message: " + this.content + "\nPriority: " + this.priority;
    }
}

class MessageSender{
    private Queue<Message> messages;

    public MessageSender(){
        this.messages = new PriorityQueue<Message>((m1,m2)->m1.getPriority()-m2.getPriority());
    }

    public void addMessage(String content, int priority){
        Message message = new Message(content, priority);
        this.messages.add(message);
    }

    public void sendMessage(){
        while(!this.messages.isEmpty()){
            System.out.println(this.messages.poll());
        }
    }
}

public class Network{
    public static void main(String[] args){
        MessageSender msgSender = new MessageSender();
        msgSender.addMessage("Hello", 1);
        msgSender.addMessage("Hi", 2);
        msgSender.addMessage("Hey", 3);
        msgSender.sendMessage();
    }
}
