package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class VE {
    @NotNull
    public static CQ0 a(@NotNull List builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        CQ0 cq0 = (CQ0) builder;
        cq0.h();
        cq0.g = true;
        return cq0.e > 0 ? cq0 : CQ0.i;
    }

    @NotNull
    public static CQ0 b() {
        return new CQ0(0, 1, null);
    }

    @NotNull
    public static <T> List<T> c(T t) {
        List<T> listSingletonList = Collections.singletonList(t);
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }
}
