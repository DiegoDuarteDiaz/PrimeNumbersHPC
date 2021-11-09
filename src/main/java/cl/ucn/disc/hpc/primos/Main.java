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
}
