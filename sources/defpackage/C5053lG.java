package defpackage;

import com.api.core.backend.domain.models.responseModels.SupportQuestionType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5053lG {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    @NotNull
    public final SupportQuestionType c;

    public C5053lG(@NotNull String questionText, @NotNull String questionUrl, @NotNull SupportQuestionType type) {
        Intrinsics.checkNotNullParameter(questionText, "questionText");
        Intrinsics.checkNotNullParameter(questionUrl, "questionUrl");
        Intrinsics.checkNotNullParameter(type, "type");
        this.a = questionText;
        this.b = questionUrl;
        this.c = type;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5053lG)) {
            return false;
        }
        C5053lG c5053lG = (C5053lG) obj;
        return Intrinsics.a(this.a, c5053lG.a) && Intrinsics.a(this.b, c5053lG.b) && this.c == c5053lG.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + C1039Gc0.b(this.a.hashCode() * 31, 31, this.b);
    }

    @NotNull
    public final String toString() {
        return "CommonPopularQuestionItem(questionText=" + this.a + ", questionUrl=" + this.b + ", type=" + this.c + ")";
    }
}
