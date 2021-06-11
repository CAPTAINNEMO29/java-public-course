package Utilidades;

public class Persona implements java.io.Serializable {

    private String m_nombre, m_apellidos, m_telefono, m_email;

    public Persona() {
    }

    public Persona(String a, String b, String c, String d) {

        m_nombre = a;

        m_apellidos = b;

        m_telefono = c;

        m_email = d;

    }

    public String Obtener_Nombre() {
        return m_nombre;
    }

    public String Obtener_Apellidos() {
        return m_apellidos;
    }

    public String Obtener_Telefono() {
        return m_telefono;
    }

    public String Obtener_Email() {
        return m_email;
    }

}
