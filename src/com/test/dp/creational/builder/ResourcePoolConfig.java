package com.test.dp.creational.builder;

public class ResourcePoolConfig {
    private String name;
    private int maxTotal;
    private int maxIdle;
    private int minIdle;

    private ResourcePoolConfig(Builder builder) {
        this.name = builder.name;
        this.maxTotal = builder.maxTotal;
        this.maxIdle = builder.maxIdle;
        this.minIdle = builder.minIdle;
    }

    public static class Builder {
        private static final int DEFAULT_MAX_TOTAL = 8;
        private static final int DEFAULT_MAX_IDLE = 8;
        private static final int DEFAULT_MIN_IDLE = 0;
        private String name;
        private int maxTotal = DEFAULT_MAX_TOTAL;
        private int maxIdle = DEFAULT_MAX_IDLE;
        private int minIdle = DEFAULT_MIN_IDLE;

        public ResourcePoolConfig build() { // 校验合法逻辑的位置
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            if (maxIdle > maxTotal) {
                throw new IllegalArgumentException("maxIdle > maxTotal");
            }
            if (minIdle > maxTotal || minIdle > maxIdle) {
                throw new IllegalArgumentException("minIdle > maxTotal");
            }
            return new ResourcePoolConfig(this);
        }

        public Builder setMaxTotal(int maxTotal) { // 链式调用来进行构建
            if (maxTotal <= 0) {
                throw new IllegalArgumentException("maxTotal must be greater than 0");
            }
            this.maxTotal = maxTotal;
            return this;
        }
    }
}
//ResourcePoolConfig config = new ResourcePoolConfig.Builder().setMaxTotal(1).build();