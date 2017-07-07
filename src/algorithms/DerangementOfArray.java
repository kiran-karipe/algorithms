package algorithms;

public class DerangementOfArray {
	public int findDerangement(int n) {
		final long mod = (long) (1e9 + 7);
		if(n == 0) {
			return 0;
		}
		long[] f = new long[n + 1];
		long[] g = new long[n + 1];
		f[1] = 0;
		g[1] = 1;
		for(int i=2; i<=n; i++) {
			f[i] = ((i-1) * g[i-1] % mod);
			g[i] = f[i-1] + (i-1) * g[i-1] % mod;
		}
		return (int)f[n] ;
	}
	
	public static void main(String args[]) {
		DerangementOfArray f = new DerangementOfArray();
		System.out.println(f.findDerangement(9999999));
	}
}
