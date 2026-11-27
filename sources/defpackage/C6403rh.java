package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: rh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6403rh implements InterfaceC6396rf0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ InterfaceC6396rf0 e;

    public /* synthetic */ C6403rh(InterfaceC6396rf0 interfaceC6396rf0, int i) {
        this.d = i;
        this.e = interfaceC6396rf0;
    }

    @Override // defpackage.InterfaceC6396rf0
    public final Object c(InterfaceC6606sf0 interfaceC6606sf0, JM jm) {
        switch (this.d) {
            case 0:
                Object objC = ((InterfaceC3907g21) this.e).c(new C6194qh(interfaceC6606sf0), jm);
                return objC == MN.d ? objC : Unit.a;
            default:
                Object objC2 = this.e.c(new Mb2(interfaceC6606sf0), jm);
                return objC2 == MN.d ? objC2 : Unit.a;
        }
    }
}
