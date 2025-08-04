package com.kodilla.collections.adv.maps.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    @Test
    void testSchoolSum() {
        School school = new School();
        int result = school.getSum();
        assertEquals(63, result);
    }
}