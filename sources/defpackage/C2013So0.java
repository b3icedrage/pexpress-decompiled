package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: So0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2013So0 {

    @NotNull
    public final List<C0997Fo0> a;
    public final boolean b;
    public final long c;

    public C2013So0() {
        this(7, 0L);
    }

    public static C2013So0 a(C2013So0 c2013So0, ArrayList arrayList, boolean z, long j, int i) {
        List<C0997Fo0> messages = arrayList;
        if ((i & 1) != 0) {
            messages = c2013So0.a;
        }
        if ((i & 2) != 0) {
            z = c2013So0.b;
        }
        if ((i & 4) != 0) {
            j = c2013So0.c;
        }
        c2013So0.getClass();
        Intrinsics.checkNotNullParameter(messages, "messages");
        return new C2013So0(messages, z, j);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2013So0)) {
            return false;
        }
        C2013So0 c2013So0 = (C2013So0) obj;
        return Intrinsics.a(this.a, c2013So0.a) && this.b == c2013So0.b && this.c == c2013So0.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return Long.hashCode(this.c) + ((iHashCode + r1) * 31);
    }

    @NotNull
    public final String toString() {
        String string;
        List<C0997Fo0> list = this.a;
        if (list.isEmpty()) {
            string = "\"empty\"";
        } else if (list.size() == 1) {
            string = list.get(0).toString();
        } else {
            string = "\"" + CollectionsKt.F(list) + "\"...\"" + CollectionsKt.L(list) + '\"';
        }
        StringBuilder sbB = C6495s7.b("HistoryState{messages=", string, ", unread=");
        sbB.append(this.b);
        sbB.append(", read=");
        sbB.append(this.c);
        sbB.append('}');
        return sbB.toString();
    }

    public C2013So0(@NotNull List<C0997Fo0> messages, boolean z, long j) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.a = messages;
        this.b = z;
        this.c = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C2013So0(int i, long j) {
        List list = Collections.EMPTY_LIST;
        Intrinsics.checkNotNullExpressionValue(list, "emptyList()");
        this(list, false, (i & 4) != 0 ? 0L : j);
    }
}
