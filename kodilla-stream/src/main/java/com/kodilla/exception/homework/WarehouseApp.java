package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1006"));
        warehouse.addOrder(new Order("1007"));
        warehouse.addOrder(new Order("1008"));
        try {
            Order foundOrder = warehouse.getOrder("9999");
            System.out.println("Found order: " + foundOrder.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
