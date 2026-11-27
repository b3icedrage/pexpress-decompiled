package defpackage;

import androidx.recyclerview.widget.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: t10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6682t10 extends p.e<UL0> {
    @Override // androidx.recyclerview.widget.p.e
    public final boolean a(UL0 ul0, UL0 ul1) {
        UL0 oldItem = ul0;
        UL0 newItem = ul1;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.m == newItem.m;
    }

    @Override // androidx.recyclerview.widget.p.e
    public final boolean b(UL0 ul0, UL0 ul1) {
        UL0 oldItem = ul0;
        UL0 newItem = ul1;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.g, newItem.g);
    }
}
