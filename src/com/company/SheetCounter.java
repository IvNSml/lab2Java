package com.company;

class SheetCounter extends Object {
    private double value;

    protected void SetValue(double value){
        this.value=value;
    }
    protected double GetValue(){
        return this.value;
    }
    protected void DivideOnThousand() {
        this.value/=1000;
    }
}
