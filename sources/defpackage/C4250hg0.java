package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: hg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4250hg0 implements InterfaceC6396rf0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ InterfaceC6396rf0 e;

    public /* synthetic */ C4250hg0(InterfaceC6396rf0 interfaceC6396rf0, int i) {
        this.d = i;
        this.e = interfaceC6396rf0;
    }

    @Override // defpackage.InterfaceC6396rf0
    public final Object c(InterfaceC6606sf0 interfaceC6606sf0, JM jm) {
        switch (this.d) {
            case 0:
                Object objC = this.e.c(new C4040gg0(interfaceC6606sf0), jm);
                return objC == MN.d ? objC : Unit.a;
            default:
                Object objC2 = ((C3098cA) this.e).c(new C4442ib2(interfaceC6606sf0), jm);
                return objC2 == MN.d ? objC2 : Unit.a;
        }
    }
}
