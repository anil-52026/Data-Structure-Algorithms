package POTD;

public class DetermineifaCellIsReachableataGivenTime {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {

        // due to too much high constraint we can get TLE
        // Direct think Optimal Approach

        int HoriZontalDis = Math.abs(fy-sy);
        int VerticalDis = Math.abs(fx-sx);

        // Start and Finish cell same ho & t=1 return false
        if(HoriZontalDis == 0 && VerticalDis == 0 && t==1){
            return false;
        }

        // find min_time
        int min_time = Math.max(HoriZontalDis,VerticalDis);

        if(t<min_time){
            return false;
        }
        return true;
    }
}
