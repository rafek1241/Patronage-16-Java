package BackEnd;

/**
 * Created by rszac on 17.12.2016.
 *
 * Klasa zawierająca deklarację ID
 */
public abstract class identificator {
private long Id;

public long getId(){
    return this.Id;
}
public void setId(long id){
    this.Id = id;
}

    @Override
    public int hashCode() {
        return Id != NULL ? Id.hashCode() : 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof identificator)) return false;

        identificator id = (identificator) obj;

        return(Id != NULL ? !Id.equals(id.Id) : id.Id != NULL);
    }
}
