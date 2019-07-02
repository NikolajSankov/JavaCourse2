public class BuilderExample {
	private final int param1;
	private final int param2;
	private final int param3;
	private final int param4;
	
	public int getParam5() {
		return param5;
	}

	public void setParam5(int param5) {
		this.param5 = param5;
	}

	private int param5;
	
	public static class Builder {
		private int param1=0;
		private int param2=0;
		private int param3=0;
		private int param4=0;
		private int param5=0;
		
		
		@Override
		public String toString() {
			return "Builder [param1=" + param1 + ", param2=" + param2 + ", param3=" + param3 + ", param4=" + param4
					+ ", param5=" + param5 + "]";
		}
		public Builder(int param1, int param2) {
			this.param1=param1;
			this.param2=param2;
}
		public Builder param3(int param3) {
			this.param3=param3;
			return this;
	}
	
		public Builder param4(int param4) {
			this.param4=param4;
			return this;
		}
		public Builder param5(int param5) {
			this.param5=param5;
			return this;
		}
		public BuilderExample build() {
			return new BuilderExample(this);
		}
		
}
}
