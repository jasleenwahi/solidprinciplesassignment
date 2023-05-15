package com.knoldus.question5;

public class MakeMachine {
    public static void main(String[] args) {
        // creating a windows machine.
        WindowsMachine windowsMachine = new WindowsMachine(new WindowsKeyboard(), new WindowsMonitor());
    }
}
