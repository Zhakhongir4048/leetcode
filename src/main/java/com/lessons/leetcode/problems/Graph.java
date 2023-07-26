package com.lessons.leetcode.problems;

import java.util.*;

public class Graph {

    private String search() {
        Map<String, String[]> graph = getGraph();
        Set<String> searched = new HashSet<>();
        Deque<String> searchQue = new ArrayDeque<>();
        searchQue.add("you");
        while (!searchQue.isEmpty()) {
            String person = searchQue.pollFirst();
            System.out.println(person);
            if (personIsSeller(person)) {
                return person;
            } else {
                String[] friends = graph.get(person);
                if (friends == null) continue;
                for (String friend : friends) {
                    if (friend != null && !searched.contains(friend)) {
                        searchQue.addLast(friend);
                        searched.add(friend);
                    }
                }
            }
        }
        return null;
    }

    public boolean personIsSeller(String person) {
        return person.endsWith("m");
    }

    private Map<String, String[]> getGraph() {
        Map<String, String[]> map = new HashMap<>();
        map.put("you", new String[]{"alice", "bob", "claire"});
        map.put("bob", new String[]{"anuj", "peggy"});
        map.put("alice", new String[]{"peggy"});
        map.put("claire", new String[]{"thom", "jonny"});
        map.put("annuj", null);
        map.put("peggy", null);
        map.put("thom", null);
        map.put("johny", null);
        return map;
    }


    public static void main(String[] args) {
        String search = new Graph().search();
        System.out.println("search = " + search);
    }

}