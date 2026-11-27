package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: f10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3692f10 extends TF {

    @Nullable
    public final Integer p;
    public final boolean q;

    /* JADX INFO: renamed from: f10$a */
    public static final class a extends TF.a<C3692f10> {

        @Nullable
        public Integer b;
        public boolean c = true;
    }

    public C3692f10(@Nullable Integer num, boolean z) {
        this.p = num;
        this.q = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3692f10)) {
            return false;
        }
        C3692f10 c3692f10 = (C3692f10) obj;
        return Intrinsics.a(this.p, c3692f10.p) && this.q == c3692f10.q;
    }

    public final int hashCode() {
        Integer num = this.p;
        return Boolean.hashCode(this.q) + ((num == null ? 0 : num.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogFullScreenParams(backgroundColorRes=");
        sb.append(this.p);
        sb.append(", shouldCloseOnAction=");
        return C2983be.b(sb, this.q, ")");
    }
}
