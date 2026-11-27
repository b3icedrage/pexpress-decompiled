package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Nf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1596Nf0 implements InterfaceC6396rf0 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ InterfaceC6396rf0 e;
    public final /* synthetic */ Object g;

    /* JADX WARN: Multi-variable type inference failed */
    public C1596Nf0(InterfaceC6396rf0 interfaceC6396rf0, Function2 function2) {
        this.e = interfaceC6396rf0;
        this.g = (AW1) function2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.InterfaceC6396rf0
    public final Object c(InterfaceC6606sf0 interfaceC6606sf0, JM jm) {
        switch (this.d) {
            case 0:
                Object objC = this.e.c(new C1674Of0(new C2512Yo1(), interfaceC6606sf0, (AW1) this.g), jm);
                return objC == MN.d ? objC : Unit.a;
            default:
                Object objC2 = ((C1699On1) this.e).d.c(new LV0(interfaceC6606sf0, (IV0) this.g), jm);
                return objC2 == MN.d ? objC2 : Unit.a;
        }
    }

    public C1596Nf0(C1699On1 c1699On1, IV0 iv0) {
        this.e = c1699On1;
        this.g = iv0;
    }
}
