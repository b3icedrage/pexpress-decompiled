package androidx.lifecycle;

import android.os.Bundle;
import defpackage.C2017Sp1;
import defpackage.C6298rA0;
import defpackage.C7279vr;
import defpackage.KC1;
import defpackage.LC1;
import defpackage.ML0;
import defpackage.OC1;
import defpackage.RI0;
import defpackage.Td2;
import defpackage.U11;
import defpackage.VP;
import defpackage.Wd2;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    @NotNull
    public static final b a = new b();

    @NotNull
    public static final c b = new c();

    @NotNull
    public static final a c = new a();

    public static final class a implements VP.b<Bundle> {
    }

    public static final class b implements VP.b<OC1> {
    }

    public static final class c implements VP.b<Wd2> {
    }

    public static final class d extends ML0 implements Function1<VP, LC1> {
        public static final d d = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final LC1 invoke(VP vp) {
            VP initializer = vp;
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return new LC1();
        }
    }

    @NotNull
    public static final r a(@NotNull U11 u11) {
        Intrinsics.checkNotNullParameter(u11, "<this>");
        OC1 oc1 = (OC1) u11.a(a);
        if (oc1 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        Wd2 wd2 = (Wd2) u11.a(b);
        if (wd2 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) u11.a(c);
        String key = (String) u11.a(y.a);
        if (key == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        Intrinsics.checkNotNullParameter(oc1, "<this>");
        androidx.savedstate.a.b bVarB = oc1.getSavedStateRegistry().b();
        KC1 kc1 = bVarB instanceof KC1 ? (KC1) bVarB : null;
        if (kc1 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LC1 lc1C = c(wd2);
        r rVar = (r) lc1C.d.get(key);
        if (rVar != null) {
            return rVar;
        }
        Class<? extends Object>[] clsArr = r.f;
        Intrinsics.checkNotNullParameter(key, "key");
        kc1.b();
        Bundle bundle2 = kc1.c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(key) : null;
        Bundle bundle4 = kc1.c;
        if (bundle4 != null) {
            bundle4.remove(key);
        }
        Bundle bundle5 = kc1.c;
        if (bundle5 != null && bundle5.isEmpty()) {
            kc1.c = null;
        }
        r rVarA = r.a.a(bundle3, bundle);
        lc1C.d.put(key, rVarA);
        return rVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends OC1 & Wd2> void b(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        g.b bVarB = t.getLifecycle().b();
        if (bVarB != g.b.e && bVarB != g.b.g) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t.getSavedStateRegistry().b() == null) {
            KC1 kc1 = new KC1(t.getSavedStateRegistry(), t);
            t.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", kc1);
            t.getLifecycle().a(new SavedStateHandleAttacher(kc1));
        }
    }

    @NotNull
    public static final LC1 c(@NotNull Wd2 wd2) {
        Intrinsics.checkNotNullParameter(wd2, "<this>");
        ArrayList arrayList = new ArrayList();
        RI0 clazz = C2017Sp1.a.b(LC1.class);
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        d initializer = d.d;
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        arrayList.add(new Td2(C7279vr.g(clazz), initializer));
        Td2[] td2Arr = (Td2[]) arrayList.toArray(new Td2[0]);
        return (LC1) new x(wd2, new C6298rA0((Td2[]) Arrays.copyOf(td2Arr, td2Arr.length))).b(LC1.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
