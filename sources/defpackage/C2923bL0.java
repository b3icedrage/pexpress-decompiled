package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: bL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2923bL0 implements VN1 {

    @NotNull
    public final GO0 b;

    public C2923bL0(@NotNull GO0 packageFragment) {
        Intrinsics.checkNotNullParameter(packageFragment, "packageFragment");
        this.b = packageFragment;
    }

    @Override // defpackage.VN1
    @NotNull
    public final void a() {
        WN1.a NO_SOURCE_FILE = WN1.a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        GO0 go0 = this.b;
        sb.append(go0);
        sb.append(": ");
        go0.getClass();
        sb.append(((Map) Nm2.f(go0.m, GO0.q[0])).keySet());
        return sb.toString();
    }
}
