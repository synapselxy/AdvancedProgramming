//
// Created by synapse on 8/12/23.
//

#include "Fliewatueuet.h"

void Fliewatueuet::move() {
    cout<<"Fliewatueuet move\n";
}

void Fliewatueuet::switchMode(int order) {
    cout<<"Fliewatueuet switchMode: "<<order<<'\n';
    this->mode = order;
}
