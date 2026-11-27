package io.sentry.featureflags;

import io.sentry.protocol.C4525g;
import io.sentry.util.C4527a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements b {

    @NotNull
    public final C4527a a = new C4527a();

    @NotNull
    public final Object clone() {
        return new d();
    }

    @Override // io.sentry.featureflags.b
    @NotNull
    public final b f() {
        return new d();
    }

    @Override // io.sentry.featureflags.b
    @Nullable
    public final C4525g g() {
        this.a.a().close();
        return null;
    }
}
