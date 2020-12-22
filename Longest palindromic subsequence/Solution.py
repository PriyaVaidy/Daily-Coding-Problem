def main():
    input_str = "'MAPTPTMTPA"
    subsequence = lps(input_str)
    print(subsequence)

def lps(strval):
    n=len(strval)
    L=[[0 for _ in range(n)]for _ in range(n)]
    for i in range(n):
        L[i][i]=1
    for subseqsize in range(2,n+1):
        for i in range(0,n-subseqsize+1):
            j=i+subseqsize-1
            if (strval[i]== strval[j] and subseqsize ==2):
                L[i][j]=2
            elif (strval[i]==strval[j]):
                L[i][j]=L[i+1][j-1]+2
            else:
                L[i][j]= max(L[i+1][j],L[i][j-1])
    return L[0][n-1]

if __name__ == "__main__":
    main()