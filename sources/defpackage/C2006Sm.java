package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: Sm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2006Sm implements InterfaceC6396rf0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C2006Sm(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.InterfaceC6396rf0
    public final Object c(InterfaceC6606sf0 interfaceC6606sf0, JM jm) throws Throwable {
        switch (this.d) {
            case 0:
                Object objC = ((C1699On1) this.e).d.c(new C1928Rm(interfaceC6606sf0), jm);
                return objC == MN.d ? objC : Unit.a;
            default:
                ((GP1) this.e).c(new C7457wh2(interfaceC6606sf0), jm);
                return MN.d;
        }
    }
}
