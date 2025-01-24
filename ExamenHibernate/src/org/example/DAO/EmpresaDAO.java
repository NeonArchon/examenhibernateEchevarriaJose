package org.example.DAO;

public class EmpresaDAO {

   public void Empresa create (EmpresaDAO empleado){

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(empleado);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
   }

    public List<Empresa> obtenerEmpleados() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Empresa> query = session.createQuery("FROM Empresa", Empresa.class);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
