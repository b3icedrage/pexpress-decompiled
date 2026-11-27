package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class VD extends C1325Jt1 {

    @NotNull
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VD(@NotNull AbstractC5391mr0 response, @NotNull String cachedResponseText) {
        super(response, cachedResponseText);
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(cachedResponseText, "cachedResponseText");
        this.d = "Client request(" + response.b().c().G().a + ' ' + response.b().c().getUrl() + ") invalid: " + response.g() + ". Text: \"" + cachedResponseText + '\"';
    }

    @Override // java.lang.Throwable
    @NotNull
    public final String getMessage() {
        return this.d;
    }
}
