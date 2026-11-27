package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: Zx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2616Zx0 implements InterfaceC6396rf0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ InterfaceC6396rf0 e;
    public final /* synthetic */ Object g;

    public /* synthetic */ C2616Zx0(InterfaceC6396rf0 interfaceC6396rf0, Object obj, int i) {
        this.d = i;
        this.e = interfaceC6396rf0;
        this.g = obj;
    }

    @Override // defpackage.InterfaceC6396rf0
    public final Object c(InterfaceC6606sf0 interfaceC6606sf0, JM jm) {
        switch (this.d) {
            case 0:
                Object objC = this.e.c(new C2538Yx0(interfaceC6606sf0, (C1491Lx0) this.g), jm);
                return objC == MN.d ? objC : Unit.a;
            default:
                Object objC2 = ((FP1) this.e).c(new C7111v31(interfaceC6606sf0, (C6062q31) this.g), jm);
                return objC2 == MN.d ? objC2 : Unit.a;
        }
    }
}
