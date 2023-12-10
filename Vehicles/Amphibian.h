//
// Created by synapse on 8/12/23.
//
#include "Car.h"
#include "Boat.h"
#ifndef TEST_AMPHIBIAN_H
#define TEST_AMPHIBIAN_H


class Amphibian : virtual public Car, public Boat{
public:
    void move() override;
    static void switchMode(int order);
private:
    bool onLand = true;
};


#endif //TEST_AMPHIBIAN_H
