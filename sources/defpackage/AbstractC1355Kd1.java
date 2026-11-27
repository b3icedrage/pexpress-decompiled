package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Kd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1355Kd1 {

    /* JADX INFO: renamed from: Kd1$a */
    public static final class a extends AbstractC1355Kd1 {

        @NotNull
        public final C1277Jd1 a;

        public a(@NotNull C1277Jd1 relativeTo) {
            Intrinsics.checkNotNullParameter(relativeTo, "relativeTo");
            this.a = relativeTo;
        }
    }

    /* JADX INFO: renamed from: Kd1$b */
    public static final class b extends AbstractC1355Kd1 {
    }

    /* JADX INFO: renamed from: Kd1$c */
    public static final class c extends AbstractC1355Kd1 {

        @NotNull
        public static final c a = new c();
    }
}
