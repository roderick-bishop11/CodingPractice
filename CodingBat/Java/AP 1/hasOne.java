public boolean hasOne(int n) {
if(n/10 == 0 && n != 1) return false;
int last = n%10;
if(last == 1) return true;
return hasOne(n/10);
}

