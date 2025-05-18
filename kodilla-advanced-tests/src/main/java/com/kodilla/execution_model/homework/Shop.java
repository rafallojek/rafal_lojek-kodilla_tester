package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Shop {
    private final Set<Order> orders = new HashSet<>();

    public boolean addOrder(Order order) {
        return orders.add(order);
    }

    public List<Order> getOrdersByDateRange(LocalDate startDate, LocalDate endDate) {
        return orders.stream()
                .filter(o -> !o.getDate().isBefore(startDate) && !o.getDate().isAfter(endDate))
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersByValueRange(int minValue, int maxValue) {
        return orders.stream()
                .filter(o -> o.getValue() >= minValue && o.getValue() <= maxValue)
                .collect(Collectors.toList());
    }

    public int getOrderCount() {
        return orders.size();
    }

    public int getTotalOrderValue() {
        return orders.stream()
                .mapToInt(Order::getValue)
                .sum();
    }
}
