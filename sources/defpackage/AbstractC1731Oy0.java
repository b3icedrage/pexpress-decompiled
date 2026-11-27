package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Oy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1731Oy0 {

    @NotNull
    public final C1491Lx0 a;

    /* JADX INFO: renamed from: Oy0$a */
    public static final class a extends AbstractC1731Oy0 {
    }

    /* JADX INFO: renamed from: Oy0$b */
    public static final class b extends AbstractC1731Oy0 {
    }

    /* JADX INFO: renamed from: Oy0$c */
    public static final class c extends AbstractC1731Oy0 {
    }

    /* JADX INFO: renamed from: Oy0$d */
    public static final class d extends AbstractC1731Oy0 {
        public final boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z, @NotNull C1491Lx0 indicator) {
            super(indicator);
            Intrinsics.checkNotNullParameter(indicator, "indicator");
            this.b = z;
        }
    }

    public AbstractC1731Oy0(C1491Lx0 c1491Lx0) {
        this.a = c1491Lx0;
    }
}
