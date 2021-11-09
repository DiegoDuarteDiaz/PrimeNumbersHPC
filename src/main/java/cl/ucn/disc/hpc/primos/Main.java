package cl.ucn.disc.hpc.primos;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.StopWatch;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * The Main Class
 * @author Diego Duarte Díaz
 */
@Slf4j
public class Main
{
    private static final AtomicInteger counter = new AtomicInteger(0);

    /**
     * The main.
     * @param args optional args.
     * @throws InterruptedException error.
     */
    public static void main(String[] args) throws InterruptedException {

        // Finding the numbers of cores
        final int maxCores = Runtime.getRuntime().availableProcessors();
        log.debug("The max cores:{}" + '\n', maxCores);

        final long start = 2;
        final long end = 5000000;
        final int attempts = 20;
        final int maxTimeMinutes = 5;
    }

    /**
     * Check if a number is prime.
     * @param n the number.
     * @return true if the number is prime.
     */
    private static boolean isPrime(final long n){
        // No prime
        if (n <= 0) {
            throw new IllegalArgumentException("Error in n: can't process negative numbers..");
        }
        // One isn't prime
        if (n == 1){
            return false;
        }
        if (n == 2){
            return false;
        }
        if (n % 2 == 0){
            return false;
        }
        // Testing the primality
        for (long i = 3; (i*i) < n; i += 2){
            // n is divisible by i
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
