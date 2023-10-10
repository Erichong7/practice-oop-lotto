package lotto.view;

import java.util.ArrayList;
import java.util.List;

public class InputWinningNumbers extends Input {
    private static final String INPUT_MESSAGE = "당첨 번호를 입력해 주세요.";
    private static final int MAX_NUMBER = 45;
    private static final int MIN_NUMBER = 0;

    public List<Integer> getValue() {

        System.out.println(INPUT_MESSAGE);
        String userInput = input();
        List<Integer> winningNumberList = userInputToWinningNumberList(userInput);
        System.out.println();

        return winningNumberList;
    }

    private void validate(int number) {
        if(number > MAX_NUMBER) {
            throw new IllegalArgumentException("[ERROR] 잘못된 입력입니다.");
        } else if (number < MIN_NUMBER) {
            throw new IllegalArgumentException();
        }
    }

    private List<Integer> userInputToWinningNumberList(String userInput) {
        List<Integer> winningNumberList = new ArrayList<>();

        String[] inputNumbers = userInput.split(",");
        for(String number : inputNumbers) {
            int winningNumber = Integer.parseInt(number);
            validate(winningNumber);
            winningNumberList.add(winningNumber);
        }

        return winningNumberList;
    }
}
