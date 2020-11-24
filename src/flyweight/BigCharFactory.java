package flyweight;

import java.util.HashMap;

public class BigCharFactory {
    private HashMap pool = new HashMap();
    private static BigCharFactory factory = new BigCharFactory();
    private BigCharFactory(){
    }
    public static BigCharFactory getInstance() {
        return factory;
    }
    public synchronized BigChar getBigChar(char charName) {
        BigChar bigChar = (BigChar) pool.get(""+charName);
        if (bigChar == null) {
            bigChar = new BigChar(charName);
            pool.put(""+charName,bigChar);
        }
        return bigChar;
    }
}
