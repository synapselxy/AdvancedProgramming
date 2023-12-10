//
// Created by synapse on 8/12/23.
//
#include "Vehicle.h"
#ifndef TEST_AIRCRAFT_H
#define TEST_AIRCRAFT_H


class Aircraft : virtual public Vehicle{
public:
    void move() override;
    void fly();
};


#endif //TEST_AIRCRAFT_H
