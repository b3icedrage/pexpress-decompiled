package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: u32, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6902u32<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ D32 d;
    public final /* synthetic */ KN e;

    public C6902u32(D32 d32, KN kn) {
        this.d = d32;
        this.e = kn;
    }

    @Override // defpackage.InterfaceC6606sf0
    public final Object a(Object obj, JM jm) {
        Z22 z22 = (Z22) obj;
        if (!(z22 instanceof C2021Sr) && !(z22 instanceof C0693Br)) {
            boolean z = z22 instanceof C7151vE1;
            D32 d32 = this.d;
            if (z) {
                d32.d.e();
            } else {
                if (z22 instanceof U32) {
                    Object objC = D32.c(d32, this.e, jm);
                    return objC == MN.d ? objC : Unit.a;
                }
                if (z22 instanceof TX0) {
                    TX0 tx0 = (TX0) z22;
                    long j = tx0.a;
                    d32.i();
                    C5189lv.k(C3286d41.a, null, new C4800k32(d32, j, tx0.b, null), 3);
                } else if (z22 instanceof NT0) {
                    NT0 nt0 = (NT0) z22;
                    long j2 = nt0.a;
                    d32.i();
                    C5189lv.k(C3286d41.a, null, new C4590j32(d32, j2, nt0.b, null), 3);
                } else {
                    d32.i();
                    d32.d.h();
                }
            }
        }
        return Unit.a;
    }
}
