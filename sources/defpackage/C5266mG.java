package defpackage;

import com.api.core.backend.domain.models.responseModels.SupportQuestionType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5266mG {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    @NotNull
    public final SupportQuestionType c;

    public C5266mG(@NotNull String name, @NotNull String categoryUrl, @NotNull SupportQuestionType type) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(categoryUrl, "categoryUrl");
        Intrinsics.checkNotNullParameter(type, "type");
        this.a = name;
        this.b = categoryUrl;
        this.c = type;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5266mG)) {
            return false;
        }
        C5266mG c5266mG = (C5266mG) obj;
        return Intrinsics.a(this.a, c5266mG.a) && Intrinsics.a(this.b, c5266mG.b) && this.c == c5266mG.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + C1039Gc0.b(this.a.hashCode() * 31, 31, this.b);
    }

    @NotNull
    public final String toString() {
        return "CommonQuestionCategoryItem(name=" + this.a + ", categoryUrl=" + this.b + ", type=" + this.c + ")";
    }
}
