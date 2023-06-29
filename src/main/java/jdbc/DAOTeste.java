package jdbc;

public class DAOTeste {
    public static void main(String[] args) {

        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        System.out.println(dao.incluir(sql,"Lionel Messi"));
        System.out.println(dao.incluir(sql, "Cristiano Ronaldo"));
        System.out.println(dao.incluir(sql, "Neymar Junior"));

        dao.close();
    }
}
