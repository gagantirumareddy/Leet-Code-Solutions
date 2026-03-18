class Solution {
    public List<Integer> getRow(int k) {
        List<Integer> row = new ArrayList<>();
        long c = 1;
        row.add((int)c);

        for (int i = 1; i <= k; i++) {
            c = c * (k - i + 1) / i;
            row.add((int)c);
        }
        return row;
    }
}
