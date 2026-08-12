class Reverse {
    public String reverseString() {
        String input = "Prathamesh";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i); // ✅ correct usage
        }
        return reversed;
    }

    public static void main(String[] args) {
        Reverse obj = new Reverse();
        String output = obj.reverseString(); // ✅ method name matches
        System.out.println(output);
    }
}
