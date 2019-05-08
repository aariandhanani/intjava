package com.suarez;

public class AlphaClient {
    public static void main(String [] args)
    {
        Alpha bObject = new Beta(5);

        Alpha gObject = new Gamma(6);

        System.out.println(bObject.display( ));

        System.out.println(gObject.display( ));
    }
}
