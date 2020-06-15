package entities;

public class Rectangle {
        public double largura;
        public double comprimento;

        public double area(){

            return largura*comprimento;
        }
        public double perimetro(){
            return 2*largura+2*comprimento;
        }

        public double diagonal(){
            comprimento*=comprimento;
            largura*=largura;
            return Math.sqrt(largura+comprimento);

        }

    }
