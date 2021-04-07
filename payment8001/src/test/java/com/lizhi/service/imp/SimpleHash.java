package com.lizhi.service.imp;

/**
 * @Description 测试Hash的存值
 * @Date 2021/4/7 9:18
 * @Created by 荔枝/260494
 */
public class SimpleHash {

    private int cap;

    private int seed;

    public SimpleHash(int cap, int seed) {
        this.cap = cap;
        this.seed = seed;
    }

    public int hash(String value) {
        int result = 0;
        int len = value.length();
        for (int i = 0; i < len; i++) {
            char member = value.charAt(i);
            result = seed * result + member;
        }
        int sum = (cap - 1) & result;
        return sum;
    }

    public static void main(String[] args) {
        SimpleHash simpleHash = new SimpleHash(2 << 12, 8);
        System.out.println("node_number=hash(\"semlinker\") % 3 -> " +
                simpleHash.hash("semlinker") % 3);
        System.out.println("node_number=hash(\"kakuqo\") % 3 -> " +
                simpleHash.hash("kakuqo") % 3);
        System.out.println("node_number=hash(\"test\") % 3 -> " +
                simpleHash.hash("test") % 3);
    }


}
