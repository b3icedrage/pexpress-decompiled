package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: Po, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1778Po extends V42 {
    public final String a;
    public final byte[] b;
    public final EnumC6825th1 c;

    public C1778Po(String str, byte[] bArr, EnumC6825th1 enumC6825th1) {
        this.a = str;
        this.b = bArr;
        this.c = enumC6825th1;
    }

    @Override // defpackage.V42
    public final String a() {
        return this.a;
    }

    @Override // defpackage.V42
    public final byte[] b() {
        return this.b;
    }

    @Override // defpackage.V42
    public final EnumC6825th1 c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V42)) {
            return false;
        }
        V42 v42 = (V42) obj;
        if (this.a.equals(v42.a())) {
            return Arrays.equals(this.b, v42 instanceof C1778Po ? ((C1778Po) v42).b : v42.b()) && this.c.equals(v42.c());
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }
}
