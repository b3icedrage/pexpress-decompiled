package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3116cG {

    @NotNull
    public final Object a;

    @NotNull
    public final Object b;

    public C3116cG(@NotNull List<C5266mG> categories, @NotNull List<C5053lG> questions) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(questions, "questions");
        this.a = categories;
        this.b = questions;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3116cG)) {
            return false;
        }
        C3116cG c3116cG = (C3116cG) obj;
        return Intrinsics.a(this.a, c3116cG.a) && Intrinsics.a(this.b, c3116cG.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonKnowledgeBaseValues(categories=");
        sb.append(this.a);
        sb.append(", questions=");
        return K1.a(sb, this.b, ")");
    }
}
