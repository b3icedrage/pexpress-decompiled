package defpackage;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Zs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2602Zs1 {

    /* JADX INFO: renamed from: Zs1$a */
    public static final class a {
        public static /* synthetic */ Collection a(InterfaceC2602Zs1 interfaceC2602Zs1, LY ly, int i) {
            if ((i & 1) != 0) {
                ly = LY.m;
            }
            QY0.a.getClass();
            return interfaceC2602Zs1.e(ly, QY.g);
        }
    }

    @NotNull
    Collection<InterfaceC4675jU> e(@NotNull LY ly, @NotNull Function1<? super C5638o21, Boolean> function1);

    @Nullable
    InterfaceC5044lD f(@NotNull C5638o21 c5638o21, @NotNull JT0 jt0);
}
