package main.behavioral.chain_of_responsibility;

import main.behavioral.chain_of_responsibility.constant.Operations;

public interface ResponsibilityChecker {

    boolean isValidResponsibilityForGivenOperation(Operations operations);
}
