package practice3;

class MySqlDB implements DataAccessObject {
    private String dbName;

    public MySqlDB(String dbName) {
        this.dbName = "MySql DB";
    }
    @Override
    public void select() {
        System.out.println(dbName + "에서 검색");
    }
    @Override
    public void insert() {
        System.out.println(dbName + "에 삽입");
    }
    @Override
    public void update() {
        System.out.println(dbName + "를 수정");
    }
    @Override
    public void delete() {
        System.out.println(dbName + "에서 삭제");
    }
}
