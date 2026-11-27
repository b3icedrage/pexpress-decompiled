package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: yy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.indicators.IndicatorParamsProvider$params$1", f = "IndicatorParamsProvider.kt", l = {}, m = "invokeSuspend")
public final class C7932yy0 extends AW1 implements InterfaceC1060Gj0<InterfaceC7722xy0<Object>, Boolean, JM<InterfaceC7722xy0<Object>>, Object> {
    public /* synthetic */ InterfaceC7722xy0 d;
    public /* synthetic */ boolean e;
    public final /* synthetic */ AbstractC0637Ay0<E10.c, InterfaceC7722xy0<Object>> g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7932yy0(AbstractC0637Ay0<E10.c, InterfaceC7722xy0<Object>> abstractC0637Ay0, JM<? super C7932yy0> jm) {
        super(3, jm);
        this.g = abstractC0637Ay0;
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        InterfaceC7722xy0 interfaceC7722xy0 = this.d;
        boolean z = this.e;
        AbstractC0637Ay0<E10.c, InterfaceC7722xy0<Object>> abstractC0637Ay0 = this.g;
        if (z) {
            return interfaceC7722xy0 == null ? abstractC0637Ay0.b() : interfaceC7722xy0;
        }
        return abstractC0637Ay0.b();
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(InterfaceC7722xy0<Object> interfaceC7722xy0, Boolean bool, JM<InterfaceC7722xy0<Object>> jm) {
        boolean zBooleanValue = bool.booleanValue();
        C7932yy0 c7932yy0 = new C7932yy0(this.g, jm);
        c7932yy0.d = interfaceC7722xy0;
        c7932yy0.e = zBooleanValue;
        return c7932yy0.invokeSuspend(Unit.a);
    }
}
