class Solution {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int playerMinMovesTarget = Math.abs(target[0]) + Math.abs(target[1]);
        Integer ghostMinMovesTarget = null;
        int ghostCurrMovesTarget = 0;
        

        for(int i = 0; i<ghosts.length;i++) {
            ghostCurrMovesTarget = 0;
            if(ghosts[i][0] < 0 && target[0] < 0) {
                ghostCurrMovesTarget += ghosts[i][0] >= target[0] ? -1*target[0] - -1*ghosts[i][0] :  -1*ghosts[i][0] - -1*target[0];
            } else if(ghosts[i][0] < 0) {
                ghostCurrMovesTarget += -1*ghosts[i][0] + target[0];
            } else if( target[0] < 0) {
                ghostCurrMovesTarget += ghosts[i][0] + -1* target[0];
            } else {
                ghostCurrMovesTarget += ghosts[i][0] >= target[0] ? ghosts[i][0] - target[0] : target[0] - ghosts[i][0];
            }
            if(ghosts[i][1] < 0 && target[1] < 0) {
                ghostCurrMovesTarget += ghosts[i][1] >= target[1] ? -1*target[1] - -1*ghosts[i][1] :  -1*ghosts[i][1] - -1*target[1];
            } else if(ghosts[i][1] < 0) {
                ghostCurrMovesTarget += -1*ghosts[i][1] + target[1];
            } else if( target[1] < 0) {
                ghostCurrMovesTarget += ghosts[i][1] + -1* target[1];
            } else {
                ghostCurrMovesTarget += ghosts[i][1] >= target[1] ? ghosts[i][1] - target[1] : target[1] - ghosts[i][1];
            }
            //System.out.println(ghostCurrMovesTarget);
            if (ghostMinMovesTarget == null || ghostMinMovesTarget > ghostCurrMovesTarget){
                ghostMinMovesTarget = ghostCurrMovesTarget;
            }

        }
        //System.out.println(playerMinMovesTarget);
        //System.out.println(ghostMinMovesTarget);
        return playerMinMovesTarget < ghostMinMovesTarget ? true : false;

    }
}