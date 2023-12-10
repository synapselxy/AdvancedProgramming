//
// Created by synapse on 8/12/23.
//
#include "Vehicle.h"
#ifndef TEST_BOAT_H
#define TEST_BOAT_H


class Boat :virtual public Vehicle{
public:
    void move() override;
    static void swim();
};


#endif //TEST_BOAT_H
