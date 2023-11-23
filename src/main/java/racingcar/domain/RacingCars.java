package racingcar.domain;

import java.util.Arrays;
import java.util.List;

public class RacingCars {

    private List<String> carsName;

    public RacingCars(String racingCarsName) {

        carsName = initializeCarsName(racingCarsName);
        validate(racingCarsName);
    }

    private List<String> initializeCarsName(String racingCarsName) {

        return Arrays.stream(racingCarsName.split(",")).toList();
    }

    private void validate(String racingCarsName) {

        //이름 영문이 아닌 경우 (공백인 경우도 여기 해당)
        //이름 5자 이상인 경우
    }
}
