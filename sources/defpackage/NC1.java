package defpackage;

import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.k;
import androidx.savedstate.Recreator;
import androidx.savedstate.a;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class NC1 {

    @NotNull
    public final OC1 a;

    @NotNull
    public final a b = new a();
    public boolean c;

    public NC1(OC1 oc1) {
        this.a = oc1;
    }

    public final void a() {
        OC1 oc1 = this.a;
        g lifecycle = oc1.getLifecycle();
        if (lifecycle.b() != g.b.e) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new Recreator(oc1));
        final a aVar = this.b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (aVar.b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new k() { // from class: MC1
            @Override // androidx.lifecycle.k
            public final void b(FP0 fp0, g.a event) {
                a this$0 = aVar;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(fp0, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == g.a.ON_START) {
                    this$0.f = true;
                } else if (event == g.a.ON_STOP) {
                    this$0.f = false;
                }
            }
        });
        aVar.b = true;
        this.c = true;
    }

    public final void b(@Nullable Bundle bundle) {
        if (!this.c) {
            a();
        }
        g lifecycle = this.a.getLifecycle();
        if (lifecycle.b().b(g.b.h)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
        }
        a aVar = this.b;
        if (!aVar.b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (aVar.d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        aVar.c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        aVar.d = true;
    }

    public final void c(@NotNull Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        a aVar = this.b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = aVar.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        C3945gC1<String, a.b> c3945gC1 = aVar.a;
        c3945gC1.getClass();
        C3945gC1.d dVar = new C3945gC1.d();
        c3945gC1.g.put(dVar, Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(dVar, "this.components.iteratorWithAdditions()");
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle.putBundle((String) entry.getKey(), ((a.b) entry.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }
}
