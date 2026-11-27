package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: Dd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0807Dd implements InterfaceC6396rf0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ InterfaceC6396rf0 e;

    public /* synthetic */ C0807Dd(InterfaceC6396rf0 interfaceC6396rf0, int i) {
        this.d = i;
        this.e = interfaceC6396rf0;
    }

    @Override // defpackage.InterfaceC6396rf0
    public final Object c(InterfaceC6606sf0 interfaceC6606sf0, JM jm) throws Throwable {
        switch (this.d) {
            case 0:
                Object objC = ((InterfaceC3907g21) this.e).c(new C0729Cd(interfaceC6606sf0), jm);
                return objC == MN.d ? objC : Unit.a;
            case 1:
                Object objC2 = this.e.c(new C5556nf(interfaceC6606sf0), jm);
                return objC2 == MN.d ? objC2 : Unit.a;
            default:
                ((GP1) this.e).c(new C3146cQ(interfaceC6606sf0), jm);
                return MN.d;
        }
    }
}
