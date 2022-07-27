package interface_test;

import org.jetbrains.annotations.NotNull;

public class Computer {
    public void powerOn(){
        System.out.println("开机");
    }
    public void powerOff(){
        System.out.println("关机");
    }
    public void useDevice(@NotNull USB usb){
        usb.open();
        if (usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;//向下转型，可访问接口实现类的特有方法
            mouse.click();
        }
        if (usb instanceof KeyBoard) {
            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.type();
        }
        usb.close();
    }
}
