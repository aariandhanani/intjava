package com.suarez;

public class Point3D extends Point{
    public int z;

    public Point3D(int newX, int newY, int newZ)
    {
        x = newX;
        y = newY;
        z = newZ;
    }

    public void setZ(int z1)
    {
        z = z1;
    }

    public int getZ()
    {
        return z;
    }
}
