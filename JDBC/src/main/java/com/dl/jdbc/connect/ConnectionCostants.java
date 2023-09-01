package com.dl.jdbc.connect;

public interface ConnectionCostants {
	
	public static final String SQL_URL = "jdbc:mysql://localhost:3306/jdbc101";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root";
	
	public static class User1 {
        public static final int ID = 103;
        public static final String USER_NAME = "Hansna Kriiti";
        public static final String ADDRESS = "OGL";
        public static final int AGE = 3;
    }
	
	public static class User12 {
		public static final int ID = 102;
        public static final String USER_NAME = "Amulya";
        public static final String ADDRESS = "HYD";
        public static final int AGE = 25;
    }

}
