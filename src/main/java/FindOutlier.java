public class FindOutlier {
    static int find(int[] integers){
        int n = 0;
        if (integers[0] % 2 == 0 || integers[1] % 2 == 0 )
        {
            for( int i: integers){
                if (i % 2 != 0) n = i;
                System.out.println(i % 2);
            }

        }
        return n;

    }}