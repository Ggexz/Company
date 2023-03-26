public class softwaredev extends employee {
 private String lang;

public String getLang() {
	return lang;
}

public void setLang(String lang) {
	this.lang = lang;
}
public softwaredev(String name, String surname,int id,String lang) {
	super(name, surname, id);
	this.lang=lang;
}
public void reset(String OS) {
	System.out.println(getName()+" Mr./Mrs. is loading the "+""+OS+"");
}

@Override
public void showinfo() {
	// TODO Auto-generated method stub
	System.out.println("Languages ​​know by the developer : "+lang);
	super.showinfo();
}
}