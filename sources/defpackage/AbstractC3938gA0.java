package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.api.resources.IndicatorRadioGroup;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: gA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3938gA0 implements InterfaceC3728fA0 {
    @Override // defpackage.InterfaceC3728fA0
    public final void a(@NotNull IndicatorRadioGroup group, @NotNull List<C2098Tq1> currencies, @NotNull Function1<? super C2098Tq1, Unit> onCurrencyChecked) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(onCurrencyChecked, "onCurrencyChecked");
        Object parent = group.getParent();
        Intrinsics.c(parent, "null cannot be cast to non-null type android.view.View");
        ((View) parent).setPadding(0, 0, 0, 0);
        ViewGroup.LayoutParams layoutParams = group.getLayoutParams();
        layoutParams.height = 0;
        group.setLayoutParams(layoutParams);
    }
}
