package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4929kg1 {

    @Nullable
    public final C7755y62 a;

    @NotNull
    public final List<C7755y62> b;

    @Nullable
    public final String c;

    @Nullable
    public final C4929kg1 d;

    public C4929kg1(@Nullable C7755y62 c7755y62, @NotNull List<C7755y62> parametersInfo, @Nullable String str) {
        Intrinsics.checkNotNullParameter(parametersInfo, "parametersInfo");
        this.a = c7755y62;
        this.b = parametersInfo;
        this.c = str;
        C4929kg1 c4929kg1 = null;
        if (str != null) {
            C7755y62 c7755y62A = c7755y62 != null ? c7755y62.a() : null;
            ArrayList arrayList = new ArrayList(XE.m(parametersInfo, 10));
            for (C7755y62 c7755y63 : parametersInfo) {
                arrayList.add(c7755y63 != null ? c7755y63.a() : null);
            }
            c4929kg1 = new C4929kg1(c7755y62A, arrayList, null);
        }
        this.d = c4929kg1;
    }

    public C4929kg1() {
        this(null, C5653o60.d, null);
    }
}
