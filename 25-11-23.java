ar1 = arr[n//2:]
        for i in range(n//2):
                arr.insert(2*i+1,ar1[i])
                arr.pop(-1)
        return arr
