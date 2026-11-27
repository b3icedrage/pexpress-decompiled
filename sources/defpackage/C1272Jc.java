package defpackage;

import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1272Jc implements Function0 {
    public final Class d;
    public final Map e;

    public C1272Jc(Class cls, Map map) {
        this.d = cls;
        this.e = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        sb.append(this.d.getCanonicalName());
        CollectionsKt.I(this.e.entrySet(), sb, ", ", "(", ")", C1428Lc.e, 48);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
