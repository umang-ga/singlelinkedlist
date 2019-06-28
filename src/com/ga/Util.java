package com.ga;

import java.util.stream.IntStream;

/**
 * @author Umang Soni
 *
 */
public class Util {
    
    
    void appendElements(SingleLinkedList list) {
        IntStream.range(1, 50).forEach(x -> {
            list.append(list, x);
        });
    }
    
}
