package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Fc2 extends ML0 implements Function2<String, List<? extends String>, Unit> {
    public final /* synthetic */ D81 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fc2(D81 d81) {
        super(2);
        this.d = d81;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, List<? extends String> list) {
        String key = str;
        List<? extends String> values = list;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        List<String> list2 = C1159Hq0.a;
        if (!"Content-Length".equals(key) && !"Content-Type".equals(key)) {
            boolean zContains = Gc2.a.contains(key);
            D81 d81 = this.d;
            if (zContains) {
                Iterator<T> it = values.iterator();
                while (it.hasNext()) {
                    d81.invoke(key, (String) it.next());
                }
            } else {
                d81.invoke(key, CollectionsKt.J(values, "Cookie".equals(key) ? "; " : ",", null, null, null, 62));
            }
        }
        return Unit.a;
    }
}
