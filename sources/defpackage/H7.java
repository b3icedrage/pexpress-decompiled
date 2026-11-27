package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class H7<T> extends RecyclerView.C {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H7(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
    }

    public void q(@NotNull F7<T> item) {
        Intrinsics.checkNotNullParameter(item, "item");
    }

    @NotNull
    public final Context r() {
        Context context = this.a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
        return context;
    }
}
