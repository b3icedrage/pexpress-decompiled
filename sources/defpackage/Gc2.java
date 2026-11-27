package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Gc2 {

    @NotNull
    public static final Set<String> a;

    static {
        List<String> list = C1159Hq0.a;
        String[] elements = {"Date", "Expires", "Last-Modified", "If-Modified-Since", "If-Unmodified-Since"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        a = C1526Mj.H(elements);
    }
}
