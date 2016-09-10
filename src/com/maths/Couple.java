package com.maths;

/**
 * Created by mhafidi on 10/09/2016.
 */
public class Couple<T>
{
    protected T l1;
    protected T l2;

    public Couple(T l1, T l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public T getL1() {
        return l1;
    }

    public void setL1(T l1) {
        this.l1 = l1;
    }

    public T getL2() {
        return l2;
    }

    public void setL2(T l2) {
        this.l2 = l2;
    }


    public boolean equals(Couple aInElement)
    {
        return (aInElement==null||this==null)? false:((aInElement.getL1().equals(this.getL1()) && aInElement.getL2().equals(this.getL2()))||
                (aInElement.getL1().equals(this.getL2()) && aInElement.getL2().equals(this.getL1())));

    }
}
