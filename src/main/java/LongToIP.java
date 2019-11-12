
public class LongToIP {
    public static String longToIP(long ip) {

        String binarystr =  Long.toBinaryString(ip);
        while (binarystr.length() < 32){
            binarystr = "0" + binarystr;
        }

        String [] bytes = new String[4];
        int [] decimal = new int[4];

        for (int i = 0; i < binarystr.length()/8; i ++){
            int firts = i * 8;
            bytes[i] = binarystr.substring(firts,firts + 8);
            decimal[i] =  Integer.parseInt(bytes[i], 2);
        }

        String result = decimal[0] + "." + decimal[1] + "."  + decimal[2] + "." + decimal[3] ;

        return result;
    }
}
