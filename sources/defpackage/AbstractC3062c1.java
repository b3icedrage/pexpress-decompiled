package defpackage;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3062c1 implements QY0 {
    @Override // defpackage.QY0
    @NotNull
    public final Set<C5638o21> a() {
        return i().a();
    }

    @Override // defpackage.QY0
    @NotNull
    public Collection b(@NotNull C5638o21 name, @NotNull S41 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return i().b(name, location);
    }

    @Override // defpackage.QY0
    @NotNull
    public final Set<C5638o21> c() {
        return i().c();
    }

    @Override // defpackage.QY0
    @NotNull
    public Collection<InterfaceC3765fM1> d(@NotNull C5638o21 name, @NotNull JT0 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return i().d(name, location);
    }

    @Override // defpackage.InterfaceC2602Zs1
    @NotNull
    public Collection<InterfaceC4675jU> e(@NotNull LY kindFilter, @NotNull Function1<? super C5638o21, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return i().e(kindFilter, nameFilter);
    }

    @Override // defpackage.InterfaceC2602Zs1
    @Nullable
    public final InterfaceC5044lD f(@NotNull C5638o21 name, @NotNull JT0 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return i().f(name, location);
    }

    @Override // defpackage.QY0
    @Nullable
    public final Set<C5638o21> g() {
        return i().g();
    }

    @NotNull
    public final QY0 h() {
        if (!(i() instanceof AbstractC3062c1)) {
            return i();
        }
        QY0 qy0I = i();
        Intrinsics.c(qy0I, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((AbstractC3062c1) qy0I).h();
    }

    @NotNull
    public abstract QY0 i();
}
