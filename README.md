# 자동차 경주 게임

## 진행 방법

* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## Step3 - 자동차 경주 기능 목록

* 사용자 입력
    * 사용자는 자동차 대수를 입력할 수 있다.
    * 사용자는 이동할 횟수를 입력할 수 있다.
* 주어진 횟수만큼 경기를 진행한다.
    * 사용자가 입력한 횟수만큼 경기를 진행했는지 확인한다.
    * 남은 경기가 있으면 경기를 진행한다.
* 자동차는 전진할 수 있다.
    * 전진하는 조건은 0에서 9 사이의 숫자 중 랜덤한 값을 구해 결정한다.
    * 랜덤한 값이 4 이상인 경우 전진한다.
* 자동차의 상태를 화면에 출력할 수 있다.

## Step 4 - 자동차 경주(우승자) 기능 목록

* 각 자동차에 이름을 부여할 수 있다.
    * 자동차 이름은 5자를 초과할 수 없다.
    * 자동차 이름은 쉼표(,)를 기준으로 구분한다.
* 자동차 경주 게임을 완료한 후, 누가 우승했는지 알려준다.
    * 우승자는 한 명 이상일 수 있다.
* 자동차 상태를 출력할 때, 자동차 이름도 같이 출력한다.

## 온라인 코드 리뷰 과정

* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)