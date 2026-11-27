package defpackage;

import com.google.android.gms.common.api.Api;
import java.io.Serializable;

/* JADX INFO: renamed from: oP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5714oP0 implements Serializable {
    public static final C5714oP0 g = new C5714oP0(Api.BaseClientBuilder.API_PRIORITY_OTHER, "OFF");
    public static final C5714oP0 h = new C5714oP0(40000, "ERROR");
    public static final C5714oP0 i = new C5714oP0(30000, "WARN");
    public static final C5714oP0 j = new C5714oP0(20000, "INFO");
    public static final C5714oP0 k = new C5714oP0(10000, "DEBUG");
    public static final C5714oP0 l = new C5714oP0(5000, "TRACE");
    public static final C5714oP0 m = new C5714oP0(Integer.MIN_VALUE, "ALL");
    public final int d;
    public final String e;

    public C5714oP0(int i2, String str) {
        this.d = i2;
        this.e = str;
    }

    public static C5714oP0 a(String str) {
        C5714oP0 c5714oP0 = k;
        if (str != null) {
            if (str.equalsIgnoreCase("ALL")) {
                return m;
            }
            if (str.equalsIgnoreCase("TRACE")) {
                return l;
            }
            if (str.equalsIgnoreCase("DEBUG")) {
                return c5714oP0;
            }
            if (str.equalsIgnoreCase("INFO")) {
                return j;
            }
            if (str.equalsIgnoreCase("WARN")) {
                return i;
            }
            if (str.equalsIgnoreCase("ERROR")) {
                return h;
            }
            if (str.equalsIgnoreCase("OFF")) {
                return g;
            }
        }
        return c5714oP0;
    }

    public final String toString() {
        return this.e;
    }
}
