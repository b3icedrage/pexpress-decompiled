package androidx.lifecycle;

import defpackage.FP0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/k;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SavedStateHandleController implements k {

    @NotNull
    public final String d;

    @NotNull
    public final r e;
    public boolean g;

    public SavedStateHandleController(@NotNull String key, @NotNull r handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.d = key;
        this.e = handle;
    }

    public final void a(@NotNull g lifecycle, @NotNull androidx.savedstate.a registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.g) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.g = true;
        lifecycle.a(this);
        registry.c(this.d, this.e.e);
    }

    @Override // androidx.lifecycle.k
    public final void b(@NotNull FP0 source, @NotNull g.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == g.a.ON_DESTROY) {
            this.g = false;
            source.getLifecycle().c(this);
        }
    }
}
