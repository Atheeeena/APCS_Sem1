public class Schedule{
    private Appointment[][] sched;

    /**
     * Returns the index of a column containing  the fewest occurences
     * of the status indicated by the parameter target
     * Preconditions: sched is not null and no elements of sched are null.
     *                sched has at least one row and at least one column.
     */
    public int columnWithFewest(String target){
        int min = sched[0].length;
        int columnWithFewest = 0;
        for(int c = 0; c < sched[0].length; c++) {
            int columnTotal = 0;
            for(int x : sched[c]) {
                if(x.equals(target)) {
                    columnTotal++;
                }
            }
            if(columnTotal < min) {
                columnWithFewest = c;
            }
        }
        return columnWithFewest;
    }

    /* There may be instance variables, constructors, and methods
        that are not shown */
}