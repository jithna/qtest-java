package anusha;

 class Student {
		private String name;
		public String getName() {
			return name;
		}
	public void setName(String name) {
		this.name=name;
	}
	}
	 class encapsulation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s=new Student();
s.setName("anu");
System.out.println(s.getName());

	}

}
