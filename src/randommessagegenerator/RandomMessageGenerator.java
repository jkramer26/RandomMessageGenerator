package randommessagegenerator;

/**
 * @author jkramer26
 */
public class RandomMessageGenerator {

    public static void main(String[] args) {
        
        RandomMessageGeneratorClass rmsg = new RandomMessageGeneratorClass();
        rmsg.addMessage("Hiya!!");
        String message = rmsg.getMessage();
        
        System.out.println(message);
        
    }
    
}
