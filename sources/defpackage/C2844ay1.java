package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: ay1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2844ay1 implements InterfaceC6396rf0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ InterfaceC6396rf0 e;

    public /* synthetic */ C2844ay1(InterfaceC6396rf0 interfaceC6396rf0, int i) {
        this.d = i;
        this.e = interfaceC6396rf0;
    }

    @Override // defpackage.InterfaceC6396rf0
    public final Object c(InterfaceC6606sf0 interfaceC6606sf0, JM jm) {
        switch (this.d) {
            case 0:
                Object objC = ((InterfaceC5910pK1) this.e).c(new C2617Zx1(interfaceC6606sf0), jm);
                return objC == MN.d ? objC : Unit.a;
            default:
                Object objC2 = ((C3098cA) this.e).c(new S22(interfaceC6606sf0), jm);
                return objC2 == MN.d ? objC2 : Unit.a;
        }
    }
}
