package defpackage;

import android.view.View;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: h9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4143h9 extends D7<RA> {

    @NotNull
    public final FP0 c;

    @NotNull
    public final C5664o9 d;

    @NotNull
    public final SF0 e;

    @NotNull
    public final InterfaceC1454Lk1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4143h9(@NotNull FP0 lifecycleOwner, @NotNull C5664o9 viewModelProvider, @NotNull SF0 jivoChatViewModel, @NotNull InterfaceC1454Lk1 markwonProvider) {
        super(8, R.layout.dg_item_agent_text);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        Intrinsics.checkNotNullParameter(jivoChatViewModel, "jivoChatViewModel");
        Intrinsics.checkNotNullParameter(markwonProvider, "markwonProvider");
        this.c = lifecycleOwner;
        this.d = viewModelProvider;
        this.e = jivoChatViewModel;
        this.f = markwonProvider;
    }

    @Override // defpackage.D7
    @NotNull
    public final H7<RA> a(@NotNull View itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Object obj = this.d.get();
        Intrinsics.checkNotNullExpressionValue(obj, "viewModelProvider.get()");
        C5454n9 c5454n9 = (C5454n9) obj;
        Object obj2 = this.f.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "markwonProvider.get()");
        return new C5031l9(itemView, this.c, c5454n9, this.e, (AbstractC3587eX0) obj2);
    }
}
