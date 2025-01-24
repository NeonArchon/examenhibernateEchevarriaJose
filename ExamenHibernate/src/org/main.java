public class main {
    public static void main(String[] args) {
        EmpresaDAO empresaDAO = new EmpresaDAO();

        // Crear e insertar empleados
        Empresa empleado1 = new Empresa("12345678", "Juan Lopez", "yabadaba@gmail.com", "Ventas");
        Empresa empleado2 = new Empresa("11223344", "Alberto Perex", "AlPerex@gmail.com", "Marketing");
        Empresa empleado3 = new Empresa("22446688", "Juana Iguana", "Iguana@gmail.com", "Publicidad");

        empresaDAO.insertarEmpleado(empleado1);
        empresaDAO.insertarEmpleado(empleado2);
        empresaDAO.insertarEmpleado(empleado3);

        // Mostrar empleados
        List<Empresa> empleados = empresaDAO.obtenerEmpleados();
        for (Empresa empleado : empleados) {
            System.out.println("ID: " + empleado.getId_empleado() +
                    ", Nombre: " + empleado.getNombre() +
                    ", Email: " + empleado.getEmail() +
                    ", Departamento: " + empleado.getDepartamento());
        }
    }
}