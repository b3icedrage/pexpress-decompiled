package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: mB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5252mB0 extends RecyclerView.C {

    @NotNull
    public final InterfaceC4151hB0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5252mB0(@NotNull InterfaceC4151hB0 instructionItemBindingProvider) {
        super(instructionItemBindingProvider.b());
        Intrinsics.checkNotNullParameter(instructionItemBindingProvider, "instructionItemBindingProvider");
        this.u = instructionItemBindingProvider;
    }
}
