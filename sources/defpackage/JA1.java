package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class JA1 implements Function1 {
    public final /* synthetic */ int d;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                C3471dy0 it = (C3471dy0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.b.toString();
            default:
                C6942uF it2 = (C6942uF) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return Boolean.valueOf(it2.k);
        }
    }
}
