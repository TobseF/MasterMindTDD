package de.tfr.dojo.mastermind;

import kotlin.io.ConsoleKt;

/**
 * Sample game template in Java.
 * Feel free to change or delete it.
 * <p>
 * Sample test: MindMasterTest
 * Kotlin version: MasterMind
 */
public class MindMaster {
    public static void main(String[] args) {
        MindMaster mindMaster = new MindMaster();
        mindMaster.runGame();
    }

    public String gameName() {
        return "Master Mind";
    }

    public String readLineFomConsole() {
        return ConsoleKt.readLine();
    }

    public void runGame() {
        System.out.println("Your Input:");
        String userInput = readLineFomConsole();
        System.out.println("Typed: " + userInput);
    }
}
