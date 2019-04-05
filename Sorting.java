package com.suarez;

import java.util.Random;

//selection
//insertion
//merge
//bubble
public class Sorting {
//    public static int [ ] ArraySort()
//    {
//        int [] arraySorting= new int[10];
//        for ( int i = 0; i<arraySorting.length; i++ )
//        {
//            arraySorting[i] = ArraySort()[i];
//        }
//        return arraySorting;
//    }

    public static void SelectionSort(int[] arrays) {
        int temprary;
        int maximum;

        for (int i = 0; i < arrays.length - 1; i++) {
            maximum = indexOfLargestElement(arrays, arrays.length - i);

            temprary = arrays[maximum];
            arrays[maximum] = arrays[arrays.length - i - 1];
            arrays[arrays.length - i - 1] = temprary;
        }
    }

    public static void InsertionSort(int[] arrays) {
        int array1;
        int temporary;

        for (int i = 1; i < arrays.length; i++) {
            array1 = i;
            temporary = arrays[i];

            while (array1 != 0 && arrays[array1 - 1] > temporary) {
                arrays[array1] = arrays[array1 - 1];

                array1--;
            }
            arrays[array1] = temporary;
        }
    }

    public static void BubbleSort(int[] arrays)
    {
        int n = arrays.length;
        
        int temporary = 0;

        for (int i = 0; i < n; i++) {
            for (int arrays1 = 1; arrays1 < (n - i); arrays1++)
            {
                if (arrays[arrays1 - 1] > arrays[arrays1])
                {

                    temporary = arrays[arrays1 - 1];

                    arrays[arrays1 - 1] = arrays[arrays1];

                    arrays[arrays1] = temporary;
                }
            }
        }

    }

        public static void Bubble()
    {
    }
    private static int indexOfLargestElement(int [] array, int size)
    {
        int index = 0;
        for (int i = 1; i < size; i++)
        {
            if (array[i] > array[index])
            {
                index = i;
            }
        }
        return index;
    }
    public static void main(String [] args)
    {
        //selection sort
        int [] arrayTest = new int[10];
        Random randomCheck = new Random();
        for (int i = 0; i < arrayTest.length; i++)
        {
            arrayTest[i] = randomCheck.nextInt(50)+ 1;
        }

        Sorting.SelectionSort(arrayTest);

        System.out.println("Sorted Array: ");

        for(int i = 0; i < arrayTest.length; i++)
        {
            System.out.print(arrayTest[i] + " ");
        }
        System.out.println();

        //insertion sort

        int [] arrayTest2 = new int[1000];
        Random randomCheck2 = new Random();

        for (int i = 0; i < arrayTest2.length; i++)
        {
            arrayTest2[i] = randomCheck2.nextInt(50)+ 1;
        }

        Sorting.InsertionSort(arrayTest2);

        System.out.println("Sorted Array: ");

        for(int i = 0; i < arrayTest2.length; i++)
        {
            System.out.print(arrayTest2[i] + " ");
        }
        System.out.println();

        //bubble sort

        int [] arrayTest3 = new int[1000];
        Random randomCheck3 = new Random();

        for (int i = 0; i < arrayTest3.length; i++)
        {
            arrayTest3[i] = randomCheck3.nextInt(50)+ 1;
        }

        Sorting.BubbleSort(arrayTest3);

        System.out.println("Sorted Array: ");

        for(int i = 0; i < arrayTest3.length; i++)
        {
            System.out.print(arrayTest3[i] + " ");
        }
        System.out.println();
    }
}
