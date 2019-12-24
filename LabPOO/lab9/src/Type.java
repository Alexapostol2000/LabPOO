public class Type {
        Integer x;
        Integer y;
        Integer z;

        @Override
        public int hashCode() {
            return x*y*3/z;
        }

        public Type(Integer x, Integer y, Integer z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Type type = (Type) o;
        if(x != null  )
            if(type.x != null)
                if(x.equals(type.x))
                    return false;
        if(y != null  )
            if(type.y != null)
                if(y.equals(type.y))
                    return false;
        if(z != null  )
            if(type.z != null)
                if(z.equals(type.z))
                    return false;
        return true;
        }

        @Override
        public String toString() {
            return "Type{" +
                    "x=" + x +
                    ", y=" + y +
                    ", z=" + z +
                    '}';
        }
}
