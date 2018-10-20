import java.util.ArrayList;
import javax.swing.JOptionPane;


public class CourseImpl1 {

    public static void main(String[] args) {
        int cont = 0;
        ArrayList<Course1> curso = new ArrayList<Course1>();
        int opc = 0;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Elige la opcion deseada \n1.Crear curso\n2.Agregar Estudiante \n3.Eliminar Estudiante\n4.Mostrar Estudiante\n5.Mostar cantidad de estudiantes\n6.Salir del menu"));
            switch (opc) {
                case 1:
                    JOptionPane.showMessageDialog(null, " Crear curso ");
                    //crear curso
                    Course1 cursos = new Course1();
                    String nombre = JOptionPane.showInputDialog(null, "Nombre del curso :");
                    cursos.setCourseName(nombre);
                    curso.add(cursos);
                    cont++;
                    break;
                case 2:
                    boolean temp2 = false;
                    String students = " Hola";
                    ArrayList<String> alumnos = new ArrayList<String>();
                    String nombretemp = JOptionPane.showInputDialog(null, " Agregar estudiante. \n Escriba el nombre del curso");
                    //eliminar
                    for (int i = 0; i < curso.size(); i++) {
                        if (curso.get(i).getCourseName().equals(nombretemp)) {
                            while (!students.equals("")) {
                                students = JOptionPane.showInputDialog(null, "Ingrese el nombre. Deje en blanco si desea terminar");
                                if (students.equals("")) {
                                } else {
                                    alumnos.add(students);
                                }
                            }
                            for (int j = 0; j < alumnos.size(); j++) {
                                curso.get(i).addStudent(alumnos.get(j));
                            }
                            temp2 = true;
                        }
                    }
                    if (!temp2) {
                        JOptionPane.showMessageDialog(null, "No se encontro el curso: " + nombretemp);
                    }
                    break;
                case 3:
                    boolean temp3 = false;
                    String nombrec = JOptionPane.showInputDialog(null, " Eliminar estudiante. \n Escriba el nombre del curso");
                    //eliminar
                    for (int i = 0; i < curso.size(); i++) {
                        if (curso.get(i).getCourseName().equals(nombrec)) {
                            curso.get(i).dropStudent(JOptionPane.showInputDialog(null, "nombre del estudiante: "));
                            temp3 = true;
                        }
                    }
                    if (!temp3) {
                        JOptionPane.showMessageDialog(null, "No se encontro el curso: " + nombrec);
                    }
                    break;
                case 4:
                    boolean temp4 = false;
                    //mostrar estudiantes
                    String nombre2 = JOptionPane.showInputDialog(null, " Mostrar estudiantes. \n Escriba el nombre del curso");
                    for (int i = 0; i < curso.size(); i++) {
                        if (curso.get(i).getCourseName().equals(nombre2)) {



                            ArrayList<String> curso_temp = new ArrayList<String>();
                            curso.get(i).getStudents().equals(curso_temp);

                            for (int j = 0; j < curso_temp.size(); j++) {
                                System.out.println(curso_temp.get(j));
                            }
                            temp4 = true;
                        }
                    }
                    if (!temp4) {
                        JOptionPane.showMessageDialog(null, "No se encontro el curso: " + nombre2);
                    }
                    break;
                case 5:
                    boolean temp5 = false;
                    //mostrar numero de estudiantes
                    String nombre3 = JOptionPane.showInputDialog(null, " Mostrar número de estudiantes. \n Escriba el nombre del curso");
                    for (int i = 0; i < curso.size(); i++) {
                        if (curso.get(i).getCourseName().equals(nombre3)) {
                            System.out.println(curso.get(i).getNumberOfStudents());
                            temp5 = true;
                        }
                    }
                    if (!temp5) {
                        JOptionPane.showMessageDialog(null, "No se encontro el curso: " + nombre3);
                    }
                    break;
                default:
                    if(opc != 6){
                        JOptionPane.showMessageDialog(null, " Eliga una opcion correcta");
                    } else {
                        JOptionPane.showMessageDialog(null, "Adios");
                    }
            }
        } while (opc != 6);

    }
}
