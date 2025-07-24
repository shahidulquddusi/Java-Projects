class SimpleGrowth {
    float growthRate;
    long principal;
    float numOfYears;

    public SimpleGrowth(float growthRate, long principal, float numOfYears) {
        this.growthRate = growthRate;
        this.principal = principal;
        this.numOfYears = numOfYears;
    }

    double totalGrowth() {
        return principal * growthRate/100 * numOfYears;
    }

    double futureValue() {
        return principal * ( 1 + growthRate/100 * numOfYears) ;
    }
}
