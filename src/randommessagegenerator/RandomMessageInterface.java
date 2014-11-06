/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randommessagegenerator;

import java.util.List;

/**
 *
 * @author jkramer26
 */
public interface RandomMessageInterface {

    //lets you add more methods
    void addMessage(String msg);

    String getMessage();

    //getters and setters
    List<String> getMessageList();

    //removes a message from list
    void removeMessage(String msg);

    void setMessageList(List<String> messageList);
    
}
