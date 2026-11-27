package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: m50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5229m50 {
    public final ArrayList<String> a = new ArrayList<>();

    public C5229m50() {
    }

    public final String a(int i) {
        return this.a.get(i);
    }

    public final String b() {
        ArrayList<String> arrayList = this.a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.get(arrayList.size() - 1);
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.a) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C5229m50)) {
            return false;
        }
        C5229m50 c5229m50 = (C5229m50) obj;
        int size = c5229m50.a.size();
        ArrayList<String> arrayList = this.a;
        if (size != arrayList.size()) {
            return false;
        }
        int size2 = arrayList.size();
        for (int i = 0; i < size2; i++) {
            if (!a(i).equalsIgnoreCase(c5229m50.a(i))) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return c();
    }

    public C5229m50(String str) {
        String[] strArrSplit;
        if (str == null || (strArrSplit = str.split("/")) == null) {
            return;
        }
        for (String str2 : strArrSplit) {
            if (str2.length() > 0) {
                this.a.add(str2);
            }
        }
    }
}
