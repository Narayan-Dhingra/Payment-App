package com.example.paymentapp.RV;

public class PaymentRecent {

    private int pImage;
    private String pTv1;
    private String pTv2;
    private String pTv3;
    private String pTv4;
    private String pTv5;

    public PaymentRecent(int image, String tv1, String tv2, String tv3, String tv4, String tv5 ) {
        this.pImage = image;
        this.pTv1 = tv1;
        this.pTv2 = tv2;
        this.pTv3 = tv3;
        this.pTv4 = tv4;
        this.pTv5 = tv5;
    }

    public int getImage() {
        return pImage;
    }

    public String getTv1() {
        return pTv1;
    }

    public String getTv2() {
        return pTv2;
    }

    public String getTv3() {
        return pTv3;
    }

    public String getTv4() {
        return pTv4;
    }

    public String getTv5() { return pTv4; }

}
