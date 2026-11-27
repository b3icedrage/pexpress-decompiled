package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: jk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4733jk implements InterfaceC6396rf0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ InterfaceC6396rf0 e;

    public /* synthetic */ C4733jk(InterfaceC6396rf0 interfaceC6396rf0, int i) {
        this.d = i;
        this.e = interfaceC6396rf0;
    }

    @Override // defpackage.InterfaceC6396rf0
    public final Object c(InterfaceC6606sf0 interfaceC6606sf0, JM jm) throws Throwable {
        switch (this.d) {
            case 0:
                Object objC = ((C3635ek) this.e).c(new C4474ik(interfaceC6606sf0), jm);
                return objC == MN.d ? objC : Unit.a;
            case 1:
                Object objC2 = this.e.c(new C1515Mf0(interfaceC6606sf0, new C2590Zo1()), jm);
                return objC2 == MN.d ? objC2 : Unit.a;
            case 2:
                ((C6120qK1) this.e).c(new C3789fU1(interfaceC6606sf0), jm);
                return MN.d;
            default:
                ((GP1) this.e).c(new C7246vh2(interfaceC6606sf0), jm);
                return MN.d;
        }
    }
}
