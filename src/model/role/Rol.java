package model.role;

public enum Rol {
    ADMIN,
    GUEST,
    MEMBER,
    OWNER;

    @Override
    public String toString() {
        return "Rol{} " + super.toString();
    }

    public boolean equals(Rol other){
        boolean rta = false;
        if(this.name()==other.name()){
            rta = true;
        }
            return rta;

    }
}
