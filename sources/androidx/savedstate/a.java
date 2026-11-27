package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.f;
import defpackage.C3945gC1;
import defpackage.OC1;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public final class a {
    public boolean b;

    @Nullable
    public Bundle c;
    public boolean d;

    @Nullable
    public Recreator.a e;

    @NotNull
    public final C3945gC1<String, b> a = new C3945gC1<>();
    public boolean f = true;

    /* JADX INFO: renamed from: androidx.savedstate.a$a, reason: collision with other inner class name */
    public interface InterfaceC0240a {
        void a(@NotNull OC1 oc1);
    }

    public interface b {
        @NotNull
        Bundle a();
    }

    @Nullable
    public final Bundle a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(key);
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.c = null;
        return bundle2;
    }

    @Nullable
    public final b b() {
        String str;
        b bVar;
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesProvider", "key");
        Iterator<Map.Entry<String, b>> it = this.a.iterator();
        do {
            C3945gC1.e eVar = (C3945gC1.e) it;
            if (!eVar.hasNext()) {
                return null;
            }
            Map.Entry components = (Map.Entry) eVar.next();
            Intrinsics.checkNotNullExpressionValue(components, "components");
            str = (String) components.getKey();
            bVar = (b) components.getValue();
        } while (!Intrinsics.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return bVar;
    }

    public final void c(@NotNull String key, @NotNull b provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (this.a.b(key, provider) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        Intrinsics.checkNotNullParameter(f.a.class, "clazz");
        if (!this.f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        Recreator.a aVar = this.e;
        if (aVar == null) {
            aVar = new Recreator.a(this);
        }
        this.e = aVar;
        try {
            f.a.class.getDeclaredConstructor(new Class[0]);
            Recreator.a aVar2 = this.e;
            if (aVar2 != null) {
                String className = f.a.class.getName();
                Intrinsics.checkNotNullExpressionValue(className, "clazz.name");
                Intrinsics.checkNotNullParameter(className, "className");
                aVar2.a.add(className);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + f.a.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
