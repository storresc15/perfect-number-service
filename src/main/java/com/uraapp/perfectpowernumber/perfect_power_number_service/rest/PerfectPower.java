package com.uraapp.perfectpowernumber.perfect_power_number_service.rest;

public class PerfectPower {
    private int n;
    private int m;
    private int k;

    public PerfectPower(int n, int m, int k) {
        this.k = k;
        this.m = m;
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    @Override
    public String toString() {
        return "PerfectPower{" +
                "n=" + n +
                ", m=" + m +
                ", k=" + k +
                '}';
    }
}
