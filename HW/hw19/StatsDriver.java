public class StatsDriver {
    
    public static void main(String[] args) {
	System.out.println("======= mean(6,10) and mean(6.5,9.5) =======");
	System.out.println(Stats.mean(6,10)); //Output 8
	System.out.println(Stats.mean(6.5,9.5)); //Output 8.0
	System.out.println("======= max(9,10) and max(1239.23,1231.123) =======");
	System.out.println(Stats.max(9,10)); //Output 10
	System.out.println(Stats.max(1239.23,1231.123)); //Output 1239.23
	System.out.println("======= geomean(3,27) and geoMean(3.0,27.0) =======");
	System.out.println(Stats.geoMean(3,27)); //Output 9
	System.out.println(Stats.geoMean(3.0,27.0)); //Output 9
	System.out.println("======= geoMean(-3.0,27.0) =======");
	System.out.println(Stats.geoMean(-3.0,27.0)); //Output NaN
	System.out.println("======= geoMean(3,9,27) and geoMean(3.0,9.0,27.0) =======");
	System.out.println(Stats.geoMean(3,9,27)); //Output 8
	System.out.println(Stats.geoMean(3.0,9.0,27.0)); //Output 8.999999
	System.out.println("======= max(13,2,4) and max(13.0,23.1,132.23) =======");
	System.out.println(Stats.max(13,2,4)); //Output 13
	System.out.println(Stats.max(13.0,23.1,132.23)); //Output 132.23
	System.out.println("======= gcd(a,b) =======");
	System.out.println(Stats.gcd(15,20)); //5
	System.out.println(Stats.gcd(10,42)); //2
	System.out.println("======= gcdER(a,b) =======");
	System.out.println(Stats.gcdER(15,20)); //5
	System.out.println(Stats.gcdER(10,42)); //2
	System.out.println("======= gcdEW(a,b) =======");
	System.out.println(Stats.gcdEW(15,20)); //5
	System.out.println(Stats.gcdEW(10,42)); //2
    }
}
