package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: eQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3565eQ<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ C3775fQ d;

    public C3565eQ(C3775fQ c3775fQ) {
        this.d = c3775fQ;
    }

    @Override // defpackage.InterfaceC6606sf0
    public final Object a(Object obj, JM jm) {
        ((Boolean) obj).booleanValue();
        Object objD = C3775fQ.d(this.d, jm);
        return objD == MN.d ? objD : Unit.a;
    }
}
