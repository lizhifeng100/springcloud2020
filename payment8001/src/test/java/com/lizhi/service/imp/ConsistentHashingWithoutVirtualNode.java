package com.lizhi.service.imp;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @Description TODO
 * @Date 2021/4/7 10:24
 * @Created by 荔枝/260494
 */
public class ConsistentHashingWithoutVirtualNode {
    private static final String[] servers = {"192.168.0.1:8888", "192.168.0.2:8888",
            "192.168.0.3:8888"};
    //服务器的挂载点
    private static SortedMap<Integer, String> sortedMap = new TreeMap<>();

    static {
        for (String server : servers) {
            int hash = getHash(server);
            System.out.println("[" + server + "]加入集合中，起hash值为：" + hash);
            sortedMap.put(hash, server);
        }
    }

    private static int getHash(String str) {
        final int p = 16777619;
        int hash = (int) 2166136261L;
        for (int i = 0; i < str.length(); i++) {
            hash = (hash ^ str.charAt(i)) * p;
        }
        hash += hash << 13;
        hash ^= hash >> 7;
        hash += hash << 3;
        hash ^= hash >> 17;
        hash += hash << 5;
        // 如果算出来的值为负数则取其绝对值
        if (hash < 0)
            hash = Math.abs(hash);
        return hash;
    }

    /**
     * 得到应当的路由到的节点
     */
    private static String getServer(String key) {
        //得到该key的hash值
        int hash = getHash(key);
        //得到大于该Hash值的所有Map
        SortedMap<Integer, String> subMap = sortedMap.tailMap(hash);
        if (subMap.isEmpty()) {
            Integer i = sortedMap.firstKey();
            return sortedMap.get(i);
        } else {
            Integer i = subMap.firstKey();
            return subMap.get(i);
        }
    }

    public static void main(String[] args) {
        String[] keys = {"semlinker", "kakuqo", "fer"};
        for (String key : keys)
            System.out.println("[" + key + "]的hash值为" + getHash(key)
                    + ", 被路由到结点[" + getServer(key) + "]");
        }


}
