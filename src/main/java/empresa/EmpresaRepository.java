package empresa;

import java.util.ArrayList;

public class EmpresaRepository {
	static ArrayList<Empresa> empresas = new ArrayList<>();
	
	public static boolean addEmpresa(Empresa empresa) {
		return empresas.add(empresa);
	}
	
	public static ArrayList<Empresa> getEmpresas() {
		return empresas;
	}

}