package interface_test;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        USB mouse = new Mouse();
        USB keyBoard = new KeyBoard();
        computer.powerOn();
        computer.useDevice(mouse);
        computer.useDevice(keyBoard);
        computer.powerOff();
    }
}
