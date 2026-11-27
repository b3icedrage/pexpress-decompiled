package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: kb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4908kb0<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ C5118lb0 d;

    public C4908kb0(C5118lb0 c5118lb0) {
        this.d = c5118lb0;
    }

    @Override // defpackage.InterfaceC6606sf0
    public final Object a(Object obj, JM jm) {
        C6945uG c6945uG = (C6945uG) obj;
        C5118lb0 c5118lb0 = this.d;
        if (c5118lb0.g == null) {
            c5118lb0.g = new Double(c6945uG.j);
        }
        if (c6945uG.j <= 0.0d) {
            return Unit.a;
        }
        Object objD = C5118lb0.d(c5118lb0, jm);
        return objD == MN.d ? objD : Unit.a;
    }
}
