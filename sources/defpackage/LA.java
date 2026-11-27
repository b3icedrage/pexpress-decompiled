package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class LA implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ LA(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                float fFloatValue = ((Number) pair.d).floatValue();
                float fFloatValue2 = ((Number) pair.e).floatValue();
                return Boolean.valueOf((fFloatValue < 0.0f || Float.isInfinite(fFloatValue2) || Float.isNaN(fFloatValue2)) ? false : true);
            case 1:
                C0857Dt1 it = (C0857Dt1) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.n;
            default:
                ((Integer) obj).intValue();
                return Unit.a;
        }
    }
}
