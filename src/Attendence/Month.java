package Attendence;

public class Month {
        String montNmae;
        int days;
        int totalDays;

        @Override
        public String toString() {
                return "Month{" +
                        "montNmae='" + montNmae + '\'' +
                        ", days=" + days +
                        ", totalDays=" + totalDays +
                        '}';
        }

        public Month(String montNmae, int days, int totalDays) {
                this.montNmae = montNmae;
                this.days = days;
                this.totalDays = totalDays;
        }
}
