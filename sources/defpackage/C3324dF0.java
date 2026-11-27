package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: dF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3324dF0 implements Function0 {
    public final C3533eF0 d;
    public final H62 e;
    public final VE0 g;
    public final InterfaceC6494s62 h;
    public final InterfaceC4370iE0 i;

    public C3324dF0(C3533eF0 c3533eF0, H62 h62, VE0 ve0, InterfaceC6494s62 interfaceC6494s62, InterfaceC4370iE0 interfaceC4370iE0) {
        this.d = c3533eF0;
        this.e = h62;
        this.g = ve0;
        this.h = interfaceC6494s62;
        this.i = interfaceC4370iE0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        M62 m62 = this.d.d;
        InterfaceC5044lD interfaceC5044lDC = this.h.c();
        return m62.b(this.e, VE0.a(VE0.a(this.g, null, false, null, interfaceC5044lDC != null ? interfaceC5044lDC.y() : null, 31), null, this.i.z(), null, null, 59));
    }
}
