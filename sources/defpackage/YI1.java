package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class YI1<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ TA d;
    public final /* synthetic */ ZI1<T> e;

    /* JADX WARN: Multi-variable type inference failed */
    public YI1(TA ta, ZI1<? extends T> zi1) {
        this.d = ta;
        this.e = zi1;
    }

    @Override // defpackage.InterfaceC6606sf0
    public final Object a(T t, JM<? super Unit> jm) {
        Object objB = this.d.b(this.e.getKey(), t, jm);
        return objB == MN.d ? objB : Unit.a;
    }
}
