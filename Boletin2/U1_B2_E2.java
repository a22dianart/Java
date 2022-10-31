class U1_B2_E2{
	public static void main(String[] args){
		int x = 10;
		int y = 20;
		int z ;
		System.out.println("ANTES: x vale " +x+ " e y vale " +y);
        z=x;
        x=y;
        y=z;
        System.out.println("AGORA: x vale " +x+ " e y vale " +y);
	}
}
