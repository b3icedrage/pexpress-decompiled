package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: nM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5496nM1 implements InterfaceC3795fW1 {

    @NotNull
    public final String d;

    /* JADX INFO: renamed from: nM1$a */
    public static final class a {
    }

    public C5496nM1(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(query, "query");
        this.d = query;
    }

    @Override // defpackage.InterfaceC3795fW1
    @NotNull
    public final String c() {
        return this.d;
    }

    @Override // defpackage.InterfaceC3795fW1
    public final void f(@NotNull InterfaceC3585eW1 statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        Intrinsics.checkNotNullParameter(statement, "statement");
    }
}
