package defpackage;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class UY1 extends J70 {
    @Override // defpackage.J70, defpackage.QY0
    @NotNull
    public final Set<C5638o21> a() {
        throw new IllegalStateException();
    }

    @Override // defpackage.J70, defpackage.QY0
    public final /* bridge */ /* synthetic */ Collection b(C5638o21 c5638o21, S41 s41) {
        b(c5638o21, s41);
        throw null;
    }

    @Override // defpackage.J70, defpackage.QY0
    @NotNull
    public final Set<C5638o21> c() {
        throw new IllegalStateException();
    }

    @Override // defpackage.J70, defpackage.QY0
    public final /* bridge */ /* synthetic */ Collection d(C5638o21 c5638o21, JT0 jt0) {
        d(c5638o21, (S41) jt0);
        throw null;
    }

    @Override // defpackage.J70, defpackage.InterfaceC2602Zs1
    @NotNull
    public final Collection<InterfaceC4675jU> e(@NotNull LY kindFilter, @NotNull Function1<? super C5638o21, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        throw new IllegalStateException(this.b);
    }

    @Override // defpackage.J70, defpackage.InterfaceC2602Zs1
    @NotNull
    public final InterfaceC5044lD f(@NotNull C5638o21 name, @NotNull JT0 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(this.b + ", required name: " + name);
    }

    @Override // defpackage.J70, defpackage.QY0
    @NotNull
    public final Set<C5638o21> g() {
        throw new IllegalStateException();
    }

    @Override // defpackage.J70
    @NotNull
    /* JADX INFO: renamed from: h */
    public final Set d(@NotNull C5638o21 name, @NotNull S41 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(this.b + ", required name: " + name);
    }

    @Override // defpackage.J70
    @NotNull
    /* JADX INFO: renamed from: i */
    public final Set b(@NotNull C5638o21 name, @NotNull S41 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(this.b + ", required name: " + name);
    }

    @Override // defpackage.J70
    @NotNull
    public final String toString() {
        return C1039Gc0.e(new StringBuilder("ThrowingScope{"), this.b, '}');
    }
}
