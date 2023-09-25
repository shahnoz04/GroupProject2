package GroupProject2;
/*We have to calculate the average of marks obtained in three subjects
by student A and by student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning the average percentage
of marks. Provide implementation of abstract method in classes 'A'
and 'B'. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its
parameters for student B. Test your code
 */


    public abstract class Marks{
        abstract double getPercentage();
    }

    class A extends Marks{
        private double Mark1;
        private double Mark2;
        private double Mark3;

        public A(double math, double eng, double rus) {
           Mark1 = math;
           Mark2 = eng;
           Mark3 = rus;
        }

        @Override
        public double getPercentage() {
            return (Mark1+ Mark2 + Mark3) / 3;
        }
    }
    class B extends Marks {
        private double Mark1;
        private double Mark2;
        private double Mark3;
        private double Mark4;

        public B(double math, double eng, double rus, double taj) {
            Mark1 = math;
            Mark2 = eng;
            Mark3 = rus;
            Mark4 = taj;
        }

        @Override
        public double getPercentage() {
            return (Mark1 + Mark2 +  Mark3 +  Mark4) / 4;
        }
    }
    class Tester{
    public static void main(String[] args) {
        A a = new A(80, 95, 98);
        B b = new B(67, 45, 90, 70);

        System.out.println("A's percentage: " + a.getPercentage());
        System.out.println("B's percentage: " + b.getPercentage());
    }

    }



