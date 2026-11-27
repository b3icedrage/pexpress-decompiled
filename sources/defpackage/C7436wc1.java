package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: wc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7436wc1<Output> {

    @NotNull
    public final List<InterfaceC7015uc1<Output>> a;

    @NotNull
    public final List<C7436wc1<Output>> b;

    /* JADX WARN: Multi-variable type inference failed */
    public C7436wc1(@NotNull List<? extends InterfaceC7015uc1<? super Output>> operations, @NotNull List<? extends C7436wc1<? super Output>> followedBy) {
        Intrinsics.checkNotNullParameter(operations, "operations");
        Intrinsics.checkNotNullParameter(followedBy, "followedBy");
        this.a = operations;
        this.b = followedBy;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CollectionsKt.J(this.a, ", ", null, null, null, 62));
        sb.append('(');
        return C1039Gc0.e(sb, CollectionsKt.J(this.b, ";", null, null, null, 62), ')');
    }
}
