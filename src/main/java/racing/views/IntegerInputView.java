package racing.views;

public class IntegerInputView extends InputView<Integer> {
    @Override
    protected Integer input() {
        return scanner.nextInt();
    }
}
