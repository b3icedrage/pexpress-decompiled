package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4273hm extends C2784ak0 implements Function1 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4273hm(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.m = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.m) {
            case 0:
                C2098Tq1 p0 = (C2098Tq1) obj;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((InterfaceC1472Lq1) this.e).c(p0);
                return Unit.a;
            default:
                return ((SM1) this.e).a();
        }
    }
}
