public class FindOutlier{
    static int find(int[] integers){
        int n = 0;
        if (integers[0] % 2 == 0 && integers[1] % 2 == 0 || integers[1] % 2 == 0 && integers[2] % 2 == 0  )
        {
            for( int i: integers){
                if (i % 2 != 0) n = i;
            }

        }
        if (integers[0] % 2 != 0 && integers[1] % 2 != 0 || integers[1] % 2 != 0 && integers[2] % 2 != 0  )
        {
            for( int i: integers){
                if (i % 2 == 0) n = i;
            }

        }
        return n;

    }}