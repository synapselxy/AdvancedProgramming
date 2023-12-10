//
// Created by synapse on 8/12/23.
//
#include "FlyingCar.h"
#include "Amphibian.h"
#ifndef TEST_FLIEWATUEUET_H
#define TEST_FLIEWATUEUET_H


class Fliewatueuet : public FlyingCar, public Amphibian{
public:
    void move() override;
    void switchMode(int order);
private:
    int mode = -1;
};


#endif //TEST_FLIEWATUEUET_H
