package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: rg2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6402rg2 {
    public final String a;
    public final LinkedHashMap b;

    public C6402rg2(String str) {
        if (!C8056za.n(str)) {
            throw new IllegalArgumentException("'name' is not a valid token.");
        }
        this.a = str;
        this.b = new LinkedHashMap();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.a);
        for (Map.Entry entry : this.b.entrySet()) {
            sb.append("; ");
            sb.append((String) entry.getKey());
            String str = (String) entry.getValue();
            if (str != null && str.length() != 0) {
                sb.append("=");
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
