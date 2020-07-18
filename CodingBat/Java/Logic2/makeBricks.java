public boolean makeBricks(int small, int big, int goal) {
 if((small + big*5) < goal || goal%5>small) return false;
 return true;
}

/*DISCLAIMER: I did have to seek help for this problem. However, learning from
the creator of the problem, Nick Parlante, was helpful in changing the way I think.

I usually try to solve these problems by analyzing how it could succeed and failing
is the default, but flipping it around was helpful and I'll continue to employ this
strategy.

*/