cmake_minimum_required(VERSION 3.15)
project(test)

set(CMAKE_CXX_STANDARD 11)

add_executable(test main.cpp DoubleLinkedList/List.cpp DoubleLinkedList/Item.cpp DoubleLinkedList/Item.h DoubleLinkedList/List.h Vehicles/Vehicle.cpp Vehicles/Vehicle.h Vehicles/Aircraft.cpp Vehicles/Aircraft.h Vehicles/Car.cpp Vehicles/Car.h Vehicles/Boat.cpp Vehicles/Boat.h Vehicles/FlyingCar.cpp Vehicles/FlyingCar.h Vehicles/Amphibian.cpp Vehicles/Amphibian.h Vehicles/Fliewatueuet.cpp Vehicles/Fliewatueuet.h)