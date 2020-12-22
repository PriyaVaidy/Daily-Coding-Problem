class LPSSolution {
  public static void main(String[] args) {

    String input = "MAPTPTMTPA";
    int subseqLen = longestPalindromeSize(input);
    System.out.println(subseqLen);
  }

  public static int longestPalindromeSize(String strVal) {

    int n = strVal.length();
    int[][] L = new int[n][n];
    for (int i = 0; i < n; i++)
      L[i][i] = 1;
    for (int subseqSize = 2; subseqSize <= n; subseqSize++) {
      for (int i = 0; i < n - subseqSize + 1; i++) {
        int j = i + subseqSize - 1;
        if (strVal.charAt(i) == strVal.charAt(j) && subseqSize == 2)
          L[i][j] = 2;
        else if (strVal.charAt(i) == strVal.charAt(j))
          L[i][j] = L[i + 1][j - 1] + 2;
        else
          L[i][j] = max(L[i + 1][j], L[i][j - 1]);
      }
    }

    return L[0][n - 1];

  }

  private static int max(int i, int j) {
    return (i > j) ? i : j;
  }
}