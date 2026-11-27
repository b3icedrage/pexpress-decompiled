package defpackage;

/* JADX INFO: renamed from: fp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3864fp0 {
    public final Class<?> a;
    public final String b;

    public C3864fp0(Class<?> cls, String str) {
        this.a = cls;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3864fp0.class != obj.getClass()) {
            return false;
        }
        C3864fp0 c3864fp0 = (C3864fp0) obj;
        Class<?> cls = c3864fp0.a;
        Class<?> cls2 = this.a;
        if (cls2 == null) {
            if (cls != null) {
                return false;
            }
        } else if (!cls2.equals(cls)) {
            return false;
        }
        String str = c3864fp0.b;
        String str2 = this.b;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Class<?> cls = this.a;
        int iHashCode = ((cls == null ? 0 : cls.hashCode()) + 31) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
