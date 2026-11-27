package defpackage;

import android.view.View;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: iL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4390iL extends D7<RA> {

    @NotNull
    public final FP0 c;

    @NotNull
    public final T5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4390iL(@NotNull FP0 lifecycleOwner, @NotNull T5 itemViewModelProvider) {
        super(15, R.layout.dg_item_contact_form);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(itemViewModelProvider, "itemViewModelProvider");
        this.c = lifecycleOwner;
        this.d = itemViewModelProvider;
    }

    @Override // defpackage.D7
    @NotNull
    public final H7<RA> a(@NotNull View itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Object obj = this.d.get();
        Intrinsics.checkNotNullExpressionValue(obj, "itemViewModelProvider.get()");
        return new C5068lL(itemView, this.c, (C6960uL) obj);
    }
}
