package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

class ResultCheckerTest {
    @Test
    void testCheck() {
        ResultChecker checker = new ResultChecker();
        checker.check(1, 1);
    }
}
