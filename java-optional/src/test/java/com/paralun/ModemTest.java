package com.paralun;

import com.paralun.data.Modem;
import com.paralun.data.ModemService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ModemTest {

    @Test
    void testModem() {
        ModemService service = new ModemService();
        assertTrue(service.priceIsInRangeOptional(new Modem(10)));
        assertTrue(service.priceIsInRangeOptional(new Modem(15)));
        assertFalse(service.priceIsInRangeOptional(new Modem(9)));
        assertFalse(service.priceIsInRangeOptional(new Modem(20)));
        assertFalse(service.priceIsInRangeOptional(new Modem(null)));
        assertFalse(service.priceIsInRangeOptional(null));
    }
}
