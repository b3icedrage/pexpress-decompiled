package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Zj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2574Zj0 extends AbstractC1568Mx implements InterfaceC1764Pj0, InterfaceC6325rJ0 {
    private final int k;
    private final int l;

    public C2574Zj0(int i) {
        this(i, AbstractC1568Mx.a.d, null, null, null, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2574Zj0) {
            C2574Zj0 c2574Zj0 = (C2574Zj0) obj;
            return getName().equals(c2574Zj0.getName()) && o().equals(c2574Zj0.o()) && this.l == c2574Zj0.l && this.k == c2574Zj0.k && Intrinsics.a(this.e, c2574Zj0.e) && Intrinsics.a(j(), c2574Zj0.j());
        }
        if (obj instanceof InterfaceC6325rJ0) {
            return obj.equals(e());
        }
        return false;
    }

    @Override // defpackage.InterfaceC1764Pj0
    public final int getArity() {
        return this.k;
    }

    @Override // defpackage.AbstractC1568Mx
    public final JI0 h() {
        return C2017Sp1.a.a(this);
    }

    public final int hashCode() {
        return o().hashCode() + ((getName().hashCode() + (j() == null ? 0 : j().hashCode() * 31)) * 31);
    }

    @Override // defpackage.AbstractC1568Mx
    public final JI0 m() {
        return (InterfaceC6325rJ0) super.m();
    }

    public final String toString() {
        JI0 ji0E = e();
        if (ji0E != this) {
            return ji0E.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public C2574Zj0(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    public C2574Zj0(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.k = i;
        this.l = 0;
    }
}
