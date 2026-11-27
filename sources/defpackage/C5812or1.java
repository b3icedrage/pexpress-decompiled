package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: or1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5812or1 extends C2784ak0 implements Function1 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5812or1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.m = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.m) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                C5515nT c5515nT = (C5515nT) this.e;
                synchronized (c5515nT) {
                    if (c5515nT.h >= 4) {
                        c5515nT.t("identify_interceptor", jLongValue);
                    }
                }
                return Unit.a;
            default:
                C3279d22 asset = (C3279d22) obj;
                Intrinsics.checkNotNullParameter(asset, "p0");
                AbstractC6898u22 abstractC6898u22 = (AbstractC6898u22) this.e;
                abstractC6898u22.getClass();
                Intrinsics.checkNotNullParameter(asset, "asset");
                C5189lv.k(C8056za.j(abstractC6898u22), null, new C6478s22(asset, abstractC6898u22, null), 3);
                return Unit.a;
        }
    }
}
