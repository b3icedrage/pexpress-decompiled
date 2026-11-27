package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: n50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5439n50 extends C5229m50 {
    @Override // defpackage.C5229m50
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C5439n50)) {
            return false;
        }
        C5439n50 c5439n50 = (C5439n50) obj;
        int size = c5439n50.a.size();
        ArrayList<String> arrayList = this.a;
        if (size != arrayList.size()) {
            return false;
        }
        int size2 = arrayList.size();
        for (int i = 0; i < size2; i++) {
            if (!a(i).equalsIgnoreCase(c5439n50.a(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int size = this.a.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode ^= a(i).toLowerCase().hashCode();
        }
        return iHashCode;
    }
}
