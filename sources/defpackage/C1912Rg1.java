package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Rg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1912Rg1 implements InterfaceC6396rf0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ InterfaceC6396rf0 e;
    public final /* synthetic */ Object g;

    public /* synthetic */ C1912Rg1(InterfaceC6396rf0 interfaceC6396rf0, Object obj, int i) {
        this.d = i;
        this.e = interfaceC6396rf0;
        this.g = obj;
    }

    @Override // defpackage.InterfaceC6396rf0
    public final Object c(InterfaceC6606sf0 interfaceC6606sf0, JM jm) {
        switch (this.d) {
            case 0:
                Object objC = ((C1282Jf0) this.e).c(new C1834Qg1(interfaceC6606sf0, (Function1) this.g), jm);
                return objC == MN.d ? objC : Unit.a;
            default:
                ((GP1) this.e).c(new O52(interfaceC6606sf0, (P52) this.g), jm);
                return MN.d;
        }
    }
}
