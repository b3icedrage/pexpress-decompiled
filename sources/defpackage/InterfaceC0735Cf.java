package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Cf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0735Cf {

    /* JADX INFO: renamed from: Cf$a */
    public static final class a {
        public static boolean a(@NotNull InterfaceC0735Cf interfaceC0735Cf, @NotNull InterfaceC0735Cf updater) {
            Intrinsics.checkNotNullParameter(updater, "updater");
            return interfaceC0735Cf == updater;
        }
    }

    boolean a(@NotNull InterfaceC0735Cf interfaceC0735Cf);

    @Nullable
    Object b(@NotNull LM lm);

    boolean c();

    void stop();
}
