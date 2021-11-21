import java.util.*;

//+rep Chaipau

public class BucketSort
{
    public static double[] BucketSort(double[] array)
    {
        LinkedList<Double>[] buckets = new LinkedList[array.length];

        int count = 0;
        for (int i=0; i<array.length; i++)
        {
            if (buckets[(int)Math.floor(array[i]/10)] == null)
            {
                buckets[(int)Math.floor(array[i]/10)] = new LinkedList<Double>();
            }
            buckets[(int)Math.floor(array[i]/10)].add(array[i]);
        }

        for (int i=0 ;i<array.length; i++)
        {
            if(buckets[i]!=null)
            {
                Collections.sort(buckets[i]);
            }
        }

        for (int i=0; i<array.length; i++)
        {
            if(buckets[i] != null)
            {
                for (Double val : buckets[i])
                {
                    array[count] = val;
                    count++;
                }
            }
        }

        return array;
    }

    public static void main(String[] args)
    {
        int a = 10, b = 20, n = 10;
        double[] massive = new double[n];
        System.out.println("Random array");
        for (int i = 0; i < n; i++)
        {
            massive[i] = Math.random()*(b-a)+a;
            System.out.println(massive[i]);
        }
        BucketSort(massive);
        System.out.println();
        System.out.println("Sorting array");
        for (int i = 0; i < n; i++)
        {
            System.out.println(massive[i]);
        }
    }
}