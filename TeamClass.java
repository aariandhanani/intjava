package com.suarez;

public class TeamClass {
    public static String name;

    public TeamClass(String name1) {
        name = name1;
    }

    public TeamClass() {
        name = "";
    }

    public String getname() {
        return name;
    }

    public void setname(String name1) {
        name = name1;
    }

    public String toString() {
        return ("" + name);
    }

    @Override
    public boolean equals(Object x) {
        TeamClass g = (TeamClass) x;
        if (name.equals(g.name)) {
            return true;
        }
        else {
            return false;
        }
    }
}
