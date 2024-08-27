public class Circle{
    public static void main(){
        public double x;
        public double y;
        public double radius;

        public void enlarge(double f){
            this.radius*=f;
        }

        public double getarea(){
            return this.radius*this.radius*Math.PI;
        }
    }
}