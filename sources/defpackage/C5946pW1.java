package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: pW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5946pW1<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ C5316mW1 d;

    public C5946pW1(C5316mW1 c5316mW1) {
        this.d = c5316mW1;
    }

    @Override // defpackage.InterfaceC6606sf0
    public final Object a(Object obj, JM jm) {
        Object objB = this.d.g.b(((Boolean) obj).booleanValue(), jm);
        return objB == MN.d ? objB : Unit.a;
    }
}
