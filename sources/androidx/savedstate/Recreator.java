package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.k;
import defpackage.C1039Gc0;
import defpackage.C5491nL;
import defpackage.FP0;
import defpackage.OC1;
import defpackage.R51;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/k;", R51.PUSH_ADDITIONAL_DATA_KEY, "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Recreator implements k {

    @NotNull
    public final OC1 d;

    public static final class a implements androidx.savedstate.a.b {

        @NotNull
        public final LinkedHashSet a;

        public a(@NotNull androidx.savedstate.a registry) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            this.a = new LinkedHashSet();
            registry.c("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.a.b
        @NotNull
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
            return bundle;
        }
    }

    public Recreator(@NotNull OC1 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.d = owner;
    }

    @Override // androidx.lifecycle.k
    public final void b(@NotNull FP0 source, @NotNull g.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != g.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().c(this);
        OC1 oc1 = this.d;
        Bundle bundleA = oc1.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(androidx.savedstate.a.InterfaceC0240a.class);
                Intrinsics.checkNotNullExpressionValue(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                        Intrinsics.checkNotNullExpressionValue(objNewInstance, "{\n                constr…wInstance()\n            }");
                        ((androidx.savedstate.a.InterfaceC0240a) objNewInstance).a(oc1);
                    } catch (Exception e) {
                        throw new RuntimeException(C5491nL.c("Failed to instantiate ", str), e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(C1039Gc0.d("Class ", str, " wasn't found"), e3);
            }
        }
    }
}
