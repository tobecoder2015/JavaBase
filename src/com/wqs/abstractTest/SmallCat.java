package com.wqs.abstractTest;

public class SmallCat extends CatClass {

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "这只猫叫"+this.name+",属"+this.catType+",今年"+this.age+"岁";
	}

	public SmallCat(String name, int age, String type) {
		super(name, age, type);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.wqs.abstractTest.Animal#run()
	 */
	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("小猫快跑！");
	}

	/* (non-Javadoc)
	 * @see com.wqs.abstractTest.Animal#feed()
	 */
	@Override
	protected void feed() {
		// TODO Auto-generated method stub
		System.out.println("给小猫喂食");
		
	}

	/* (non-Javadoc)
	 * @see com.wqs.abstractTest.Animal#bark()
	 */
	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("小猫叫！");
		
	}

}
