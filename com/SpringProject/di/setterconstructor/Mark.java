package com.SpringProject.di.setterconstructor;
public class Mark {
    private int mark1;
    private int mark2;
    private int mark3;
    private int mark4;

    public void setMark1(int mark1) {   this.mark1 = mark1;    }

    public void setMark2(int mark2) {   this.mark2 = mark2;    }

    public void setMark3(int mark3) {   this.mark3 = mark3;    }

    public void setMark4(int mark4) {   this.mark4 = mark4;    }
    public void getmarks(){
        System.out.println(mark1);
        System.out.println(mark2);
        System.out.println(mark3);
        System.out.println(mark4);
    }
}
