//
// Created by synapse on 8/12/23.
//
#include "Aircraft.h"
#include "Car.h"
#ifndef TEST_FLYINGCAR_H
#define TEST_FLYINGCAR_H


class FlyingCar : virtual public Car, public Aircraft{
public:
    void move() override;

    virtual void switchMode(int order);
private:
    bool onGround = true;
};


#endif //TEST_FLYINGCAR_H
