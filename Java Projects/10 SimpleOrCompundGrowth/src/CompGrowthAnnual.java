class CompGrowthAnnual {
    float growthRate;
    long principal;
    float numOfYears;

    public CompGrowthAnnual(float growthRate, long principal, float numOfYears) {
        this.growthRate = growthRate;
        this.principal = principal;
        this.numOfYears = numOfYears;
    }

    double totalGrowth() {
        return principal * (Math.pow( 1 + growthRate/100, numOfYears)-1);
    }

    double futureValue() {
        return principal * Math.pow( 1 + growthRate/100, numOfYears) ;
    }
}
