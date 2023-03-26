public class executive extends employee {
private int employeenumber;

public int getEmployeenumber() {
	return employeenumber;
}

public void setEmployeenumber(int employeenumber) {
	this.employeenumber = employeenumber;
}
public executive(String name,String surname,int id,int employeenumber){
	super(name, surname, id);
	this.employeenumber=employeenumber;
}
public void raise(int raisemoney) {
	System.out.println(getName()+" "+raisemoney+"$ make a raise");
}

@Override
public void showinfo() {
	// TODO Auto-generated method stub
	System.out.println("Number of employees :"+employeenumber);
	super.showinfo();
}

}