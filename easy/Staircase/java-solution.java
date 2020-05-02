static void staircase(int n) {
    for (int i = 1; i <= n; i++)
        System.out.println(String.join("", Collections.nCopies(n-i, " ")) + String.join("", Collections.nCopies(i, "#")));
}