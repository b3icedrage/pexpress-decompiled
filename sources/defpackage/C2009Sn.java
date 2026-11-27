package defpackage;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Sn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2009Sn extends AbstractC4967kr {
    public final ArrayList a;

    public C2009Sn(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.AbstractC4967kr
    @NonNull
    public final List<AbstractC5933pS0> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4967kr) {
            return this.a.equals(((AbstractC4967kr) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}
