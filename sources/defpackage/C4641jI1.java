package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jI1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4641jI1 extends C1325Jt1 {

    @NotNull
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4641jI1(@NotNull AbstractC5391mr0 response, @NotNull String cachedResponseText) {
        super(response, cachedResponseText);
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(cachedResponseText, "cachedResponseText");
        this.d = "Server error(" + response.b().c().G().a + ' ' + response.b().c().getUrl() + ": " + response.g() + ". Text: \"" + cachedResponseText + '\"';
    }

    @Override // java.lang.Throwable
    @NotNull
    public final String getMessage() {
        return this.d;
    }
}
