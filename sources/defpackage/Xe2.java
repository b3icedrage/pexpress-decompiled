package defpackage;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Xe2 {

    @NotNull
    public static final C5315mW0 a;

    public static final class a extends AbstractC2766af2 {

        @NotNull
        public static final a c = new a("inherited", false);
    }

    public static final class b extends AbstractC2766af2 {

        @NotNull
        public static final b c = new b("internal", false);
    }

    public static final class c extends AbstractC2766af2 {

        @NotNull
        public static final c c = new c("invisible_fake", false);
    }

    public static final class d extends AbstractC2766af2 {

        @NotNull
        public static final d c = new d(ImagesContract.LOCAL, false);
    }

    public static final class e extends AbstractC2766af2 {

        @NotNull
        public static final e c = new e("private", false);
    }

    public static final class f extends AbstractC2766af2 {

        @NotNull
        public static final f c = new f("private_to_this", false);

        @Override // defpackage.AbstractC2766af2
        @NotNull
        public final String b() {
            return "private/*private to this*/";
        }
    }

    public static final class g extends AbstractC2766af2 {

        @NotNull
        public static final g c = new g("protected", true);
    }

    public static final class h extends AbstractC2766af2 {

        @NotNull
        public static final h c = new h("public", true);
    }

    public static final class i extends AbstractC2766af2 {

        @NotNull
        public static final i c = new i("unknown", false);
    }

    static {
        C5315mW0 builder = new C5315mW0();
        builder.put(f.c, 0);
        builder.put(e.c, 0);
        builder.put(b.c, 1);
        builder.put(g.c, 1);
        builder.put(h.c, 2);
        Intrinsics.checkNotNullParameter(builder, "builder");
        a = builder.c();
    }
}
