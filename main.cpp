#include <iostream>
#include "DoubleLinkedList/Item.h"
#include "Vehicles/Fliewatueuet.h"
using namespace std;
void test01(Fliewatueuet &f){
    cout<<"Test Polymorphic behavior: "<<'\n';
    f.switchMode(0);
    f.move();
    f.switchMode(1);
    f.move();
    f.switchMode(2);
    f.move();
}
void test02(Amphibian &a){
    cout<<'\n'<<"Amphibian actions"<<'\n';
    a.move();
    a.switchMode(0);
    a.move();
    a.switchMode(1);
    a.move();
}
void test03(FlyingCar &c){
    cout<<'\n'<<"Flyingcar actions"<<'\n';
    c.move();
    c.switchMode(0);
    c.move();
    c.switchMode(1);
    c.move();
}
void test04(Amphibian a){
    cout<<'\n'<<"Copied Amphibian actions"<<'\n';
    a.move();
    a.switchMode(0);
    a.move();
    a.switchMode(1);
    a.move();
}
void test05(FlyingCar c){
    cout<<'\n'<<"Copied Flyingcar actions"<<'\n';
    c.move();
    c.switchMode(0);
    c.move();
    c.switchMode(1);
    c.move();
}
int main(){
    Fliewatueuet f;
    test01(f);
    test02(f);
    test03(f);
    test04(f);
    test05(f);
}
