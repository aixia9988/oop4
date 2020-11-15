public class ShopOffer {

    /**
     * Hur många varor som köps
     */
    int amount;
    /**
     * Den totala kostnaden för varor
     */
    double totalCost;

    /**
     * Rabatt i procent
     */
    int offInPercents;
    /**
     * riktaga kostnad efter rabatten
     */
    double actualPaid;

    public ShopOffer(int amount1, double totalCost1) {
        this.amount = amount1;
        this.totalCost = totalCost1;
    }

    /**
     * @return antal varor som köps
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Ställ in mänga vavor som ska köpas
     *
     * @param amount
     */
    public void setAmount(int amount)
    {
        this.amount = amount;
    }

    /**
     * @return totalkostnad för vavor
     */
    public double getTotalCost()
    {
        return totalCost;
    }

    /**
     * Ställ in den totala kostnaden för vavor
     *
     * @param totalCost
     */
    public void setTotalCost(double totalCost)
    {
        this.totalCost = totalCost;
    }

    /**
     * @return rabatter i procent
     */
    public int getOffInPercents()
    {
        return offInPercents;
    }

    /**
     * Ställ in diskonteringsräntan i procent
     *
     * @param offInPercents
     */
    public void setOffInPercents(int offInPercents)
    {
        this.offInPercents = offInPercents;
    }

    /**
     * @return Den riktiga kostnaden för betald
     */
    public double getActualPaid()
    {
        return actualPaid;
    }

    /**
     * Ställ in den riktiga kostnaden för betalningen
     *
     * @param actualPaid
     */
    public void setActualPaid(double actualPaid)
    {
        this.actualPaid = actualPaid;
    }

    /**
     * Beräkna rabatterna baserat på antalet varor som ska köpas:
     * 1. om beloppet är lika med 1 är diskonteringsräntan 11%
     * 2. om beloppet är lika med eller större än 2, är diskonteringsräntan 22%
     * 3. Ingen ränta kommer att tillhandahållas om beloppet är mindre än 1
     */
    public void calculate() {
        if (this.amount == 1) {
            this.setOffInPercents(11);
            double actualCost = (1 - 0.11) * this.totalCost;
            this.setActualPaid(actualCost);

        } else if (this.amount >= 2) {
            this.setOffInPercents(22);
            double actualCost = (1 - 0.22) * this.totalCost;
            this.setActualPaid(actualCost);
        } else {
            this.setOffInPercents(0);
            this.setActualPaid(this.totalCost);
        }

    }
}
