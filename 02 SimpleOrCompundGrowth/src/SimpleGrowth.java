class SimpleGrowth {
    float growthRate;
    double principal;
    float periodInYears;

    public SimpleGrowth(float growthRate, double principal, float periodInYears) {
        this.growthRate = growthRate;
        this.principal = principal;
        this.periodInYears = periodInYears;
    }

    double totalGrowth(/*float growthRate, double principal, float periodInYears*/) {
        return principal * growthRate/100 * periodInYears;
    }

    double futureValue(/*float growthRate, double principal, float periodInYears*/) {
        return principal * ( 1 + growthRate/100 * periodInYears) ;
    }
}
