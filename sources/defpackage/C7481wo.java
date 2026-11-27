package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: wo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7481wo extends AbstractC5592no0 {
    public final String a;
    public final ArrayList b;

    public C7481wo(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.a = str;
        this.b = arrayList;
    }

    @Override // defpackage.AbstractC5592no0
    public final List<String> a() {
        return this.b;
    }

    @Override // defpackage.AbstractC5592no0
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5592no0)) {
            return false;
        }
        AbstractC5592no0 abstractC5592no0 = (AbstractC5592no0) obj;
        return this.a.equals(abstractC5592no0.b()) && this.b.equals(abstractC5592no0.a());
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
