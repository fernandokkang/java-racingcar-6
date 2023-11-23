package racingcar;

import racingcar.controller.GameController;
import racingcar.service.GameService;
import racingcar.service.GameServiceImpl;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {

        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        GameService gameService = new GameServiceImpl();
        GameController gameController = new GameController(inputView, outputView, gameService);
        gameController.run();
    }
}
