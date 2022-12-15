package bunchbycycles;

// public class Main {
//   static class CountsByUsage {
//     public int lowCount = 0;
//     public int mediumCount = 0;
//     public int highCount = 0;
//   };

//   static CountsByUsage countBatteriesByUsage(int[] cycles) {
//     CountsByUsage counts = new CountsByUsage();
//     return counts;
//   }

  static void testBucketingByNumberOfCycles(int[] a) {
    int lc=0,med=0,high=0;
//     System.out.println("Counting batteries by usage cycles...\n");
//     CountsByUsage counts = countBatteriesByUsage(new int[] {100, 300, 500, 600, 900, 1000});
//     assert(counts.lowCount == 2);
//     assert(counts.mediumCount == 3);
//     assert(counts.highCount == 1);
//     System.out.println("Done counting :)\n");
       for(int i=0;i<a.length;i++){
       if(a[i]<310)
         lc++;
       else if(a[i]>310 && a[i]<929)
         med++;
       else if([i]>=930)
         high++;
       }
       Sysetm.out.println("Number of batteries classfied as low",lc);
       Sysetm.out.println("Number of batteries classfied as medium",med);
       Sysetm.out.println("Number of batteries classfied as high",high);    
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in));
    System.out.println("Enter number of batteries:");
    int n=sc.nextInt();
    int[] a1=new int[n];
    for(int i=0;i<n;i++)
     {
        a1[i]=sc.nextInt();
     }
    
    testBucketingByNumberOfCycles(a1);

  }
}
