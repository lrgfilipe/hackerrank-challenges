static long aVeryBigSum(long[] ar) {
    return Arrays.stream(ar).reduce(0, (a, b) -> a + b);
}