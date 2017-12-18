public class Kill
{
  private int enrage;
  private int streak;
  private int lotd;
  
  public Kill(int enr, int s, bool l)
  {
    enrage = enr;
    streak = s;
    lotd = ((l == True) ? 25 : 0);
  }
  
  public int dropdenom()
  {
    int chance = Math.floor(10000/(10+0.25*(enrage+lotd)+3*streak))
    if(enrage < 100)
      chance *= 10;
    if(enrage < 25)
      chance *= 3;
    return Math.max(9, chance);
  }
}
