package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.api.core.BaseFragment;
import com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: gS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3991gS extends i {

    @NotNull
    public final Map<Class<? extends BaseFragment>, InterfaceC1531Mk1<BaseFragment>> b;

    @NotNull
    public final Map<Class<? extends AbstractBottomSheetDialogFragment>, InterfaceC1531Mk1<AbstractBottomSheetDialogFragment>> c;

    public C3991gS(@NotNull Map<Class<? extends BaseFragment>, InterfaceC1531Mk1<BaseFragment>> providers, @NotNull Map<Class<? extends AbstractBottomSheetDialogFragment>, InterfaceC1531Mk1<AbstractBottomSheetDialogFragment>> dialogProviders) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(dialogProviders, "dialogProviders");
        this.b = providers;
        this.c = dialogProviders;
    }

    @Override // androidx.fragment.app.i
    @NotNull
    public final Fragment a(@NotNull ClassLoader classLoader, @NotNull String className) {
        BaseFragment baseFragment;
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        Intrinsics.checkNotNullParameter(className, "className");
        Class<? extends Fragment> clsC = i.c(classLoader, className);
        Intrinsics.checkNotNullExpressionValue(clsC, "loadFragmentClass(...)");
        InterfaceC1531Mk1<BaseFragment> interfaceC1531Mk1 = this.b.get(clsC);
        if (interfaceC1531Mk1 == null) {
            interfaceC1531Mk1 = (InterfaceC1531Mk1) this.c.get(clsC);
        }
        if (interfaceC1531Mk1 != null && (baseFragment = interfaceC1531Mk1.get()) != null) {
            return baseFragment;
        }
        Fragment fragmentA = super.a(classLoader, className);
        Intrinsics.checkNotNullExpressionValue(fragmentA, "instantiate(...)");
        return fragmentA;
    }
}
