package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: vQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7186vQ0<E> extends SE<E, Set<? extends E>, LinkedHashSet<E>> {

    @NotNull
    public final C1462Ln0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7186vQ0(@NotNull RJ0<E> eSerializer) {
        super(eSerializer);
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        MH1 elementDesc = eSerializer.c();
        Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
        this.b = new C1462Ln0(elementDesc, 1);
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return this.b;
    }

    @Override // defpackage.Z
    public final Object e() {
        return new LinkedHashSet();
    }

    @Override // defpackage.Z
    public final int f(Object obj) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    @Override // defpackage.Z
    public final Object k(Object obj) {
        Intrinsics.checkNotNullParameter(null, "<this>");
        return new LinkedHashSet((Collection) null);
    }

    @Override // defpackage.Z
    public final Object l(Object obj) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        return linkedHashSet;
    }

    @Override // defpackage.RE
    public final void m(int i, Object obj, Object obj2) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        linkedHashSet.add(obj2);
    }
}
