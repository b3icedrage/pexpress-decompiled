package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ab1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2749ab1 implements InterfaceC2973bb1 {

    @NotNull
    public final ArrayList a;

    public C2749ab1(@NotNull ArrayList packageFragments) {
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        this.a = packageFragments;
    }

    @Override // defpackage.InterfaceC2548Za1
    @NotNull
    public final List<InterfaceC2392Xa1> a(@NotNull C1758Ph0 fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (Intrinsics.a(((InterfaceC2392Xa1) obj).c(), fqName)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // defpackage.InterfaceC2973bb1
    public final boolean b(@NotNull C1758Ph0 fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (Intrinsics.a(((InterfaceC2392Xa1) it.next()).c(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC2973bb1
    public final void c(@NotNull C1758Ph0 fqName, @NotNull ArrayList packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        for (Object obj : this.a) {
            if (Intrinsics.a(((InterfaceC2392Xa1) obj).c(), fqName)) {
                packageFragments.add(obj);
            }
        }
    }

    @Override // defpackage.InterfaceC2548Za1
    @NotNull
    public final Collection<C1758Ph0> o(@NotNull C1758Ph0 fqName, @NotNull Function1<? super C5638o21, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return JH1.p(JH1.h(JH1.m(CollectionsKt.y(this.a), RB.g), new C3944gC0(fqName, 1)));
    }
}
