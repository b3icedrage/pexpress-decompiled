package defpackage;

import android.os.Bundle;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class KC1 implements androidx.savedstate.a.b {

    @NotNull
    public final androidx.savedstate.a a;
    public boolean b;

    @Nullable
    public Bundle c;

    @NotNull
    public final KW1 d;

    public static final class a extends ML0 implements Function0<LC1> {
        public final /* synthetic */ Wd2 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Wd2 wd2) {
            super(0);
            this.d = wd2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LC1 invoke() {
            return s.c(this.d);
        }
    }

    public KC1(@NotNull androidx.savedstate.a savedStateRegistry, @NotNull Wd2 viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.a = savedStateRegistry;
        this.d = XO0.b(new a(viewModelStoreOwner));
    }

    @Override // androidx.savedstate.a.b
    @NotNull
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((LC1) this.d.getValue()).d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((r) entry.getValue()).e.a();
            if (!Intrinsics.a(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundle;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleA = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleA != null) {
            bundle.putAll(bundleA);
        }
        this.c = bundle;
        this.b = true;
    }
}
