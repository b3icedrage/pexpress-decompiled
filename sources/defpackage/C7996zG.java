package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: zG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7996zG {

    @NotNull
    public static final C7996zG a = new C7996zG();

    @NotNull
    public static final LinkedHashSet b;

    static {
        Set<EnumC6405rh1> set = EnumC6405rh1.i;
        ArrayList arrayList = new ArrayList(XE.m(set, 10));
        for (EnumC6405rh1 primitiveType : set) {
            Intrinsics.checkNotNullParameter(primitiveType, "primitiveType");
            C1758Ph0 c1758Ph0C = C4194hP1.l.c(primitiveType.d);
            Intrinsics.checkNotNullExpressionValue(c1758Ph0C, "child(...)");
            arrayList.add(c1758Ph0C);
        }
        ArrayList<C1758Ph0> arrayListR = CollectionsKt.R(CollectionsKt.R(CollectionsKt.R(arrayList, C4194hP1.a.f.g()), C4194hP1.a.h.g()), C4194hP1.a.j.g());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C1758Ph0 topLevelFqName : arrayListR) {
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            C1758Ph0 c1758Ph0E = topLevelFqName.e();
            linkedHashSet.add(new QC(c1758Ph0E, SI0.a(c1758Ph0E, "parent(...)", topLevelFqName, "shortName(...)")));
        }
        b = linkedHashSet;
    }
}
