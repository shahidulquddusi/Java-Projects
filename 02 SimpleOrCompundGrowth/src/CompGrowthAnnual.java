class CompGrowthAnnual {
    float growthRate;
    double principal;
    float periodInYears;

    public CompGrowthAnnual(float growthRate, double principal, float periodInYears) {
        this.growthRate = growthRate;
        this.principal = principal;
        this.periodInYears = periodInYears;
    }

    double totalGrowth(/*float growthRate, double principal, float numOfYears*/) {
        return principal * (Math.pow( 1 + growthRate/100, periodInYears)-1);
    }

    double futureValue(/*float growthRate, double principal, float numOfYears*/) {
        return principal * Math.pow( 1 + growthRate/100, periodInYears) ;
    }
}
