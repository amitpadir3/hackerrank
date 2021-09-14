package Map;

class Emp {
    String id;
    String name;

    Emp(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null && obj.getClass() != this.getClass())
            return false;
        if (obj == this)
            return true;

        Emp e = (Emp) obj;
        return (e.getName().equals(this.getName()) && e.getId() == this.getId());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Integer.valueOf(id);
        result = prime * result + (name == null ? 0 : name.hashCode());
        return result;
    }
}