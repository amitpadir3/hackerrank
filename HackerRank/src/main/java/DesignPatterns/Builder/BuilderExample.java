package DesignPatterns.Builder;

class PC {
    private String price;
    private String ram;
    private String hdd;

    private PC(PCBuilder pcBuilder) {
        hdd = pcBuilder.hdd;
        ram = pcBuilder.ram;
        price = pcBuilder.price;
    }

    public String getPrice() {
        return price;
    }

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    @Override
    public String toString() {
        return "PC{" +
                "price='" + price + '\'' +
                ", ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                '}';
    }

    static class PCBuilder {
        private String price;
        private String ram;
        private String hdd;

        public PCBuilder(String price) {
            this.price = price;
        }

        public PCBuilder withPrice(String price) {
            this.price = price;
            return this;
        }


        public PCBuilder withRam(String ram) {
            this.ram = ram;
            return this;
        }


        public PCBuilder withHDD(String hdd) {
            this.hdd = hdd;
            return this;
        }

        public PC Build() {
            return new PC(this);
        }
    }
}

public class BuilderExample {
    public static void main(String ar[]) {
        PC pc = new PC.PCBuilder("12000").withHDD("512").withRam("12").Build();
        System.out.println(pc);
    }
}

