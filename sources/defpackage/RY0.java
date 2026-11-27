package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RY0 implements QY0 {
    @Override // defpackage.QY0
    @NotNull
    public Set<C5638o21> a() {
        Collection<InterfaceC4675jU> collectionE = e(LY.p, C3846fk0.e);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionE) {
            if (obj instanceof InterfaceC3765fM1) {
                C5638o21 name = ((InterfaceC3765fM1) obj).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // defpackage.QY0
    @NotNull
    public Collection b(@NotNull C5638o21 name, @NotNull S41 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return C5653o60.d;
    }

    @Override // defpackage.QY0
    @NotNull
    public Set<C5638o21> c() {
        Collection<InterfaceC4675jU> collectionE = e(LY.q, C3846fk0.e);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionE) {
            if (obj instanceof InterfaceC3765fM1) {
                C5638o21 name = ((InterfaceC3765fM1) obj).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // defpackage.QY0
    @NotNull
    public Collection<? extends InterfaceC3765fM1> d(@NotNull C5638o21 name, @NotNull JT0 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return C5653o60.d;
    }

    @Override // defpackage.InterfaceC2602Zs1
    @NotNull
    public Collection<InterfaceC4675jU> e(@NotNull LY kindFilter, @NotNull Function1<? super C5638o21, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return C5653o60.d;
    }

    @Override // defpackage.InterfaceC2602Zs1
    @Nullable
    public InterfaceC5044lD f(@NotNull C5638o21 name, @NotNull JT0 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return null;
    }

    @Override // defpackage.QY0
    @Nullable
    public Set<C5638o21> g() {
        return null;
    }
}
