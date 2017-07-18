

public class Menu {
        private Logic hw = new Logic(Integer.class);

     void menu() {
            System.out.println("Какой размер листа вы хотите:\n" + "1.По умолчанию(16).\n" + "2.Ввести свой размер.");
            choiceSize();
            System.out.println(hw.getNumbers());
            System.out.println("1.Добавить число(Удалится первое число!)?\n" + "2.Выход");
            choiceInMenu();
        }

     private void choiceSize() {
            try {
                int size = Integer.parseInt(hw.getScn().next());
                switch (size) {
                    case 1:
                        hw.ifChoiceDefault();
                        break;
                    case 2:
                        hw.choice2();
                        break;
                    default:
                        System.out.println("Введите только 1 или 2!");
                        choiceSize();
                }
            }catch (NumberFormatException n){
                System.out.println("Вводить можно только число!");choiceSize();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


     private void choiceInMenu() {
            try {
                int choice = Integer.parseInt(hw.getScn().next());

                switch (choice) {
                    case 1:
                        hw.add();
                        System.out.println(hw.getNumbers());
                        System.out.println("1.Добавить число(Удалится первое число!)?\n" + "2.Выход");
                        choiceInMenu();

                        break;
                    case 2:
                        System.out.println("Выход...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Введите только 1 или 2!");
                        choiceInMenu();
                }
            }catch (NumberFormatException n){
                System.out.println("Вводить можно только число!");choiceInMenu();
            }}}





