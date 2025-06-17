class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        List<Character> charList = new ArrayList<>(s.length());
        for (char c : freqMap.keySet()) {
            for (int i = 0; i < freqMap.get(c); i++) {
                charList.add(c);
            }
        }

        charList.sort((a, b) -> freqMap.get(b) - freqMap.get(a));

        StringBuilder result = new StringBuilder();
        for (char c : charList) {
            result.append(c);
        }

        return result.toString();
    }
}
