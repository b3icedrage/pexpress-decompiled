package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7559xA0 extends RY0 {

    @NotNull
    public final QY0 b;

    public C7559xA0(@NotNull QY0 workerScope) {
        Intrinsics.checkNotNullParameter(workerScope, "workerScope");
        this.b = workerScope;
    }

    @Override // defpackage.RY0, defpackage.QY0
    @NotNull
    public final Set<C5638o21> a() {
        return this.b.a();
    }

    @Override // defpackage.RY0, defpackage.QY0
    @NotNull
    public final Set<C5638o21> c() {
        return this.b.c();
    }

    @Override // defpackage.RY0, defpackage.InterfaceC2602Zs1
    public final Collection e(LY kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        int i = LY.l & kindFilter.b;
        LY ly = i == 0 ? null : new LY(i, kindFilter.a);
        if (ly == null) {
            return C5653o60.d;
        }
        Collection<InterfaceC4675jU> collectionE = this.b.e(ly, nameFilter);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionE) {
            if (obj instanceof InterfaceC5257mD) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.RY0, defpackage.InterfaceC2602Zs1
    @Nullable
    public final InterfaceC5044lD f(@NotNull C5638o21 name, @NotNull JT0 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        InterfaceC5044lD interfaceC5044lDF = this.b.f(name, location);
        if (interfaceC5044lDF != null) {
            FC fc = interfaceC5044lDF instanceof FC ? (FC) interfaceC5044lDF : null;
            if (fc != null) {
                return fc;
            }
            if (interfaceC5044lDF instanceof InterfaceC3714f62) {
                return (InterfaceC3714f62) interfaceC5044lDF;
            }
        }
        return null;
    }

    @Override // defpackage.RY0, defpackage.QY0
    @Nullable
    public final Set<C5638o21> g() {
        return this.b.g();
    }

    @NotNull
    public final String toString() {
        return "Classes from " + this.b;
    }
}
