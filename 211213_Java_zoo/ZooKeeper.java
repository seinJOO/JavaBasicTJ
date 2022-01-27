package Java20211213zoo;

public class ZooKeeper {
	
    //	public void feed(Tiger tiger) {		//Tiger 자료형만 여기에 올 수 있음
    //		System.out.println("feed apple");
    //	}
    //	public void feed(Lion lion) {
    //		System.out.println("feed banana");
    //	}
    //	public void feed(Donkey donkey) {
    //		System.out.println("feed carrot");
    //	}
        
        // 객체가 한 개 이상의 자료형 타입을 갖게 되는 특성을 다형성 이라고 함.
        
        public void feed(Predator predator) { //결국 Tiger, Lion 등은 모두 Predator의 자료형이기 때문에 이렇게 가능!
            System.out.println("feed " + predator.getFood());
        }
        
        public static void main(String[] args) {
            ZooKeeper zooKeeper = new ZooKeeper();
    		Tiger tiger = new Tiger();
    		Lion lion = new Lion();
    		Donkey donkey = new Donkey();
            
            zooKeeper.feed(tiger); // 위의 predator 자리가 tiger가 됨 -> Tiger의 getFood 호출
            zooKeeper.feed(lion);
            zooKeeper.feed(donkey);
        }
    
    }