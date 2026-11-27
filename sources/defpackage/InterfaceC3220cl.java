package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3220cl {

    /* JADX INFO: renamed from: cl$a */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC3220cl interfaceC3220cl, EnumC4737jl enumC4737jl, String str, JX1 jx1, int i) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                jx1 = null;
            }
            interfaceC3220cl.c(enumC4737jl, str, jx1);
        }
    }

    void b(@NotNull String str, @NotNull String str2);

    void c(@NotNull EnumC4737jl enumC4737jl, @Nullable String str, @Nullable JX1 jx1);

    @NotNull
    InterfaceC5790ol d(@NotNull String str);

    @NotNull
    String getId();
}
