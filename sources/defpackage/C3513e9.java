package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: e9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3513e9 {
    public final boolean a;

    @NotNull
    public final List<C7129v8> b;

    public C3513e9() {
        this(0);
    }

    public static C3513e9 a(C3513e9 c3513e9, ArrayList arrayList, int i) {
        boolean z = (i & 1) != 0 ? c3513e9.a : false;
        List<C7129v8> agents = arrayList;
        if ((i & 2) != 0) {
            agents = c3513e9.b;
        }
        c3513e9.getClass();
        Intrinsics.checkNotNullParameter(agents, "agents");
        return new C3513e9(z, agents);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3513e9)) {
            return false;
        }
        C3513e9 c3513e9 = (C3513e9) obj;
        return this.a == c3513e9.a && Intrinsics.a(this.b, c3513e9.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.b.hashCode() + (r0 * 31);
    }

    @NotNull
    public final String toString() {
        return "AgentState(hasOnlineAgentsInChat=" + this.a + ", agents=" + this.b + ')';
    }

    public C3513e9(boolean z, @NotNull List<C7129v8> agents) {
        Intrinsics.checkNotNullParameter(agents, "agents");
        this.a = z;
        this.b = agents;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C3513e9(int i) {
        List list = Collections.EMPTY_LIST;
        Intrinsics.checkNotNullExpressionValue(list, "emptyList()");
        this(false, list);
    }
}
