package defpackage;

import android.view.View;
import defpackage.AbstractC7844yZ0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class EZ0<T extends AbstractC7844yZ0> extends H7<RA> {

    @NotNull
    public final FZ0<T> u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EZ0(@NotNull View itemView, @NotNull FZ0<T> viewModel) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.u = viewModel;
    }
}
