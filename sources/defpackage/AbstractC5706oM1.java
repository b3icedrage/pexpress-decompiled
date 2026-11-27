package defpackage;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: oM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5706oM1 extends P92 implements InterfaceC6126qM1, InterfaceC4602j62 {
    @Override // defpackage.P92
    @NotNull
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC5706oM1 Z0(boolean z);

    @Override // defpackage.P92
    @NotNull
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC5706oM1 b1(@NotNull C5655o62 c5655o62);

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<InterfaceC1583Nc> it = k().iterator();
        while (it.hasNext()) {
            String[] value = {"[", XY.c.x(it.next(), null), "] "};
            Intrinsics.checkNotNullParameter(sb, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            for (int i = 0; i < 3; i++) {
                sb.append(value[i]);
            }
        }
        sb.append(V0());
        if (!T0().isEmpty()) {
            CollectionsKt.I(T0(), sb, ", ", "<", ">", null, 112);
        }
        if (W0()) {
            sb.append("?");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
