class SimpleGrowth {
    double growthRate;
    double principal;
    double numOfYears;

    public SimpleGrowth(double growthRate, double principal, double numOfYears) {
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
