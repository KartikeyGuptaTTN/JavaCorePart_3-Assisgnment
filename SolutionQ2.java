import java.util.*;

    class Worker implements Comparable<Worker> {
        private final Double yearsOld;
        private final Double compensation;
        private final String fullName;


        public Worker(Double yearsOld, Double compensation, String fullName) {
            this.yearsOld = yearsOld;
            this.compensation = compensation;
            this.fullName = fullName;
        }

        public Double getYearsOld() {
            return yearsOld;
        }

        public Double getCompensation() {
            return compensation;
        }

        public String getFullName() {
            return fullName;
        }

        public int compareTo(Worker other) {
            return this.fullName.compareTo(other.fullName);
        }

        public String toString() {
            return "{ Full Name: " + fullName + ", Years Old: " + yearsOld +
                    ", Compensation: " + compensation + " }";
        }
    }

    class CompensationComparator implements Comparator<Worker> {
        public int compare(Worker w1, Worker w2) {
            return w1.getCompensation().compareTo(w2.getCompensation());
        }
    }

    public class SolutionQ2 {
        public static void main(String[] args) {
            List<Worker> staffMembers = new ArrayList<>();
            staffMembers.add(new Worker(42.0, 85000.0, "Michael Wilson"));
            staffMembers.add(new Worker(29.0, 95000.0, "Sarah Davis"));
            staffMembers.add(new Worker(35.0, 78000.0, "Emma Thompson"));
            staffMembers.add(new Worker(31.0, 92000.0, "David Anderson"));

            Collections.sort(staffMembers);
            System.out.println("Staff Members sorted by Full Name:");
            System.out.println(staffMembers);

            staffMembers.sort(new CompensationComparator());
            System.out.println("\nStaff Members sorted by Compensation:");
            System.out.println(staffMembers);
        }
    }
