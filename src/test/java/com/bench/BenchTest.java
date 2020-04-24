package com.bench;

import org.junit.Test;

import static org.junit.Assert.fail;
import static java.util.stream.IntStream.rangeClosed;

public class BenchTest {
    @Test
    public void test() {
        final int iterations = 1_000_000_000;
        long start = System.currentTimeMillis();
        rangeClosed(1, 50).parallel()
                .forEach(i -> rangeClosed(1, iterations).mapToDouble(Math::sqrt).sum());
    }
}
