class Solution {
    public int calPoints(String[] operations) {
        int a = operations.length;

        Stack<Integer> record = new Stack<>();

        int totalSum = 0;

        for (int i = 0; i < a; i++) {

            if (!operations[i].equals("+") && !operations[i].equals("D") && !operations[i].equals("C")) {
                int n = Integer.parseInt(operations[i]);
                record.push(n);
            }

            if (operations[i].equals("+")) {
                if (record.size() >= 2) {

                    int first = record.pop();
                    int sum = first + record.peek();
                    record.push(first);
                    record.push(sum);
                }

            }

            if (operations[i].equals("D")) {
                if (!record.isEmpty()) {

                    int first = record.peek();
                    int product = first * 2;
                    record.push(product);
                }

            }

            if (operations[i].equals("C")) {
                if (!record.isEmpty()) {
                    record.pop();
                }
            }

        }

        for (int sum : record) {
            totalSum += sum;
        }

        return totalSum;

    }

}
