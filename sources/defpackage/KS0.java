package defpackage;

import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class KS0 implements Serializable {
    public final String d;
    public final HashMap e;
    public final long g;

    public KS0(HS0 hs0) {
        this.d = hs0.e;
        this.e = new HashMap(hs0.h);
        this.g = hs0.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KS0)) {
            return false;
        }
        KS0 ks0 = (KS0) obj;
        if (this.g != ks0.g) {
            return false;
        }
        String str = ks0.d;
        String str2 = this.d;
        if (str2 != null) {
            if (!str2.equals(str)) {
                return false;
            }
        } else if (str != null) {
            return false;
        }
        HashMap map = this.e;
        HashMap map2 = ks0.e;
        if (map != null) {
            return map.equals(map2);
        }
        return map2 == null;
    }

    public final int hashCode() {
        String str = this.d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        HashMap map = this.e;
        int iHashCode2 = map != null ? map.hashCode() : 0;
        long j = this.g;
        return ((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "LoggerContextVO{name='" + this.d + "', propertyMap=" + this.e + ", birthTime=" + this.g + '}';
    }
}
