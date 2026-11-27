package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: gM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3974gM0 extends AbstractC4184hM0 {

    @NotNull
    public final InterfaceC3135cM0 u;

    @NotNull
    public final C3554eM0 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3974gM0(@NotNull InterfaceC3135cM0 binding, @NotNull C3554eM0 resourcesProvider) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(resourcesProvider, "resourcesProvider");
        ConstraintLayout view = binding.a();
        Intrinsics.checkNotNullParameter(view, "view");
        super(view);
        this.u = binding;
        this.v = resourcesProvider;
    }
}
