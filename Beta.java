package com.suarez;

public class Beta extends Alpha

{

    private int num;

    public Beta(int myNum)

    {

        super( );

        num = myNum;

        super.setValue(myNum - 3);

    }

    public String display( )

    {

        return "value: " + getValue( ) + " num: " + num;

    }

}
