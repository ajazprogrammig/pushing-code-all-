package __CompositePK_AJAZ.Enity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Account1 {
private String accuHolder;
private String branch;
@EmbeddedId
private Accountpk accountpk;
public String getAccuHolder() {
	return accuHolder;
}
public void setAccuHolder(String accuHolder) {
	this.accuHolder = accuHolder;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public Accountpk getAccountpk() {
	return accountpk;
}
public void setAccountpk(Accountpk accountpk) {
	this.accountpk = accountpk;
}
@Override
public String toString() {
	return "Account1 [accuHolder=" + accuHolder + ", branch=" + branch + ", accountpk=" + accountpk + "]";
}

}
