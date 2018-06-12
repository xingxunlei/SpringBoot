package com.xingxunlei.timebusker.actuator;

/**
 * Created by xingmin on 2018/1/2.
 */
@Component
public class MineHealthIndicators implements HealthIndicator{

    private int errorCode = 0;

    @Override
    public Health health() {
        if (checkDataSource() != 0) {
            return Health.down().withDetail("Error Code", errorCode).build();
        }
        return Health.up().build();
    }

    private int checkDataSource() {
        return errorCode;
    }

}
