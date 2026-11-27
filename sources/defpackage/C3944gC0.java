package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: gC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3944gC0 implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C3944gC0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                AbstractC4649jL0 abstractC4649jL0 = (AbstractC4649jL0) obj;
                Intrinsics.checkNotNull(abstractC4649jL0);
                return ((Function1) this.e).invoke(abstractC4649jL0).toString();
            case 1:
                C1758Ph0 it = (C1758Ph0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.d() && Intrinsics.a(it.e(), (C1758Ph0) this.e));
            default:
                QL1.a.C0130a function = (QL1.a.C0130a) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.c((String) this.e, C4719jg1.b);
                return Unit.a;
        }
    }
}
