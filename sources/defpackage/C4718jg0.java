package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4718jg0 implements InterfaceC6396rf0 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ InterfaceC6396rf0 e;
    public final /* synthetic */ Object g;

    public C4718jg0(InterfaceC6396rf0 interfaceC6396rf0, C4720jg2 c4720jg2) {
        this.e = interfaceC6396rf0;
        this.g = c4720jg2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.InterfaceC6396rf0
    public final Object c(InterfaceC6606sf0 interfaceC6606sf0, JM jm) {
        switch (this.d) {
            case 0:
                Object objC = this.e.c(new C4459ig0(interfaceC6606sf0, (AW1) this.g), jm);
                return objC == MN.d ? objC : Unit.a;
            default:
                Object objC2 = this.e.c(new C3413dg2(interfaceC6606sf0, (C4720jg2) this.g), jm);
                return objC2 == MN.d ? objC2 : Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4718jg0(InterfaceC6396rf0 interfaceC6396rf0, Function2 function2) {
        this.e = interfaceC6396rf0;
        this.g = (AW1) function2;
    }
}
