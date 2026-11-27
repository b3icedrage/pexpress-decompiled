package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class IB {
    public final boolean a;

    public static final class a extends IB {

        @NotNull
        public static final a b = new a(false);
    }

    public static final class b extends IB {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String error) {
            super(false);
            Intrinsics.checkNotNullParameter(error, "error");
        }
    }

    public static final class c extends IB {

        @NotNull
        public static final c b = new c(true);
    }

    public IB(boolean z) {
        this.a = z;
    }
}
