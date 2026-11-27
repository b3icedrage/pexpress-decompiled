package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class L60 implements Function1 {
    public final /* synthetic */ long d;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Map.Entry it = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(((Number) it.getValue()).longValue() <= this.d);
    }
}
