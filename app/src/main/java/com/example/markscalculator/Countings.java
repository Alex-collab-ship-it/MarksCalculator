package com.example.markscalculator;

public class Countings {

    public static double point = MainActivity.point;

    public static String tofive(double summ , int k){
        double sumfive = summ;
        int fi = k;
        while(sumfive/fi<4 + point){
            sumfive+=5;
            fi++;
        }
        if(fi-k==1)
            return "До 5-ки: " + (fi-k) + " 5-ка";
        else if(fi-k==2 || fi-k==3 || fi-k==4)
            return "До 5-ки: " + (fi-k) + " 5-ки";
        else
            return "До 5-ки: " + (fi-k) + " 5-ок";
    }
    public static String tofour(double summ, int k){
        double sumfive = summ;
        double sumfour = summ;
        int fi = k;
        int fo = k;
        while (sumfive/fi<3 + point){
            sumfive+=5;
            fi++;
        }
        sumfour=summ;
        while (sumfour/fo<3 + point){
            sumfour+=4;
            fo++;
        }
        if(fi-k==1 && fo-k==1)
            return "До 4-ки: " + (fi-k)+" 5-ка или - " + (fo-k) + " 4-ка";
        else if((fi-k==2 || fi-k==3 || fi-k==4) && fo - k==1)
            return "До 4-ки: " + (fi-k)+" 5-ки или - " + (fo-k) + " 4-ка";
        else if(!(fi-k==2 || fi-k==3 || fi-k==4 || fi - k == 1) && fo - k==1)
            return "До 4-ки: " + (fi-k)+" 5-ок или - " + (fo-k) + " 4-ок";
        else if(fi-k==1 && (fo-k==2 || fo-k==3 || fo-k==4))
            return "До 4-ки: " + (fi-k)+" 5-ка или - " + (fo-k) + " 4-ки";
        else if((fi-k==2 || fi-k==3 || fi-k==4) && (fo-k==2 || fo-k==3 || fo-k==4))
            return "До 4-ки: " + (fi-k)+" 5-ки или - " + (fo-k) + " 4-ки";
        else if (!(fi-k==2 || fi-k==3 || fi-k==4 || fi-k==1) && (fi-k==2 || fi-k==3 || fi-k==4))
            return "До 4-ки: " + (fi-k)+" 5-ка или - " + (fo-k) + " 4-ка";
        else if (fi-k==1 && !(fo-k==2 || fo-k==3 || fo-k==4 || fo-k==1))
            return "До 4-ки: " + (fi-k)+" 5-ка или - " + (fo-k) + " 4-ок";
        else if ((fi-k==2 || fi-k==3 || fi-k==4) && !(fo-k==2 || fo-k==3 || fo-k==4 || fo-k==1))
            return "До 4-ки: " + (fi-k)+" 5-ки или - " + (fo-k) + " 4-ок";
        else if (!(fi-k==2 || fi-k==3 || fi-k==4 || fi - k == 1) && !(fo-k==2 || fo-k==3 || fo-k==4 || fo-k==1))
            return "До 4-ки: " + (fi-k)+" 5-ок или - " + (fo-k) + " 4-ок";
        return null;
    }
    public static String tothree(double summ , int k){
        int fi = k;
        int fo = k;
        int th= k;
        double sumfive = summ;
        double sumfour = summ;
        double sumthree = summ;
        while (sumfive / fi < 2 + point) {
            sumfive += 5;
            fi++;
        }
        sumthree = summ;
        while (sumfour / fo < 2 + point) {
            sumfour += 4;
            fo++;
        }
        sumthree = summ;
        while (sumthree / th < 2 + point) {
            sumthree += 3;
            th++;
        }
        if(fi-k==1 && fo-k==1 && th-k==1)
            return "До 3-ки: " + (fi - k) + " 5-ка, " + (fo - k) + " 4-ка или " + (th - k) + " 3-ка";
        else if((fi-k==2 || fi-k==3 || fi-k==4) && fo - k==1 && th - k==1)
            return "До 3-ки: " + (fi - k) + " 5-ки, " + (fo - k) + " 4-ка или " + (th - k) + " 3-ка";
        else if(!(fi-k==2 || fi-k==3 || fi-k==4 || fi - k == 1) && fo - k==1 && th - k==1)
            return "До 3-ки: " + (fi - k) + " 5-ок, " + (fo - k) + " 4-ка или " + (th - k) + " 3-ка";
        else if(fi-k==1 && (fo-k==2 || fo-k==3 || fo-k==4) && th - k == 1)
            return "До 3-ки: " + (fi - k) + " 5-ка, " + (fo - k) + " 4-ки или " + (th - k) + " 3-ка";
        else if(fi-k==1 && !(fo-k==2 || fo-k==3 || fo-k==4 || fo-k==1) && th - k ==1)
            return "До 3-ки: " + (fi - k) + " 5-ка, " + (fo - k) + " 4-ок или " + (th - k) + " 3-ка";
        else if (fi - k == 1 && fo - k == 1 && (th-k==2 || th-k==3 || th-k==4))
            return "До 3-ки: " + (fi - k) + " 5-ка, " + (fo - k) + " 4-ка или " + (th - k) + " 3-ки";
        else if (fi-k==1 && fo - k == 1 && !(th-k==2 || th-k==3 || th-k==4 || th-k==1))
            return "До 3-ки: " + (fi - k) + " 5-ка, " + (fo - k) + " 4-ка или " + (th - k) + " 3-ек";
        else if ((fi-k==2 || fi-k==3 || fi-k==4) && (fo-k==2 || fo-k==3 || fo-k==4) && (th-k==2 || th-k==3 || th-k==4))
            return "До 3-ки: " + (fi - k) + " 5-ки, " + (fo - k) + " 4-ки или " + (th - k) + " 3-ки";
        else if ((fi-k==2 || fi-k==3 || fi-k==4) && (fo-k==2 || fo-k==3 || th-k==4) && th - k ==1)
            return "До 3-ки: " + (fi - k) + " 5-ки, " + (fo - k) + " 4-ки или " + (th - k) + " 3-ка";
        else
            return "До 3-ки: " + (fi - k) + " 5-ки, " + (fo - k) + " 4-ок или " + (th - k) + " 3-ек";
    }
    public static String avclr(double summ , int k){
        double res = summ/k;
        return res>=4 + point ? "#0BE100": res>=3 + point ? "#E1E131": res>=2 + point ? "#EC9E20": "#D42700";
    }
}
