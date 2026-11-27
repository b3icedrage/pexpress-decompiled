package androidx.lifecycle;

import defpackage.OC1;
import defpackage.Qd2;
import defpackage.Vd2;
import defpackage.Wd2;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/f$a;", "Landroidx/savedstate/a$a;", "<init>", "()V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements androidx.savedstate.a.InterfaceC0240a {
        @Override // androidx.savedstate.a.InterfaceC0240a
        public final void a(@NotNull OC1 owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (!(owner instanceof Wd2)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            Vd2 viewModelStore = ((Wd2) owner).getViewModelStore();
            androidx.savedstate.a savedStateRegistry = owner.getSavedStateRegistry();
            viewModelStore.getClass();
            LinkedHashMap linkedHashMap = viewModelStore.a;
            for (String key : new HashSet(linkedHashMap.keySet())) {
                Intrinsics.checkNotNullParameter(key, "key");
                Qd2 qd2 = (Qd2) linkedHashMap.get(key);
                Intrinsics.checkNotNull(qd2);
                f.a(qd2, savedStateRegistry, owner.getLifecycle());
            }
            if (new HashSet(linkedHashMap.keySet()).isEmpty()) {
                return;
            }
            savedStateRegistry.d();
        }
    }

    public static final void a(@NotNull Qd2 viewModel, @NotNull androidx.savedstate.a registry, @NotNull g lifecycle) {
        Object obj;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        HashMap map = viewModel.a;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = viewModel.a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.g) {
            return;
        }
        savedStateHandleController.a(lifecycle, registry);
        g.b bVarB = lifecycle.b();
        if (bVarB == g.b.e || bVarB.b(g.b.h)) {
            registry.d();
        } else {
            lifecycle.a(new LegacySavedStateHandleController$tryToAddRecreator$1(lifecycle, registry));
        }
    }
}
