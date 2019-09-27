public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        if (walk.length != 10) return false;

        int nCount = 0, sCount = 0, wCount = 0, eCount = 0;

        for (char c : walk) {
            switch (c) {
                case 'n':
                    nCount++;
                    break;
                case 's':
                    sCount++;
                    break;
                case 'w':
                    wCount++;
                    break;
                case 'e':
                    eCount++;
                    break;
            }

        }

        if (nCount == sCount && wCount == eCount) return true;

        else return false;
    }
}
