package Les_7;

    public abstract class Plane {
        private int weight;
        private int width;
        private int length;
        public Plane(int weight, int width, int length){
            this.weight = weight;
            this.width = width;
            this.length = length;
        }
        public void engineStart(){
            System.out.println("Time Left For TakeOff - " + (int)(Math.random()*69+20) + " Seconds Remaining" );
        }
        public void planeTakeoff(){
            System.out.println("What Distance A Plane With A Full Tank Will Fly - " + (int)(Math.random()*1000+500) + " Km");
        }
        public void planeLanding(){
            System.out.println("Airplane Is Landing");
        }

    }
