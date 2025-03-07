


package vo;

public class Person {
	// private 같은 클래스 내부에서만 접근 가능
	// protected 같은 패키지, 상속관계에서만 접근 가능
		private String name;
		private float height;
		private float weight;
		

		public Person(String name) {
			this.name = name;
		}

		
		
		public Person () {}  // default constructor 
		
		public Person(String name, float height, float weight) {
			this.name = name;
			this.height = height;
			this.weight = weight;
			
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public float getHeight() {
			return height;
		}



		public void setHeight(float height) {
			this.height = height;
		}



		public float getWeight() {
			return weight;
		}



		public void setWeight(float weight) {
			this.weight = weight;
		}
	}
	
	
	

