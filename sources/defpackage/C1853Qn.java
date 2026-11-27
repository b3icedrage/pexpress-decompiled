package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: Qn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1853Qn extends AbstractC0999Fp {
    public final ArrayList a;
    public final byte[] b;

    public C1853Qn() {
        throw null;
    }

    public C1853Qn(ArrayList arrayList, byte[] bArr) {
        this.a = arrayList;
        this.b = bArr;
    }

    @Override // defpackage.AbstractC0999Fp
    public final Iterable<AbstractC6081q80> a() {
        return this.a;
    }

    @Override // defpackage.AbstractC0999Fp
    public final byte[] b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0999Fp)) {
            return false;
        }
        AbstractC0999Fp abstractC0999Fp = (AbstractC0999Fp) obj;
        if (this.a.equals(abstractC0999Fp.a())) {
            return Arrays.equals(this.b, abstractC0999Fp instanceof C1853Qn ? ((C1853Qn) abstractC0999Fp).b : abstractC0999Fp.b());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.a + ", extras=" + Arrays.toString(this.b) + "}";
    }
}
