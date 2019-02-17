public class Info {
    
    public static void main(String[] args) {
        System.out.println(" Employee Information ");
        
        Employee manajer = new manajer("Wida Mulyana", "Bandung", 5000000);
        Employee staffA = new staff("Melinda Muntiara","Bogor",4500000);
        Employee staffB = new staff("Desy Gustiabi","Jakarta",4500000);
        
        System.out.println("Nama mamajer    : " + manajer.getName());
        System.out.println("Alamat          : " + manajer.getAddress());
        System.out.println("Gaji            : " + manajer.getSalary());
        
        System.out.println("Nama StaffA     : " + staffA.getName());
        System.out.println("Alamat          : " + staffA.getAddress());
        System.out.println("Gaji            : " + staffA.getSalary());
        
        System.out.println("Nama Straff     : " + staffB.getName());
        System.out.println("Alamat          : " + staffB.getAddress());
        System.out.println("Gaji            : " + staffB.getSalary());
    }
}
