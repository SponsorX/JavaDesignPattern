package strategy.example1;

public class DuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered()); //실행중에 오리의 행동을 바꾸고 싶으면 원하는 행동에 해당하는 Duck의 세터 메소드 호출...
		model.performFly();
	   
	}
}
