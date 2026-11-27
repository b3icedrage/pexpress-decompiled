package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class FI1 {

    @NotNull
    public final String a;

    public static final class a extends FI1 {

        @NotNull
        public static final a b = new a("insufficient_funds");
    }

    public static final class b extends FI1 {

        @NotNull
        public static final b b = new b("limit_open_trades");
    }

    public static final class c extends FI1 {

        @NotNull
        public static final c b = new c("logout");
    }

    public static final class d extends FI1 {

        @NotNull
        public static final d b = new d("loss_limit_stopped");
    }

    public static final class e extends FI1 {

        @NotNull
        public static final e b = new e("max_demo_trades");
    }

    public static final class f extends FI1 {

        @NotNull
        public static final f b = new f("max_profit_earned");
    }

    public static final class g extends FI1 {

        @NotNull
        public static final g b = new g("network");
    }

    public static final class h extends FI1 {

        @Nullable
        public final Throwable b;
        public final boolean c;

        @Nullable
        public final String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(@NotNull String reason, @Nullable Throwable th, boolean z, @Nullable String str) {
            super(reason.length() == 0 ? "unexpected" : reason);
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.b = th;
            this.c = z;
            this.d = str;
        }
    }

    public static final class i extends FI1 {

        @NotNull
        public static final i b = new i("user_stopped");
    }

    public static final class j extends FI1 {

        @NotNull
        public static final j b = new j("verification_required");
    }

    public FI1(String str) {
        this.a = str;
    }
}
