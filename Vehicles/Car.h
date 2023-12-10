//
// Created by synapse on 8/12/23.
//
#include "Vehicle.h"
#ifndef TEST_CAR_H
#define TEST_CAR_H


class Car : virtual public Vehicle{
public:
    void move() override;
    void drive();
};


#endif //TEST_CAR_H
