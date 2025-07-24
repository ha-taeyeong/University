package practice3;

class OracleDB implements DataAccessObject {
    private String dbName;

    public OracleDB(String dbName) {
        this.dbName = "Oracle DB";
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
