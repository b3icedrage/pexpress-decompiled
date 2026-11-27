package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: eD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3527eD0 implements InterfaceC6396rf0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ InterfaceC6396rf0 e;

    public /* synthetic */ C3527eD0(InterfaceC6396rf0 interfaceC6396rf0, int i) {
        this.d = i;
        this.e = interfaceC6396rf0;
    }

    @Override // defpackage.InterfaceC6396rf0
    public final Object c(InterfaceC6606sf0 interfaceC6606sf0, JM jm) {
        switch (this.d) {
            case 0:
                Object objC = this.e.c(new C3318dD0(interfaceC6606sf0), jm);
                return objC == MN.d ? objC : Unit.a;
            default:
                Object objC2 = ((Rg2) this.e).c(new Sg2(interfaceC6606sf0), jm);
                return objC2 == MN.d ? objC2 : Unit.a;
        }
    }
}
