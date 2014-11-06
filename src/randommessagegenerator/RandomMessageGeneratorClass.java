
package randommessagegenerator;
import java.util.*;
/**
 *
 * @author jkramer26
 */
public class RandomMessageGeneratorClass implements RandomMessageInterface {
    private List<String> messageList; 
    
    public RandomMessageGeneratorClass() {
        //intializing list
        messageList = new ArrayList<>();
        messageList.add("Hello World!");
        messageList.add("Welcome to Java");
        messageList.add("Promote good OOP architecture");
    }
    
    //lets you add more methods
    @Override
    public void addMessage(String msg) {
        messageList.add(msg);
        //passing list in to eliminate duplicates
        Set<String> noDupes = new LinkedHashSet<>(messageList);
        //passing in noDupes back into the array 
        messageList = new ArrayList<>(noDupes);
    }
    
    @Override
    public String getMessage() {
        Random r = new Random(System.nanoTime());
        //gives you randomer between 0 and upperbound of list not inclusive which is the size of list. 
        int n = r.nextInt(messageList.size());
        //will give us our random message
        return messageList.get(n);
    }
    
    //removes a message from list
    @Override
    public void removeMessage(String msg) {
        messageList.remove(msg);
    }
    
    //getters and setters
    @Override
    public List<String> getMessageList() {
        return messageList;
    }

    @Override
    public void setMessageList(List<String> messageList) {
        this.messageList = messageList;
    }
    
    
}
