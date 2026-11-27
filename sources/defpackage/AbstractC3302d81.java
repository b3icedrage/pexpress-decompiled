package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: d81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3302d81<V> {
    public V a;

    public AbstractC3302d81() {
        throw null;
    }

    public void a(@NotNull IJ0 property) {
        Intrinsics.checkNotNullParameter(property, "property");
    }

    public final Object b(@NotNull IJ0 property, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(@NotNull IJ0 property, Object obj) {
        Intrinsics.checkNotNullParameter(property, "property");
        a(property);
        this.a = obj;
        Intrinsics.checkNotNullParameter(property, "property");
    }

    @NotNull
    public final String toString() {
        return "ObservableProperty(value=" + this.a + ')';
    }
}
