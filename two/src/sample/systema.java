package sample;

import javafx.scene.control.TextField;

public class systema {

    public double nam1;
    public double nam2;
    public  double otvet;
    public char operand;

    int a = 0;
    public String stokaOnline;
    public String nam11 = "0";
    public boolean nam_lvl = true;

    public systema(double nam11, double nam22, char operand1) {
        this.nam2 = nam22;
        this.nam1 = nam11;
        this.operand = operand1;
    }
    public systema(){
    }

    public double kalk(double nam11, double nam22, char operand1) {
        switch (operand) {
            case ('+'):
                this.otvet = this.nam1 + this.nam2;
                break;
            case ('-'):
                this.otvet = this.nam1 - this.nam2;
                break;
            case ('*'):
                this.otvet = this.nam1 * this.nam2;
                break;
            case ('/'):
                this.otvet = this.nam1 / this.nam2;
                break;
        }
        return this.otvet;
    }
    public TextField one (TextField stoka) {
        if (this.nam_lvl) {
            this.stokaOnline = (stoka.getText().toString() + "1"); // то что есть в строке и + 1
            stoka.setText(stokaOnline);                           // меняем саму строку
            this.nam1 = Integer.valueOf(stoka.getText());          // нам 1 присваиваем то что в строке
            return stoka;

        } else { // если нажат был опаранд присваиваем с нам 2
            this.stokaOnline = (stoka.getText().toString() + "1"); // то что есть в строке и + 1
            stoka.setText(stokaOnline);                          // меняем саму строку
            //String nam22 = Integer.toString(this.nam2);
            this.nam11 += "1";                                    // запись в новую перемменную числа 1
            this.nam2 = Double.valueOf(nam11);                   // сделать переменную int запись в нам 2
            return stoka;
        }
    }
    public TextField two (TextField stoka) {
        if (this.nam_lvl) {
            this.stokaOnline = (stoka.getText().toString() + "2"); // то что есть в строке и + 1
            stoka.setText(stokaOnline);                           // меняем саму строку
            this.nam1 = Double.valueOf(stoka.getText());          // нам 1 присваиваем то что в строке
            return stoka;

        } else { // если нажат был опаранд присваиваем с нам 2
            this.stokaOnline = (stoka.getText().toString() + "2"); // то что есть в строке и + 1
            stoka.setText(stokaOnline);                          // меняем саму строку
            //String nam22 = Integer.toString(this.nam2);
            this.nam11 += "2";                                    // запись в новую перемменную числа 1
            this.nam2 = Double.valueOf(nam11);                   // сделать переменную int запись в нам 2
            return stoka;
        }


    }

    public TextField three (TextField stoka) {
        if (this.nam_lvl) {
            this.stokaOnline = (stoka.getText().toString() + "3"); // то что есть в строке и + 1
            stoka.setText(stokaOnline);                           // меняем саму строку
            this.nam1 = Double.valueOf(stoka.getText());          // нам 1 присваиваем то что в строке
            return stoka;

        } else { // если нажат был опаранд присваиваем с нам 2
            this.stokaOnline = (stoka.getText().toString() + "3"); // то что есть в строке и + 1
            stoka.setText(stokaOnline);                          // меняем саму строку
            //String nam22 = Integer.toString(this.nam2);
            this.nam11 += "3";                                    // запись в новую перемменную числа 1
            this.nam2 = Double.valueOf(nam11);                   // сделать переменную int запись в нам 2
            return stoka;
        }
    }
    public TextField four (TextField stoka) {
        if (this.nam_lvl) {
            this.stokaOnline = (stoka.getText().toString() + "4"); // то что есть в строке и + 1
            stoka.setText(stokaOnline);                           // меняем саму строку
            this.nam1 = Double.valueOf(stoka.getText());          // нам 1 присваиваем то что в строке
            return stoka;

        } else { // если нажат был опаранд присваиваем с нам 2
            this.stokaOnline = (stoka.getText().toString() + "4"); // то что есть в строке и + 1
            stoka.setText(stokaOnline);                          // меняем саму строку
            //String nam22 = Integer.toString(this.nam2);
            this.nam11 += "4";                                    // запись в новую перемменную числа 1
            this.nam2 = Double.valueOf(nam11);                   // сделать переменную int запись в нам 2
            return stoka;
        }
    }
    public TextField five (TextField stoka) {
        if (this.nam_lvl) {
            this.stokaOnline = (stoka.getText().toString() + "5"); // то что есть в строке и + 1
            stoka.setText(stokaOnline);                           // меняем саму строку
            this.nam1 = Double.valueOf(stoka.getText());          // нам 1 присваиваем то что в строке
            return stoka;

        } else { // если нажат был опаранд присваиваем с нам 2
            this.stokaOnline = (stoka.getText().toString() + "5"); // то что есть в строке и + 1
            stoka.setText(stokaOnline);                          // меняем саму строку
            //String nam22 = Integer.toString(this.nam2);
            this.nam11 += "5";                                    // запись в новую перемменную числа 1
            this.nam2 = Double.valueOf(nam11);                   // сделать переменную int запись в нам 2
            return stoka;
        }
    }
    public TextField six (TextField stoka) {
        if (this.nam_lvl) {
            this.stokaOnline = (stoka.getText().toString() + "6"); // то что есть в строке и + 1
            stoka.setText(stokaOnline);                           // меняем саму строку
            this.nam1 = Double.valueOf(stoka.getText());          // нам 1 присваиваем то что в строке
            return stoka;

        } else { // если нажат был опаранд присваиваем с нам 2
            this.stokaOnline = (stoka.getText().toString() + "6"); // то что есть в строке и + 1
            stoka.setText(stokaOnline);                          // меняем саму строку
            //String nam22 = Integer.toString(this.nam2);
            this.nam11 += "6";                                    // запись в новую перемменную числа 1
            this.nam2 = Double.valueOf(nam11);                   // сделать переменную int запись в нам 2
            return stoka;
        }
    }
    public TextField seven (TextField stoka) {
        if (this.nam_lvl) {
            this.stokaOnline = (stoka.getText().toString() + "7"); // то что есть в строке и + 1
            stoka.setText(stokaOnline);                           // меняем саму строку
            this.nam1 = Double.valueOf(stoka.getText());          // нам 1 присваиваем то что в строке
            return stoka;

        } else { // если нажат был опаранд присваиваем с нам 2
            this.stokaOnline = (stoka.getText().toString() + "7"); // то что есть в строке и + 1
            stoka.setText(stokaOnline);                          // меняем саму строку
            //String nam22 = Integer.toString(this.nam2);
            this.nam11 += "7";                                    // запись в новую перемменную числа 1
            this.nam2 = Double.valueOf(nam11);                   // сделать переменную int запись в нам 2
            return stoka;
        }
    }
    public TextField eight (TextField stoka) {
        if (this.nam_lvl) {
            this.stokaOnline = (stoka.getText().toString() + "8"); // то что есть в строке и + 1
            stoka.setText(stokaOnline);                           // меняем саму строку
            this.nam1 = Double.valueOf(stoka.getText());          // нам 1 присваиваем то что в строке
            return stoka;

        } else { // если нажат был опаранд присваиваем с нам 2
            this.stokaOnline = (stoka.getText().toString() + "8"); // то что есть в строке и + 1
            stoka.setText(stokaOnline);                          // меняем саму строку
            //String nam22 = Integer.toString(this.nam2);
            this.nam11 += "8";                                    // запись в новую перемменную числа 1
            this.nam2 = Double.valueOf(nam11);                   // сделать переменную int запись в нам 2
            return stoka;
        }
    }
    public TextField nine (TextField stoka) {
        if (this.nam_lvl) {
            this.stokaOnline = (stoka.getText().toString() + "9"); // то что есть в строке и + 1
            stoka.setText(stokaOnline);                           // меняем саму строку
            this.nam1 = Double.valueOf(stoka.getText());          // нам 1 присваиваем то что в строке
            return stoka;

        } else { // если нажат был опаранд присваиваем с нам 2
            this.stokaOnline = (stoka.getText().toString() + "9"); // то что есть в строке и + 1
            stoka.setText(stokaOnline);                          // меняем саму строку
            //String nam22 = Integer.toString(this.nam2);
            this.nam11 += "9";                                    // запись в новую перемменную числа 1
            this.nam2 = Double.valueOf(nam11);                   // сделать переменную int запись в нам 2
            return stoka;
        }
    }
    public TextField zero (TextField stoka) {
        if (this.nam_lvl) {
            this.stokaOnline = (stoka.getText().toString() + "0"); // то что есть в строке и + 1
            stoka.setText(stokaOnline);                           // меняем саму строку
            this.nam1 = Double.valueOf(stoka.getText());          // нам 1 присваиваем то что в строке
            return stoka;

        } else { // если нажат был опаранд присваиваем с нам 2
            this.stokaOnline = (stoka.getText().toString() + "0"); // то что есть в строке и + 1
            stoka.setText(stokaOnline);                          // меняем саму строку
            //String nam22 = Integer.toString(this.nam2);
            this.nam11 += "0";                                    // запись в новую перемменную числа 1
            this.nam2 = Double.valueOf(nam11);                   // сделать переменную int запись в нам 2
            return stoka;
        }
    }
    public TextField plus(TextField stoka) {
        if (nam_lvl) {       // если операнд еше не нажимался
            this.stokaOnline = stoka.getText().toString() + "+";        // добавляем  + в переменную

            stoka.setText(stokaOnline);                                // добавляем в строку содержание переменной
            this.operand = '+';                                    // операнд присваиваем +
            this.nam_lvl = false;                                 // нам лвл закрыт
            this.nam2 = 0;                                        // нам 2 обнуляем
            this.nam11 = "";                                      // обнуляем переменную строковую второго числа
        }
    return stoka;
    }

    public TextField minus(TextField stoka) {
        if (nam_lvl) {       // если операнд еше не нажимался
            this.stokaOnline = stoka.getText().toString() + "-";        // добавляем  + в переменную

            stoka.setText(stokaOnline);                                // добавляем в строку содержание переменной
            this.operand = '-';                                    // операнд присваиваем -
            this.nam_lvl = false;                                 // нам лвл закрыт
            this.nam2 = 0;                                        // нам 2 обнуляем
            this.nam11 = "";                                      // обнуляем переменную строковую второго числа
        }
        return stoka;
    }
    public TextField toShare (TextField stoka) {
        if (nam_lvl) {       // если операнд еше не нажимался
            this.stokaOnline = stoka.getText().toString() + ":";        // добавляем  + в переменную

            stoka.setText(stokaOnline);                                // добавляем в строку содержание переменной
            this.operand = '/';                                    // операнд присваиваем /
            this.nam_lvl = false;                                 // нам лвл закрыт
            this.nam2 = 0;                                        // нам 2 обнуляем
            this.nam11 = "";                                      // обнуляем переменную строковую второго числа
        }
        return stoka;
    }
    public TextField multiply (TextField stoka) {
        if (nam_lvl) {       // если операнд еше не нажимался
            this.stokaOnline = stoka.getText().toString() + "*";        // добавляем  + в переменную
        }
        stoka.setText(stokaOnline);                                // добавляем в строку содержание переменной
        this.operand = '*';                                    // операнд присваиваем *
        this.nam_lvl = false;                                 // нам лвл закрыт
        this.nam2 = 0;                                        // нам 2 обнуляем
        this.nam11 = "";                                      // обнуляем переменную строковую второго числа
        System.out.println(nam1);
        System.out.println(nam2);

        return stoka;
    }
    public TextField ravno (TextField stoka){ // если нажать равно
        this.otvet = kalk(nam1,nam2,operand);
        this.nam2 = 0;

        if (otvet % 1 == 0) { // если целоев число выводит целое
            int otvetint = (int) this.otvet;
            String otvet1 = Double.toString(otvetint);
            stoka.setText(otvet1);
            this.stokaOnline = stoka.getText().toString();
            this.nam_lvl = true;
            this.nam1 = Double.valueOf(String.format(stokaOnline,"%.2f" ));
            System.out.println(this.nam1);
            System.out.println(this.nam2);

        }else {

            String otvet1 = Double.toString(this.otvet);
            stoka.setText(otvet1);
            this.stokaOnline = stoka.getText().toString();

            this.nam_lvl = true;
            this.nam1 = Double.valueOf(String.format(stokaOnline,"%.1f" ));
            System.out.println(this.nam1);
            System.out.println(this.nam2);
         }
        return stoka;
    }
    public TextField c (TextField stoka){
        this.nam_lvl = true;
        this.nam1 = 0;
        this.nam2 = 0;
        this.stokaOnline = "";
        stoka.setText("");
        return stoka;
    }
    public TextField delite (TextField stoka){ // <-
        this.stokaOnline = stokaOnline.substring(0, stokaOnline.length() - 1);
        stoka.setText(stokaOnline);
        if (nam_lvl){
            this.nam1 = Double.valueOf(stokaOnline);

            }else if (nam_lvl == false) {
                this.nam11 = nam11.substring(0, nam11.length() - 1);
                this.nam2 = Double.valueOf(nam11);
            }
        return stoka;
        }

    public TextField Ndouble (TextField stoka){
        this.stokaOnline = (stokaOnline + ".");
        stoka.setText(stokaOnline);
        return stoka;
    }
}
