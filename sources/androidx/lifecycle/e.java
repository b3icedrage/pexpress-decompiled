package androidx.lifecycle;

import defpackage.VP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface e {
    @NotNull
    default VP getDefaultViewModelCreationExtras() {
        return VP.a.b;
    }
}
