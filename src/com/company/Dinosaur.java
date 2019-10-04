package com.company;

class Dinosaur extends SheetCounter{
    double weight;
    Dinosaur(double w){
        SetValue(w);
    }
    double GetWeight(){
        return GetValue();
    }
    void toKilos(){
        DivideOnThousand();
    }
}