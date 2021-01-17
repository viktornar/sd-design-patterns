package sd.design.patterns.simplified.examples.factory.method;

public class Main {
    public static void main(String... args) {
        Car car = CarFactory.createCar();
    }

    static class CarFactory {
        public static Car createCar() {
            Light light = new Light();
            Chair chair = new Chair();
            Tires tires = new Tires();
            Wheel wheel = new Wheel(tires);
            return new Car(wheel, chair, light);
        }
    }

    static class Car {
        private Wheel w;
        private Chair c;
        private Light l;

        public Car(Wheel w, Chair c, Light l) {

            this.w = w;
            this.c = c;
            this.l = l;
        }
    }

    static class Wheel {
        private Tires t;

        public Wheel(Tires t) {

            this.t = t;
        }
    }

    static class Chair {

    }

    static class Light {

    }

    static class Tires {

    }
}

