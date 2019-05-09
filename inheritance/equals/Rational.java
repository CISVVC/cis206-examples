public class Rational
{
   private int num;
   private int denom;

   Rational(int num,int denom)
   {
      this.num = num;
      this.denom = denom;
   }

   public boolean equals(Rational toCompare)
   {
      return this.num == toCompare.num && this.denom == toCompare.denom;
   }
}

