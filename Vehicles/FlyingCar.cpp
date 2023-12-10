//
// Created by synapse on 8/12/23.
//

#include "FlyingCar.h"

void FlyingCar::move() {
    Aircraft::move();
}

void FlyingCar::switchMode(int order) {
    cout<<"Flying car switchmode "<<order;
}
