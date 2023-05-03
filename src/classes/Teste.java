package classes;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        try {
            FinanceDAO financeDAO = new FinanceDAO();
            
            //Inserindo registros
            Finance finance1 = new Finance(0, "Salário", 3000.00, new Date());
            Finance finance2 = new Finance(0, "Aluguel", -800.00, new Date());
            Finance finance3 = new Finance(0, "Supermercado", -200.00, new Date());
            Finance finance4 = new Finance(0, "Restaurante", -100.00, new Date());
            Finance finance5 = new Finance(0, "Gasolina", -80.00, new Date());

            financeDAO.insert(finance1);
            financeDAO.insert(finance2);
            financeDAO.insert(finance3);
            financeDAO.insert(finance4);
            financeDAO.insert(finance5);
            
            //Recuperando todos os registros
            List<Finance> finances = financeDAO.getAll();
            for (Finance finance : finances) {
                System.out.println(finance);
            }
            
            //Exemplo de atualização de registro
            Finance financeToUpdate = finances.get(0);
            financeToUpdate.setValue(3500.00);
            financeDAO.update(financeToUpdate);
            
            //Exemplo de exclusão de registro
            Finance financeToDelete = finances.get(1);
            financeDAO.delete(financeToDelete.getId());
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

