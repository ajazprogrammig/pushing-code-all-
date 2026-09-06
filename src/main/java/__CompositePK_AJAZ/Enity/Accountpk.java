package __CompositePK_AJAZ.Enity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class Accountpk implements Serializable {
private Integer accuntId;
private String accontType;
private long acunum;
public Integer getAccuntId() {
	return accuntId;
}
public void setAccuntId(Integer accuntId) {
	this.accuntId = accuntId;
}
public String getAccontType() {
	return accontType;
}
public void setAccontType(String accontType) {
	this.accontType = accontType;
}
public long getAcunum() {
	return acunum;
}
public void setAcunum(long acunum) {
	this.acunum = acunum;
}
@Override
public String toString() {
	return "Accountpk [accuntId=" + accuntId + ", accontType=" + accontType + ", acunum=" + acunum + "]";
}


}
