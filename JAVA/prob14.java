/* Define a Class Atom with the foll details
Data members: protons(int), neutrons(int), electrons(int).
Data methods: Constructor()-> to initialize data, setData()-> to set user Data, getData()-> to display data, isIon()-> if atom is ion or not, getAtomicMass()-> return Atomic
Mass of the atom.
*/
import java.util.*;
class Atom{
	Scanner in = new Scanner(System.in);
	int protons,neutrons,electrons;

	Atom(){
		protons = 1;
		neutrons = 0;
		electrons = 1;
	}
	void setData(){
		System.out.println("Enter the number of Protons");
		protons = in.nextInt();
		System.out.println("Enter the number of Electrons");
		electrons = in.nextInt();
		System.out.println("Enter the number of Neutrons");
		neutrons = in.nextInt();
	}

	void getData(){
		System.out.println("Is this atom an ion? "+isIon());
		System.out.println("Atomic Mass of this Atom "+getAtomicMass());
	}

	int getAtomicMass(){
		return protons+neutrons;
	} 
	boolean isIon(){
		if (protons!=electrons) {
			return true;
		}else{
			return false;
		}
	} 
}
public class prob14{
	public static void main(String[] args) {
		Atom a = new Atom();
		a.setData();
		a.getData();
	}
}
