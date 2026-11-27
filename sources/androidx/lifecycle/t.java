package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import defpackage.C1580Nb;
import defpackage.OC1;
import defpackage.PC1;
import defpackage.Qd2;
import defpackage.U11;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class t extends x.d implements x.b {

    @Nullable
    public final Application a;

    @NotNull
    public final x.a b;

    @Nullable
    public final Bundle c;

    @Nullable
    public final g d;

    @Nullable
    public final androidx.savedstate.a e;

    @SuppressLint({"LambdaLast"})
    public t(@Nullable Application application, @NotNull OC1 owner, @Nullable Bundle bundle) {
        x.a aVar;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.e = owner.getSavedStateRegistry();
        this.d = owner.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            Intrinsics.checkNotNullParameter(application, "application");
            if (x.a.c == null) {
                Intrinsics.checkNotNullParameter(application, "application");
                x.a.c = new x.a(application);
            }
            aVar = x.a.c;
            Intrinsics.checkNotNull(aVar);
        } else {
            aVar = new x.a(null);
        }
        this.b = aVar;
    }

    @Override // androidx.lifecycle.x.b
    @NotNull
    public final <T extends Qd2> T a(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) d(modelClass, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.x.b
    @NotNull
    public final Qd2 b(@NotNull Class modelClass, @NotNull U11 extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.a(y.a);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(s.a) == null || extras.a(s.b) == null) {
            if (this.d != null) {
                return d(modelClass, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(w.a);
        boolean zIsAssignableFrom = C1580Nb.class.isAssignableFrom(modelClass);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? PC1.a(modelClass, PC1.b) : PC1.a(modelClass, PC1.a);
        if (constructorA == null) {
            return this.b.b(modelClass, extras);
        }
        return (!zIsAssignableFrom || application == null) ? PC1.b(modelClass, constructorA, s.a(extras)) : PC1.b(modelClass, constructorA, application, s.a(extras));
    }

    @Override // androidx.lifecycle.x.d
    public final void c(@NotNull Qd2 viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        g gVar = this.d;
        if (gVar != null) {
            androidx.savedstate.a aVar = this.e;
            Intrinsics.checkNotNull(aVar);
            Intrinsics.checkNotNull(gVar);
            f.a(viewModel, aVar, gVar);
        }
    }

    @NotNull
    public final Qd2 d(@NotNull Class modelClass, @NotNull String key) {
        Qd2 qd2B;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        g lifecycle = this.d;
        if (lifecycle == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = C1580Nb.class.isAssignableFrom(modelClass);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? PC1.a(modelClass, PC1.b) : PC1.a(modelClass, PC1.a);
        if (constructorA == null) {
            if (application != null) {
                return this.b.a(modelClass);
            }
            if (x.c.a == null) {
                x.c.a = new x.c();
            }
            x.c cVar = x.c.a;
            Intrinsics.checkNotNull(cVar);
            return cVar.a(modelClass);
        }
        androidx.savedstate.a registry = this.e;
        Intrinsics.checkNotNull(registry);
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNull(key);
        Bundle bundleA = registry.a(key);
        Class<? extends Object>[] clsArr = r.f;
        r rVarA = r.a.a(bundleA, this.c);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(key, rVarA);
        savedStateHandleController.a(lifecycle, registry);
        g.b bVarB = lifecycle.b();
        if (bVarB == g.b.e || bVarB.b(g.b.h)) {
            registry.d();
        } else {
            lifecycle.a(new LegacySavedStateHandleController$tryToAddRecreator$1(lifecycle, registry));
        }
        if (!zIsAssignableFrom || application == null) {
            qd2B = PC1.b(modelClass, constructorA, rVarA);
        } else {
            Intrinsics.checkNotNull(application);
            qd2B = PC1.b(modelClass, constructorA, application, rVarA);
        }
        qd2B.i(savedStateHandleController, "androidx.lifecycle.savedstate.vm.tag");
        return qd2B;
    }
}
