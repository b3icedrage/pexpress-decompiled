package defpackage;

import java.io.InputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: sV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6570sV {

    @NotNull
    public static final Set<RI0<?>> a;

    static {
        RI0[] elements = {C2017Sp1.a.b(InputStream.class)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(OW0.a(1));
        C1526Mj.D(elements, linkedHashSet);
        a = linkedHashSet;
    }
}
