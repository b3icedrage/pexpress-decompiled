package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: sO1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6551sO1 {

    @NotNull
    public static final LinkedHashSet a;

    @NotNull
    public static final QC b;

    static {
        List<C1758Ph0> listF = WE.f(C3333dI0.a, C3333dI0.h, C3333dI0.i, C3333dI0.c, C3333dI0.d, C3333dI0.f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C1758Ph0 topLevelFqName : listF) {
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            C1758Ph0 c1758Ph0E = topLevelFqName.e();
            linkedHashSet.add(new QC(c1758Ph0E, SI0.a(c1758Ph0E, "parent(...)", topLevelFqName, "shortName(...)")));
        }
        a = linkedHashSet;
        C1758Ph0 topLevelFqName2 = C3333dI0.g;
        Intrinsics.checkNotNullExpressionValue(topLevelFqName2, "REPEATABLE_ANNOTATION");
        Intrinsics.checkNotNullParameter(topLevelFqName2, "topLevelFqName");
        C1758Ph0 c1758Ph0E2 = topLevelFqName2.e();
        b = new QC(c1758Ph0E2, SI0.a(c1758Ph0E2, "parent(...)", topLevelFqName2, "shortName(...)"));
    }
}
