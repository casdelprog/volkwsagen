package application.service;

import domain.model.CleaningRobot;

public class InstructionProcessor {
    public void processInstructions(CleaningRobot robot, String instructions) {
        for (char instruction : instructions.toCharArray()) {
            robot.executeInstruction(instruction);
        }
    }
}