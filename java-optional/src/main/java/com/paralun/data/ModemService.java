package com.paralun.data;

import java.util.Optional;

public class ModemService {

    public boolean priceIsInRange(Modem modem) {
        boolean isRange = false;

        if (modem != null) {
            if (modem.getPrice() != null) {
                if (modem.getPrice() >= 10 && modem.getPrice() <= 15) {
                    isRange = true;
                }
            }
        }

        return isRange;
    }

    public boolean priceIsInRangeOptional(Modem modem) {
        return Optional.ofNullable(modem)
                .map(Modem::getPrice)
                .filter(price -> price >= 10)
                .filter(price -> price <= 15)
                .isPresent();
    }
}
