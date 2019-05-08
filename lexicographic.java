package com.suarez;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class lexicographic
{
    public static void main(String [] args)
    {
        try
        {
            Stream <String> dataStream = Files.lines( Paths.get( "data.txt" ) );
        }
        catch ( InvalidPathException ipe )
        {
            System.out.println( ipe.getMessage( ) );
        }
        catch ( IOException ioe )
        {
            System.out.println( ioe.getMessage( ) );
        }
        catch ( SecurityException se )
        {
            System.out.println( se.getMessage( ) );
        }
    }
}
