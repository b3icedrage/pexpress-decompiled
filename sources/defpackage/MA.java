package defpackage;

import com.appsflyer.internal.AFa1mSDK;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MA implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ MA(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new C3506e70(((Number) pair.d).floatValue(), ((Number) pair.e).floatValue());
            case 1:
                C6138qQ1 it = (C6138qQ1) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return new Pair(Double.valueOf(it.a[4]), Double.valueOf(it.b[4]));
            case 2:
                CharSequence it2 = (CharSequence) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2.toString();
            default:
                return AFa1mSDK.d(obj);
        }
    }
}
