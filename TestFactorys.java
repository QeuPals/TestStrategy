/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.testfactorys;

public class TestFactorys {


    abstract static class Laptop {
        public abstract int getRAM();
        public abstract int getSSD();
        public abstract String getCPU();

        @Override
        public String toString() {
            return "RAM=" + this.getRAM() + "GB, SSD=" + this.getSSD() + ", CPU=" + this.getCPU();
        }
    }

    static class Minimum extends Laptop {
        private int RAM;
        private int SSD;
        private String CPU;

        public Minimum(int ram, int ssd, String cpu) {
            this.RAM = ram;
            this.SSD = ssd;
            this.CPU = cpu;
        }

        @Override
        public int getRAM() {
            return this.RAM;
        }

        @Override
        public int getSSD() {
            return this.SSD;
        }

        @Override
        public String getCPU() {
            return this.CPU;
        }
    }

    static class Recommended extends Laptop {
        private int RAM;
        private int SSD;
        private String CPU;

        public Recommended(int ram, int ssd, String cpu) {
            this.RAM = ram;
            this.SSD = ssd;
            this.CPU = cpu;
        }

        @Override
        public int getRAM() {
            return this.RAM;
        }

        @Override
        public int getSSD() {
            return this.SSD;
        }

        @Override
        public String getCPU() {
            return this.CPU;
        }
    }

    static class LaptopFactory {
        public static Laptop getSpecs(String type, int ram, int ssd, String cpu) {
            if (type.equalsIgnoreCase("min")) {
                return new Minimum(ram, ssd, cpu);
            } else if (type.equalsIgnoreCase("reco")) {
                return new Recommended(ram, ssd, cpu);
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Laptop min = LaptopFactory.getSpecs("min", 8, 256, "i5-12450Hz");

        Laptop reco = LaptopFactory.getSpecs("reco", 16, 512, "i7-12700Hz");

        
        System.out.println("Minimum Specs:");
        System.out.println(min.toString());
        System.out.println("Recommended Specs:");
        System.out.println(reco.toString());
    }
}
